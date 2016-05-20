package cz.slama.school.ddw.hw2.data;

import com.google.common.io.Files;
import cz.slama.school.ddw.hw2.generated.associativeRulesE.ObjectStream;
import cz.slama.school.ddw.hw2.model.AssociationRuleForm;
import org.apache.commons.compress.utils.Charsets;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Drugnanov on 20.5.2016.
 */
@Component
public class VoteData implements Data {

  //ToDo relative address
  private final static String FILE_PATH_RULES = "d:\\01.Skola\\08.Semestr\\01.DDW\\02.Homeworks\\02.hw\\MI-DDW_HW2\\src\\main\\webapp\\WEB-INF\\resources\\voteAssocRules_edited.xml";
  private final static String FILE_PATH_SOURCE = "d:\\01.Skola\\08.Semestr\\01.DDW\\02.Homeworks\\02.hw\\MI-DDW_HW2\\src\\main\\webapp\\WEB-INF\\resources\\vote.arff";

  @Override
  public List<AssociationRuleForm> getAssociationRules() {
    List<AssociationRuleForm> arfList = new ArrayList<>();
    Map<Integer, String> rules = new HashMap<>();
    try {
      File file = new File(FILE_PATH_RULES);
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
    }
    catch (JAXBException e) {
      e.printStackTrace();
    }
    return arfList;
  }

  @Override
  public void printData(){
    List<AssociationRuleForm> arfList = getAssociationRules();

    for (AssociationRuleForm arf : arfList) {
      System.out.println("Rule: " + arf);
    }

//    for (Map.Entry<Integer, String> entry : rules.entrySet()) {
//      System.out.println(entry.getKey() + " - " + entry.getValue());
//    }
  }

  @Override
  public String getData() throws IOException {
    File file = new File(FILE_PATH_RULES);
    return Files.toString(file, Charsets.UTF_8);
  }

  @Override
  public String getSource() throws IOException {
    File file = new File(FILE_PATH_SOURCE);
    return Files.toString(file, Charsets.UTF_8);
  }
}
