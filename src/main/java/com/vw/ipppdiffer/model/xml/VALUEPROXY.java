//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.29 at 04:51:57 PM EEST 
//


package com.vw.ipppdiffer.model.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VALUE-PROXY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VALUE-PROXY"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="VALUE-REF" type="{}REFERENCE"/&gt;
 *           &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="TOLERANCE" type="{}TOLERANCE"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VALUE-PROXY", propOrder = {
    "valueref",
    "value",
    "tolerance"
})
public class VALUEPROXY {

    @XmlElement(name = "VALUE-REF")
    protected REFERENCE valueref;
    @XmlElement(name = "VALUE")
    protected String value;
    @XmlElement(name = "TOLERANCE")
    protected TOLERANCE tolerance;

    /**
     * Gets the value of the valueref property.
     * 
     * @return
     *     possible object is
     *     {@link REFERENCE }
     *     
     */
    public REFERENCE getVALUEREF() {
        return valueref;
    }

    /**
     * Sets the value of the valueref property.
     * 
     * @param value
     *     allowed object is
     *     {@link REFERENCE }
     *     
     */
    public void setVALUEREF(REFERENCE value) {
        this.valueref = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUE() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUE(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the tolerance property.
     * 
     * @return
     *     possible object is
     *     {@link TOLERANCE }
     *     
     */
    public TOLERANCE getTOLERANCE() {
        return tolerance;
    }

    /**
     * Sets the value of the tolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOLERANCE }
     *     
     */
    public void setTOLERANCE(TOLERANCE value) {
        this.tolerance = value;
    }

}
