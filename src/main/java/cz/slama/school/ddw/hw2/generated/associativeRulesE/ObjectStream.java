
package cz.slama.school.ddw.hw2.generated.associativeRulesE;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="associationrules">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="com.rapidminer.operator.learner.associations.associationrule" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="confidence" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="totalsupport" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="lift" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="laplace" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="gain" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="ps" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="conviction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="premise">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="com.rapidminer.operator.learner.associations.booleanattributeitem" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                               &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="conclusion">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="com.rapidminer.operator.learner.associations.booleanattributeitem" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                               &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "associationrules"
})
@XmlRootElement(name = "object-stream")
public class ObjectStream {

    @XmlElement(required = true)
    protected ObjectStream.Associationrules associationrules;

    /**
     * Gets the value of the associationrules property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectStream.Associationrules }
     *     
     */
    public ObjectStream.Associationrules getAssociationrules() {
        return associationrules;
    }

    /**
     * Sets the value of the associationrules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectStream.Associationrules }
     *     
     */
    public void setAssociationrules(ObjectStream.Associationrules value) {
        this.associationrules = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="com.rapidminer.operator.learner.associations.associationrule" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="confidence" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="totalsupport" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="lift" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="laplace" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="gain" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="ps" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="conviction" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="premise">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="com.rapidminer.operator.learner.associations.booleanattributeitem" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
     *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                     &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="conclusion">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="com.rapidminer.operator.learner.associations.booleanattributeitem" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
     *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                     &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "comRapidminerOperatorLearnerAssociationsAssociationrule"
    })
    public static class Associationrules {

        @XmlElement(name = "com.rapidminer.operator.learner.associations.associationrule")
        protected List<ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule> comRapidminerOperatorLearnerAssociationsAssociationrule;
        @XmlAttribute(name = "id")
        protected Byte id;

        /**
         * Gets the value of the comRapidminerOperatorLearnerAssociationsAssociationrule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the comRapidminerOperatorLearnerAssociationsAssociationrule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComRapidminerOperatorLearnerAssociationsAssociationrule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule }
         * 
         * 
         */
        public List<ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule> getComRapidminerOperatorLearnerAssociationsAssociationrule() {
            if (comRapidminerOperatorLearnerAssociationsAssociationrule == null) {
                comRapidminerOperatorLearnerAssociationsAssociationrule = new ArrayList<ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule>();
            }
            return this.comRapidminerOperatorLearnerAssociationsAssociationrule;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setId(Byte value) {
            this.id = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="confidence" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="totalsupport" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="lift" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="laplace" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="gain" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="ps" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="conviction" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="premise">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="com.rapidminer.operator.learner.associations.booleanattributeitem" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
         *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                           &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="conclusion">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="com.rapidminer.operator.learner.associations.booleanattributeitem" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
         *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                           &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "confidence",
            "totalsupport",
            "lift",
            "laplace",
            "gain",
            "ps",
            "conviction",
            "premise",
            "conclusion"
        })
        public static class ComRapidminerOperatorLearnerAssociationsAssociationrule {

            protected float confidence;
            protected float totalsupport;
            protected float lift;
            protected float laplace;
            protected float gain;
            protected float ps;
            @XmlElement(required = true)
            protected String conviction;
            @XmlElement(required = true)
            protected ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Premise premise;
            @XmlElement(required = true)
            protected ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Conclusion conclusion;
            @XmlAttribute(name = "id")
            protected Byte id;

            /**
             * Gets the value of the confidence property.
             * 
             */
            public float getConfidence() {
                return confidence;
            }

            /**
             * Sets the value of the confidence property.
             * 
             */
            public void setConfidence(float value) {
                this.confidence = value;
            }

            /**
             * Gets the value of the totalsupport property.
             * 
             */
            public float getTotalsupport() {
                return totalsupport;
            }

            /**
             * Sets the value of the totalsupport property.
             * 
             */
            public void setTotalsupport(float value) {
                this.totalsupport = value;
            }

            /**
             * Gets the value of the lift property.
             * 
             */
            public float getLift() {
                return lift;
            }

            /**
             * Sets the value of the lift property.
             * 
             */
            public void setLift(float value) {
                this.lift = value;
            }

            /**
             * Gets the value of the laplace property.
             * 
             */
            public float getLaplace() {
                return laplace;
            }

            /**
             * Sets the value of the laplace property.
             * 
             */
            public void setLaplace(float value) {
                this.laplace = value;
            }

            /**
             * Gets the value of the gain property.
             * 
             */
            public float getGain() {
                return gain;
            }

            /**
             * Sets the value of the gain property.
             * 
             */
            public void setGain(float value) {
                this.gain = value;
            }

            /**
             * Gets the value of the ps property.
             * 
             */
            public float getPs() {
                return ps;
            }

            /**
             * Sets the value of the ps property.
             * 
             */
            public void setPs(float value) {
                this.ps = value;
            }

            /**
             * Gets the value of the conviction property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConviction() {
                return conviction;
            }

            /**
             * Sets the value of the conviction property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConviction(String value) {
                this.conviction = value;
            }

            /**
             * Gets the value of the premise property.
             * 
             * @return
             *     possible object is
             *     {@link ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Premise }
             *     
             */
            public ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Premise getPremise() {
                return premise;
            }

            /**
             * Sets the value of the premise property.
             * 
             * @param value
             *     allowed object is
             *     {@link ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Premise }
             *     
             */
            public void setPremise(ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Premise value) {
                this.premise = value;
            }

            /**
             * Gets the value of the conclusion property.
             * 
             * @return
             *     possible object is
             *     {@link ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Conclusion }
             *     
             */
            public ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Conclusion getConclusion() {
                return conclusion;
            }

            /**
             * Sets the value of the conclusion property.
             * 
             * @param value
             *     allowed object is
             *     {@link ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Conclusion }
             *     
             */
            public void setConclusion(ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Conclusion value) {
                this.conclusion = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setId(Byte value) {
                this.id = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="com.rapidminer.operator.learner.associations.booleanattributeitem" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
             *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                 &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "comRapidminerOperatorLearnerAssociationsBooleanattributeitem"
            })
            public static class Conclusion {

                @XmlElement(name = "com.rapidminer.operator.learner.associations.booleanattributeitem")
                protected List<ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Conclusion.ComRapidminerOperatorLearnerAssociationsBooleanattributeitem> comRapidminerOperatorLearnerAssociationsBooleanattributeitem;
                @XmlAttribute(name = "class")
                protected String clazz;
                @XmlAttribute(name = "id")
                protected Byte id;

                /**
                 * Gets the value of the comRapidminerOperatorLearnerAssociationsBooleanattributeitem property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the comRapidminerOperatorLearnerAssociationsBooleanattributeitem property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getComRapidminerOperatorLearnerAssociationsBooleanattributeitem().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Conclusion.ComRapidminerOperatorLearnerAssociationsBooleanattributeitem }
                 * 
                 * 
                 */
                public List<ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Conclusion.ComRapidminerOperatorLearnerAssociationsBooleanattributeitem> getComRapidminerOperatorLearnerAssociationsBooleanattributeitem() {
                    if (comRapidminerOperatorLearnerAssociationsBooleanattributeitem == null) {
                        comRapidminerOperatorLearnerAssociationsBooleanattributeitem = new ArrayList<ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Conclusion.ComRapidminerOperatorLearnerAssociationsBooleanattributeitem>();
                    }
                    return this.comRapidminerOperatorLearnerAssociationsBooleanattributeitem;
                }

                /**
                 * Gets the value of the clazz property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClazz() {
                    return clazz;
                }

                /**
                 * Sets the value of the clazz property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClazz(String value) {
                    this.clazz = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setId(Byte value) {
                    this.id = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
                 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *       &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "content"
                })
                public static class ComRapidminerOperatorLearnerAssociationsBooleanattributeitem {

                    @XmlElementRefs({
                        @XmlElementRef(name = "name", type = JAXBElement.class, required = false),
                        @XmlElementRef(name = "frequency", type = JAXBElement.class, required = false)
                    })
                    @XmlMixed
                    protected List<Serializable> content;
                    @XmlAttribute(name = "id")
                    protected Byte id;
                    @XmlAttribute(name = "reference")
                    protected Byte reference;

                    /**
                     * Gets the value of the content property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the content property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getContent().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link JAXBElement }{@code <}{@link String }{@code >}
                     * {@link String }
                     * {@link JAXBElement }{@code <}{@link Byte }{@code >}
                     * 
                     * 
                     */
                    public List<Serializable> getContent() {
                        if (content == null) {
                            content = new ArrayList<Serializable>();
                        }
                        return this.content;
                    }

                    /**
                     * Gets the value of the id property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getId() {
                        return id;
                    }

                    /**
                     * Sets the value of the id property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setId(Byte value) {
                        this.id = value;
                    }

                    /**
                     * Gets the value of the reference property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getReference() {
                        return reference;
                    }

                    /**
                     * Sets the value of the reference property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setReference(Byte value) {
                        this.reference = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="com.rapidminer.operator.learner.associations.booleanattributeitem" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
             *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                 &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "comRapidminerOperatorLearnerAssociationsBooleanattributeitem"
            })
            public static class Premise {

                @XmlElement(name = "com.rapidminer.operator.learner.associations.booleanattributeitem")
                protected List<ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Premise.ComRapidminerOperatorLearnerAssociationsBooleanattributeitem> comRapidminerOperatorLearnerAssociationsBooleanattributeitem;
                @XmlAttribute(name = "class")
                protected String clazz;
                @XmlAttribute(name = "id")
                protected Byte id;

                /**
                 * Gets the value of the comRapidminerOperatorLearnerAssociationsBooleanattributeitem property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the comRapidminerOperatorLearnerAssociationsBooleanattributeitem property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getComRapidminerOperatorLearnerAssociationsBooleanattributeitem().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Premise.ComRapidminerOperatorLearnerAssociationsBooleanattributeitem }
                 * 
                 * 
                 */
                public List<ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Premise.ComRapidminerOperatorLearnerAssociationsBooleanattributeitem> getComRapidminerOperatorLearnerAssociationsBooleanattributeitem() {
                    if (comRapidminerOperatorLearnerAssociationsBooleanattributeitem == null) {
                        comRapidminerOperatorLearnerAssociationsBooleanattributeitem = new ArrayList<ObjectStream.Associationrules.ComRapidminerOperatorLearnerAssociationsAssociationrule.Premise.ComRapidminerOperatorLearnerAssociationsBooleanattributeitem>();
                    }
                    return this.comRapidminerOperatorLearnerAssociationsBooleanattributeitem;
                }

                /**
                 * Gets the value of the clazz property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClazz() {
                    return clazz;
                }

                /**
                 * Sets the value of the clazz property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClazz(String value) {
                    this.clazz = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setId(Byte value) {
                    this.id = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
                 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *       &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "content"
                })
                public static class ComRapidminerOperatorLearnerAssociationsBooleanattributeitem {

                    @XmlElementRefs({
                        @XmlElementRef(name = "frequency", type = JAXBElement.class, required = false),
                        @XmlElementRef(name = "name", type = JAXBElement.class, required = false)
                    })
                    @XmlMixed
                    protected List<Serializable> content;
                    @XmlAttribute(name = "id")
                    protected Byte id;
                    @XmlAttribute(name = "reference")
                    protected Byte reference;

                    /**
                     * Gets the value of the content property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the content property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getContent().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link JAXBElement }{@code <}{@link Byte }{@code >}
                     * {@link String }
                     * {@link JAXBElement }{@code <}{@link String }{@code >}
                     * 
                     * 
                     */
                    public List<Serializable> getContent() {
                        if (content == null) {
                            content = new ArrayList<Serializable>();
                        }
                        return this.content;
                    }

                    /**
                     * Gets the value of the id property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getId() {
                        return id;
                    }

                    /**
                     * Sets the value of the id property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setId(Byte value) {
                        this.id = value;
                    }

                    /**
                     * Gets the value of the reference property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getReference() {
                        return reference;
                    }

                    /**
                     * Sets the value of the reference property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setReference(Byte value) {
                        this.reference = value;
                    }

                }

            }

        }

    }

}
