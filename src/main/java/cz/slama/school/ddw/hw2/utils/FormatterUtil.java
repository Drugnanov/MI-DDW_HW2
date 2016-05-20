package cz.slama.school.ddw.hw2.utils;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/** Formátovácí operace pro datové struktury */
public class FormatterUtil {

  /**
   * Pokusí se zarovnat xml (indent). V případě neúspěchu (např. nevalidní xml) vrátí původní řetězec.
   *
   * @param input řetězec obsahující xml
   * @return zarovnané xml
   */
  public static String indentXml(String input) {
    if (input == null) return "";
    try {
      Document document =
          DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(input)));
      OutputFormat format = new OutputFormat(document);
      format.setIndenting(true);
      format.setLineWidth(Integer.MAX_VALUE);
      format.setIndent(2);
      StringWriter sw = new StringWriter();
      XMLSerializer serializer = new XMLSerializer(sw, format);
      serializer.serialize(document);
      return sw.toString();
    }
    catch (IOException e) {
      return input;
    }
    catch (SAXException e) {
      return input;
    }
    catch (ParserConfigurationException e) {
      return input;
    }
  }
}
