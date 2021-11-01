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
 * <p>Java class for DOC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOC"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DESC" type="{}DESC" minOccurs="0"/&gt;
 *         &lt;element name="FILE-SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SPARE-PART-NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOC", propOrder = {
    "name",
    "version",
    "desc",
    "filesystem",
    "url",
    "sparepartnumber"
})
public class DOC {

    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "VERSION")
    protected String version;
    @XmlElement(name = "DESC")
    protected String desc;
    @XmlElement(name = "FILE-SYSTEM")
    protected String filesystem;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "SPARE-PART-NUMBER")
    protected String sparepartnumber;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERSION() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERSION(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESC() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESC(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the filesystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILESYSTEM() {
        return filesystem;
    }

    /**
     * Sets the value of the filesystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILESYSTEM(String value) {
        this.filesystem = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the sparepartnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPAREPARTNUMBER() {
        return sparepartnumber;
    }

    /**
     * Sets the value of the sparepartnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPAREPARTNUMBER(String value) {
        this.sparepartnumber = value;
    }

}
