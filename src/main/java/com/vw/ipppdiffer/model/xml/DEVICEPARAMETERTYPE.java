//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.29 at 04:51:57 PM EEST 
//


package com.vw.ipppdiffer.model.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DEVICE-PARAMETER-TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DEVICE-PARAMETER-TYPE"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="in"/&gt;
 *     &lt;enumeration value="out"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DEVICE-PARAMETER-TYPE")
@XmlEnum
public enum DEVICEPARAMETERTYPE {

    @XmlEnumValue("in")
    IN("in"),
    @XmlEnumValue("out")
    OUT("out");
    private final String value;

    DEVICEPARAMETERTYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DEVICEPARAMETERTYPE fromValue(String v) {
        for (DEVICEPARAMETERTYPE c: DEVICEPARAMETERTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
