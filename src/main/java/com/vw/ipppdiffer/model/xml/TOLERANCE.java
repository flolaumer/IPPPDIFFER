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
import java.math.BigDecimal;


/**
 * <p>Java class for TOLERANCE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TOLERANCE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MIN-VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MAX-VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOLERANCE", propOrder = {
    "minvalue",
    "maxvalue"
})
public class TOLERANCE {

    @XmlElement(name = "MIN-VALUE")
    protected BigDecimal minvalue;
    @XmlElement(name = "MAX-VALUE")
    protected BigDecimal maxvalue;

    /**
     * Gets the value of the minvalue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMINVALUE() {
        return minvalue;
    }

    /**
     * Sets the value of the minvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMINVALUE(BigDecimal value) {
        this.minvalue = value;
    }

    /**
     * Gets the value of the maxvalue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAXVALUE() {
        return maxvalue;
    }

    /**
     * Sets the value of the maxvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAXVALUE(BigDecimal value) {
        this.maxvalue = value;
    }

}
