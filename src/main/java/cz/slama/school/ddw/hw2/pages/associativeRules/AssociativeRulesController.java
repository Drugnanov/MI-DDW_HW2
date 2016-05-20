package cz.slama.school.ddw.hw2.pages.associativeRules;

import cz.slama.school.ddw.hw2.data.Data;
import cz.slama.school.ddw.hw2.model.AssociationRuleForm;
import cz.slama.school.ddw.hw2.pages.common.model.datatables.DataTablesRequest;
import cz.slama.school.ddw.hw2.pages.common.model.datatables.DataTablesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class AssociativeRulesController {


  @Autowired
  private Data data;

  private final static String MODEL_ASSOCIATIVE_RULES_FORM = "associativeRulesForm";
  private final static String MODEL_ASSOCIATIVE_RULES_FILTER_FORM = "associativeRulesFilterForm";

  /**
   * show data for associative rules
   *
   * @param model model
   * @return view
   */
  @RequestMapping(value = {"/asocRules/list"}, method = RequestMethod.GET)
  public String asocRulesList(ModelMap model) {
    model.addAttribute(MODEL_ASSOCIATIVE_RULES_FILTER_FORM, new AssociativeRulesFilterForm());
    return "tiles.associativeRules.list";
  }

  /**
   * Data pro tabulku seznam aplikací daného subjektu.
   *
   * @param dataTablesRequest request odeslaný DataTables
   * @return JSON data
   */
  @RequestMapping(value = {
      "/asocRules/list/data/ajax"}, method = RequestMethod.POST, produces = "application/json; charset=utf-8")
  @ResponseBody
  public DataTablesResponse asocRulesListData(@ModelAttribute DataTablesRequest dataTablesRequest,
                                              @ModelAttribute(MODEL_ASSOCIATIVE_RULES_FILTER_FORM) AssociativeRulesFilterForm arfFrom) {
    // Stránkování
    int pageStartIndex = new BigDecimal(dataTablesRequest.getStart())
        .intValueExact(); // záznamy v DataTables indexovány od 0
    int pageLength = dataTablesRequest.getLength().intValue();
    //Ordering
    Integer orderBy = null;
    if (dataTablesRequest.getOrder() != null) {
      orderBy =
          Integer.valueOf(dataTablesRequest.getOrder().get(0).get(DataTablesRequest.DataTablesOrderEnum.column));
      String orderDir = dataTablesRequest.getOrder().get(0).get(DataTablesRequest.DataTablesOrderEnum.dir);
      if (orderDir.equals("desc"))
        orderBy = orderBy * -1;
    }

    // Načtení dat a sestavení odpovědi
    List<AssociationRuleForm> afrList = data.getAssociationRules();
    afrList = filter(afrList, arfFrom.getSearchString());
    if (orderBy != null) {
      if (orderBy == 4) {
        Collections.sort(afrList,
            (o1, o2) -> o1.getConclusionsString().compareTo(o2.getConclusionsString()));
      }
      else if (orderBy == -4) {
        Collections.sort(afrList,
            (o1, o2) -> o2.getConclusionsString().compareTo(o1.getConclusionsString()));
      }
      if (orderBy == 1) {
        Collections.sort(afrList,
            (o1, o2) -> o1.getAssociativeRuleId().compareTo(o2.getAssociativeRuleId()));
      }
      else if (orderBy == -1) {
        Collections.sort(afrList,
            (o1, o2) -> o2.getAssociativeRuleId().compareTo(o1.getAssociativeRuleId()));
      }
    }

    List<AssociationRuleForm> afrListSubList = new ArrayList<>();
    int length = Math.min(afrList.size() - pageStartIndex, pageLength);
    afrListSubList = new ArrayList<AssociationRuleForm>(afrList.subList(pageStartIndex, pageStartIndex + length));

    DataTablesResponse dataTablesResponse = new DataTablesResponse(dataTablesRequest.getDraw());
    dataTablesResponse.setRecordsTotal(Long.valueOf(afrList.size()));
    dataTablesResponse.setRecordsFiltered(Long.valueOf(afrList.size()));
    dataTablesResponse.setData(afrListSubList);
    return dataTablesResponse;
  }

  private List<AssociationRuleForm> filter(List<AssociationRuleForm> afrList, String searchString) {
    if (searchString == null || "".equals(searchString)) return afrList;
    afrList.removeIf(s -> !s.getConclusionsString().contains(searchString));
    //!s.getPremisesString().contains(searchString) &&
    return afrList;
  }

  public void setData(Data data) {
    this.data = data;
  }
}