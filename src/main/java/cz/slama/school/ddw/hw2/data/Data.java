package cz.slama.school.ddw.hw2.data;

import cz.slama.school.ddw.hw2.model.AssociationRuleForm;

import java.io.IOException;
import java.util.List;

/**
 * Created by Drugnanov on 20.5.2016.
 */
public interface Data {

  public List<AssociationRuleForm> getAssociationRules();

  public void printData();

  public String getData() throws IOException;

  public String getSource() throws IOException;
}
