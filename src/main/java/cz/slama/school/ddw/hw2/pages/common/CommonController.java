package cz.slama.school.ddw.hw2.pages.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerMapping;
import org.webjars.WebJarAssetLocator;

import javax.servlet.http.HttpServletRequest;

/**
 * Obecný controller.
 */
@Controller
public class CommonController {

  private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

  @Autowired
  private WebJarAssetLocator webJarAssetLocator;

  @RequestMapping(value = {"/"})
  public String welcome(ModelMap model) {
    return "tiles.common.welcome";
  }

  @ResponseBody
  @RequestMapping("/webjarslocator/{webjar}/**")
  public ResponseEntity locateWebjarAsset(@PathVariable String webjar, HttpServletRequest request) {
    try {
      String mvcPrefix = "/webjarslocator/" + webjar + "/"; // This prefix must match the mapping path!
      String mvcPath = (String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
      String fullPath = webJarAssetLocator.getFullPath(webjar, mvcPath.substring(mvcPrefix.length()));
      return new ResponseEntity<>(new ClassPathResource(fullPath), HttpStatus.OK);
    }
    catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  public void setWebJarAssetLocator(WebJarAssetLocator webJarAssetLocator) {
    this.webJarAssetLocator = webJarAssetLocator;
  }
}
