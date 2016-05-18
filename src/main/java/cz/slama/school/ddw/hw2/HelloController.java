package cz.slama.school.ddw.hw2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

  @RequestMapping(method = RequestMethod.GET)
  public String printWelcome(ModelMap model) {
    model.addAttribute("message", "Hello world!");
    return "hello";
  }

  /**
   * show data for associative rules
   *
   * @param model model
   * @return view
   */
  @RequestMapping(value = {"/asocRules/list"}, method = RequestMethod.GET)
  public String interakceList(ModelMap model) {
    return "hello";
  }
}