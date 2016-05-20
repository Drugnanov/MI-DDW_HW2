package cz.slama.school.ddw.hw2.pages.AssocRulesData;

import cz.slama.school.ddw.hw2.data.Data;
import cz.slama.school.ddw.hw2.utils.FormatterUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

@Controller
public class AssocRulesDataController {

  private final static String MODEL_ASSOCIATIVE_RULES_DATA = "assocRulesData";
  private final static String MODEL_ASSOCIATIVE_RULES_SOURCE = "assocRulesSource";

  @Autowired
  private Data data;

  /**
   * show data for associative rules
   *
   * @param model model
   * @return view
   */
  @RequestMapping(value = {"/assocRulesData/detail"}, method = RequestMethod.GET)
  public String assocRulesDataList(ModelMap model) {
    String dataString;
    String dataSourceString;
    try {
      dataString = data.getData();
    }
    catch (IOException e) {
      dataString = "Cannot obtain data.";
    }
    String dataFormatted = FormatterUtil.indentXml(dataString);
    try {
      dataSourceString = data.getSource();
    }
    catch (IOException e) {
      dataSourceString = "Cannot obtain data.";
    }
    model.addAttribute(MODEL_ASSOCIATIVE_RULES_DATA, dataFormatted);
    model.addAttribute(MODEL_ASSOCIATIVE_RULES_SOURCE, dataSourceString);
    return "tiles.assocRulesData.list";
  }

  public void setData(Data data) {
    this.data = data;
  }
}