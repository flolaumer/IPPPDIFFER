//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.29 at 04:51:57 PM EEST 
//


package com.vw.ipppdiffer.model.xml;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>Java class for BLOCK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BLOCK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}IB-ELEMENT"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DESC" type="{}DESC" minOccurs="0"/&gt;
 *         &lt;element name="TIS" type="{}TIS" minOccurs="0"/&gt;
 *         &lt;element name="AUTHOR-REF" type="{}REFERENCE" minOccurs="0"/&gt;
 *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TAGS" type="{}TAGS" minOccurs="0"/&gt;
 *         &lt;element name="AREA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOGICAL-LINK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VARIANTS" type="{}VARIANTS" minOccurs="0"/&gt;
 *         &lt;element name="LAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LAUNCH-DATE" type="{}DATE-KEY" minOccurs="0"/&gt;
 *         &lt;element name="END-DATE" type="{}DATE-KEY" minOccurs="0"/&gt;
 *         &lt;element name="BLOCK-DEPENDENCIES" type="{}BLOCK-DEPENDENCIES" minOccurs="0"/&gt;
 *         &lt;element name="CONDITIONS" type="{}CONDITIONS" minOccurs="0"/&gt;
 *         &lt;element name="IB-OPERATIONS" type="{}OPERATIONS" minOccurs="0"/&gt;
 *         &lt;element name="PARAMETERS" type="{}PARAMETERS" minOccurs="0"/&gt;
 *         &lt;element name="STEPS" type="{}STEPS" minOccurs="0"/&gt;
 *         &lt;element name="POLLINTERVALL" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TIMEOUT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="IBNZ" type="{}BLOCK-IBNZ" minOccurs="0"/&gt;
 *         &lt;element name="LINKS" type="{}LINKS" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="standardIBNB" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="shortname" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="P-relevant" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="KD-relevant" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BLOCK", propOrder = {
    "desc",
    "tis",
    "authorref",
    "category",
    "tags",
    "area",
    "logicallink",
    "variants",
    "las",
    "launchdate",
    "enddate",
    "blockdependencies",
    "conditions",
    "iboperations",
    "parameters",
    "steps",
    "pollintervall",
    "timeout",
    "ibnz",
    "links"
})
public class BLOCK
    extends IBELEMENT
{

    @XmlElement(name = "DESC")
    protected String desc;
    @XmlElement(name = "TIS")
    protected TIS tis;
    @XmlElement(name = "AUTHOR-REF")
    protected REFERENCE authorref;
    @XmlElement(name = "CATEGORY")
    protected String category;
    @XmlElement(name = "TAGS")
    protected TAGS tags;
    @XmlElement(name = "AREA")
    protected String area;
    @XmlElement(name = "LOGICAL-LINK")
    protected String logicallink;
    @XmlElement(name = "VARIANTS")
    protected VARIANTS variants;
    @XmlElement(name = "LAS")
    protected String las;
    @XmlElement(name = "LAUNCH-DATE")
    protected String launchdate;
    @XmlElement(name = "END-DATE")
    protected String enddate;
    @XmlElement(name = "BLOCK-DEPENDENCIES")
    protected BLOCKDEPENDENCIES blockdependencies;
    @XmlElement(name = "CONDITIONS")
    protected CONDITIONS conditions;
    @XmlElement(name = "IB-OPERATIONS")
    protected OPERATIONS iboperations;
    @XmlElement(name = "PARAMETERS")
    protected PARAMETERS parameters;
    @XmlElement(name = "STEPS")
    protected STEPS steps;
    @XmlElement(name = "POLLINTERVALL")
    protected BigInteger pollintervall;
    @XmlElement(name = "TIMEOUT")
    protected BigInteger timeout;
    @XmlElement(name = "IBNZ")
    protected BLOCKIBNZ ibnz;
    @XmlElement(name = "LINKS")
    protected LINKS links;
    @XmlAttribute(name = "standardIBNB")
    protected Boolean standardIBNB;
    @XmlAttribute(name = "shortname")
    protected String shortname;
    @XmlAttribute(name = "version")
    protected BigInteger version;
    @XmlAttribute(name = "P-relevant")
    protected Boolean pRelevant;
    @XmlAttribute(name = "KD-relevant")
    protected Boolean kdRelevant;
    @XmlAttribute(name = "optional")
    protected Boolean optional;

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
     * Gets the value of the tis property.
     * 
     * @return
     *     possible object is
     *     {@link TIS }
     *     
     */
    public TIS getTIS() {
        return tis;
    }

    /**
     * Sets the value of the tis property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIS }
     *     
     */
    public void setTIS(TIS value) {
        this.tis = value;
    }

    /**
     * Gets the value of the authorref property.
     * 
     * @return
     *     possible object is
     *     {@link REFERENCE }
     *     
     */
    public REFERENCE getAUTHORREF() {
        return authorref;
    }

    /**
     * Sets the value of the authorref property.
     * 
     * @param value
     *     allowed object is
     *     {@link REFERENCE }
     *     
     */
    public void setAUTHORREF(REFERENCE value) {
        this.authorref = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORY() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORY(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link TAGS }
     *     
     */
    public TAGS getTAGS() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAGS }
     *     
     */
    public void setTAGS(TAGS value) {
        this.tags = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAREA() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAREA(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the logicallink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOGICALLINK() {
        return logicallink;
    }

    /**
     * Sets the value of the logicallink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOGICALLINK(String value) {
        this.logicallink = value;
    }

    /**
     * Gets the value of the variants property.
     * 
     * @return
     *     possible object is
     *     {@link VARIANTS }
     *     
     */
    public VARIANTS getVARIANTS() {
        return variants;
    }

    /**
     * Sets the value of the variants property.
     * 
     * @param value
     *     allowed object is
     *     {@link VARIANTS }
     *     
     */
    public void setVARIANTS(VARIANTS value) {
        this.variants = value;
    }

    /**
     * Gets the value of the las property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAS() {
        return las;
    }

    /**
     * Sets the value of the las property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAS(String value) {
        this.las = value;
    }

    /**
     * Gets the value of the launchdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAUNCHDATE() {
        return launchdate;
    }

    /**
     * Sets the value of the launchdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAUNCHDATE(String value) {
        this.launchdate = value;
    }

    /**
     * Gets the value of the enddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDDATE() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDDATE(String value) {
        this.enddate = value;
    }

    /**
     * Gets the value of the blockdependencies property.
     * 
     * @return
     *     possible object is
     *     {@link BLOCKDEPENDENCIES }
     *     
     */
    public BLOCKDEPENDENCIES getBLOCKDEPENDENCIES() {
        return blockdependencies;
    }

    /**
     * Sets the value of the blockdependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BLOCKDEPENDENCIES }
     *     
     */
    public void setBLOCKDEPENDENCIES(BLOCKDEPENDENCIES value) {
        this.blockdependencies = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link CONDITIONS }
     *     
     */
    public CONDITIONS getCONDITIONS() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONDITIONS }
     *     
     */
    public void setCONDITIONS(CONDITIONS value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the iboperations property.
     * 
     * @return
     *     possible object is
     *     {@link OPERATIONS }
     *     
     */
    public OPERATIONS getIBOPERATIONS() {
        return iboperations;
    }

    /**
     * Sets the value of the iboperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPERATIONS }
     *     
     */
    public void setIBOPERATIONS(OPERATIONS value) {
        this.iboperations = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link PARAMETERS }
     *     
     */
    public PARAMETERS getPARAMETERS() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARAMETERS }
     *     
     */
    public void setPARAMETERS(PARAMETERS value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the steps property.
     * 
     * @return
     *     possible object is
     *     {@link STEPS }
     *     
     */
    public STEPS getSTEPS() {
        return steps;
    }

    /**
     * Sets the value of the steps property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEPS }
     *     
     */
    public void setSTEPS(STEPS value) {
        this.steps = value;
    }

    /**
     * Gets the value of the pollintervall property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPOLLINTERVALL() {
        return pollintervall;
    }

    /**
     * Sets the value of the pollintervall property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPOLLINTERVALL(BigInteger value) {
        this.pollintervall = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTIMEOUT() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTIMEOUT(BigInteger value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the ibnz property.
     * 
     * @return
     *     possible object is
     *     {@link BLOCKIBNZ }
     *     
     */
    public BLOCKIBNZ getIBNZ() {
        return ibnz;
    }

    /**
     * Sets the value of the ibnz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BLOCKIBNZ }
     *     
     */
    public void setIBNZ(BLOCKIBNZ value) {
        this.ibnz = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link LINKS }
     *     
     */
    public LINKS getLINKS() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link LINKS }
     *     
     */
    public void setLINKS(LINKS value) {
        this.links = value;
    }

    /**
     * Gets the value of the standardIBNB property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStandardIBNB() {
        if (standardIBNB == null) {
            return false;
        } else {
            return standardIBNB;
        }
    }

    /**
     * Sets the value of the standardIBNB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandardIBNB(Boolean value) {
        this.standardIBNB = value;
    }

    /**
     * Gets the value of the shortname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * Sets the value of the shortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortname(String value) {
        this.shortname = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Gets the value of the pRelevant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPRelevant() {
        if (pRelevant == null) {
            return true;
        } else {
            return pRelevant;
        }
    }

    /**
     * Sets the value of the pRelevant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPRelevant(Boolean value) {
        this.pRelevant = value;
    }

    /**
     * Gets the value of the kdRelevant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isKDRelevant() {
        if (kdRelevant == null) {
            return true;
        } else {
            return kdRelevant;
        }
    }

    /**
     * Sets the value of the kdRelevant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKDRelevant(Boolean value) {
        this.kdRelevant = value;
    }

    /**
     * Gets the value of the optional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOptional() {
        if (optional == null) {
            return false;
        } else {
            return optional;
        }
    }

    /**
     * Sets the value of the optional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptional(Boolean value) {
        this.optional = value;
    }

}
