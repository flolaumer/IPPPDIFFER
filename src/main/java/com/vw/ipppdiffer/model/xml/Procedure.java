//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.29 at 04:51:57 PM EEST 
//


package com.vw.ipppdiffer.model.xml;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for PROCEDURE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROCEDURE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}IB-ELEMENT"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="BLOCK" type="{}BLOCK"/&gt;
 *         &lt;element name="GROUP" type="{}GROUP"/&gt;
 *         &lt;element name="SWITCH" type="{}SWITCH"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROCEDURE", propOrder = {
    "blockOrGROUPOrSWITCH"
})
public class PROCEDURE
    extends IBELEMENT
{

    @XmlElements({
        @XmlElement(name = "BLOCK", type = BLOCK.class),
        @XmlElement(name = "GROUP", type = GROUP.class),
        @XmlElement(name = "SWITCH", type = SWITCH.class)
    })
    protected List<IBELEMENT> blockOrGROUPOrSWITCH;

    /**
     * Gets the value of the blockOrGROUPOrSWITCH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockOrGROUPOrSWITCH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBLOCKOrGROUPOrSWITCH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BLOCK }
     * {@link GROUP }
     * {@link SWITCH }
     * 
     * 
     */
    public List<IBELEMENT> getBLOCKOrGROUPOrSWITCH() {
        if (blockOrGROUPOrSWITCH == null) {
            blockOrGROUPOrSWITCH = new ArrayList<IBELEMENT>();
        }
        return this.blockOrGROUPOrSWITCH;
    }

}
