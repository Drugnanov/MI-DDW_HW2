package cz.slama.school.ddw.hw2.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Drugnanov on 19.5.2016.
 */
public class AssociationRuleForm {
  protected Long associativeRuleId;
  protected float confidence;
  protected List<String> premises = new ArrayList<>();
  protected List<String> conclusion = new ArrayList<>();

  public Long getAssociativeRuleId() {
    return associativeRuleId;
  }

  public void setAssociativeRuleId(Long associativeRuleId) {
    this.associativeRuleId = associativeRuleId;
  }

  public float getConfidence() {
    return confidence;
  }

  public void setConfidence(float confidence) {
    this.confidence = confidence;
  }

  public List<String> getPremises() {
    return premises;
  }

  public void setPremises(List<String> premises) {
    this.premises = premises;
  }

  public List<String> getConclusion() {
    return conclusion;
  }

  public void setConclusion(List<String> conclusion) {
    this.conclusion = conclusion;
  }

  public void addPremise(String premise){
    this.premises.add(premise);
  }

  public void addConclusion(String conclusion){
    this.conclusion.add(conclusion);
  }

  @Override
  public String toString() {
    return "AssociationRuleForm{" +
        "associativeRuleId=" + associativeRuleId +
        ", confidence=" + confidence +
        ", premises=" + premises +
        ", conclusion=" + conclusion +
        '}';
  }
}
