package cz.slama.school.ddw.hw2;

import cz.slama.school.ddw.hw2.generated.associativeRulesE.ObjectStream;
import cz.slama.school.ddw.hw2.model.AssociationRuleForm;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Drugnanov on 19.5.2016.
 */
public class AssociationRulesToJavaObject {

  private static final String UNIT_TEST_PATH = "./src/test/resources/";

  public static void main(String[] args) {
    List<AssociationRuleForm> arfList = new ArrayList<>();
    Map<Integer, String> rules = new HashMap<>();
    try {
      File file = new File(
          "d:\\01.Skola\\08.Semestr\\01.DDW\\02.Homeworks\\02.hw\\MI-DDW_HW2\\src\\main\\webapp\\WEB-INF\\resources\\associativeRules_edited.xml");
      JAXBContext jaxbContext = JAXBContext.newInstance(ObjectStream.class);
      Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

      // output pretty printed
      ObjectStream objectStream = (ObjectStream) jaxbUnmarshaller.unmarshal(file);
      ObjectStream.Associationrules ars = objectStream.getAssociationrules();
      for (ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule ar : ars
          .getComRapidminerOperatorLearnerAssociationsAssociationrule()) {
        AssociationRuleForm arf = new AssociationRuleForm();
        arf.setAssociativeRuleId(ar.getId().longValue());
        arf.setConfidence(ar.getConfidence());
//        Premises
        for (ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Premise.ComRapidminerOperatorLearnerAssociationsBooleanattributeitem premiseItem : ar
            .getPremise().getComRapidminerOperatorLearnerAssociationsBooleanattributeitem()) {
          //values are referenced after first used. First time is used Id attribute and reference attribute without body for next time
          //first using
          if (premiseItem.getId() != null) {
            Object[] items = premiseItem.getContent().toArray();
            for (int i = 0; i < items.length; i++) {
              if (items[i] instanceof JAXBElement) {
                if ("name".equals(((JAXBElement) items[i]).getName().toString())) {
                  arf.addPremise((String) (((JAXBElement) items[i])).getValue());
                  rules.put(premiseItem.getId().intValue(), (String) (((JAXBElement) items[i])).getValue());
                }
              }
            }
          }
          //references to id
          else {
            String premise = rules.get(premiseItem.getReference().intValue());
            arf.addPremise(premise);
          }
        }
//        Conclusions
        for (ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Conclusion.ComRapidminerOperatorLearnerAssociationsBooleanattributeitem conclusionItem : ar
            .getConclusion().getComRapidminerOperatorLearnerAssociationsBooleanattributeitem()) {
          //values are referenced after first used. First time is used Id attribute and reference attribute without body for next time
          //first using
          if (conclusionItem.getId() != null) {
            Object[] items = conclusionItem.getContent().toArray();
            for (int i = 0; i < items.length; i++) {
              if (items[i] instanceof JAXBElement) {
                if ("name".equals(((JAXBElement) items[i]).getName().toString())) {
                  arf.addConclusion((String) (((JAXBElement) items[i])).getValue());
                  rules.put(conclusionItem.getId().intValue(), (String) (((JAXBElement) items[i])).getValue());
                }
              }
            }
          }
          //references to id
          else {
            String conclusion = rules.get(conclusionItem.getReference().intValue());
            arf.addConclusion(conclusion);
          }
        }
        arfList.add(arf);
      }
      System.out.println(objectStream);
    }
    catch (JAXBException e) {
      e.printStackTrace();
    }

    for (AssociationRuleForm arf : arfList) {
      System.out.println("Rule: " + arf);
    }

    for (Map.Entry<Integer, String> entry : rules.entrySet())
    {
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }
  }
}
