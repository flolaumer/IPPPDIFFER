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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for IB-OPERATIONS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IB-OPERATIONS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IB-OPERATION" type="{}IB-OPERATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IB-OPERATIONS", propOrder = {
    "iboperation"
})
public class IBOPERATIONS {

    @XmlElement(name = "IB-OPERATION")
    protected List<IBOPERATION> iboperation;

    /**
     * Gets the value of the iboperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iboperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIBOPERATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBOPERATION }
     * 
     * 
     */
    public List<IBOPERATION> getIBOPERATION() {
        if (iboperation == null) {
            iboperation = new ArrayList<IBOPERATION>();
        }
        return this.iboperation;
    }

}
