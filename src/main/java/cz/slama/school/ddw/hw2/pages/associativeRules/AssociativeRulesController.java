package cz.slama.school.ddw.hw2.pages.associativeRules;

import cz.slama.school.ddw.hw2.generated.associativeRulesE.ObjectStream;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Controller
public class AssociativeRulesController {

  /**
   * show data for associative rules
   *
   * @param model model
   * @return view
   */
  @RequestMapping(value = {"/asocRules/list"}, method = RequestMethod.GET)
  public String interakceList(ModelMap model,
                              HttpServletRequest request) {

    try {
      File file= new File(request.getSession().getServletContext().getRealPath("/WEB-INF/resources/"), "associativeRules_edited.xml");
      JAXBContext jaxbContext = JAXBContext.newInstance(ObjectStream.class);
      Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

      // output pretty printed
      ObjectStream objectStream = (ObjectStream) jaxbUnmarshaller.unmarshal(file);
      objectStream.getAssociationrules();
      System.out.println(objectStream);
    }
    catch (JAXBException e) {
      e.printStackTrace();
    }

    return "tiles.associativeRules.list";
  }
}