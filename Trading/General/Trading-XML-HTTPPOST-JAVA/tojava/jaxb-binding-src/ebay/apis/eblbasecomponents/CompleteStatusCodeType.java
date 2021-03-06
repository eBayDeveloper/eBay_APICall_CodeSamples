//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompleteStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompleteStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Incomplete"/>
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompleteStatusCodeType")
@XmlEnum
public enum CompleteStatusCodeType {


    /**
     * 
     * 						Transaction is incomplete.
     * 					
     * 
     */
    @XmlEnumValue("Incomplete")
    INCOMPLETE("Incomplete"),

    /**
     * 
     * 						Transaction is complete.
     * 					
     * 
     */
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),

    /**
     * 
     * 						Transaction is pending.
     * 					
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     * 						Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CompleteStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompleteStatusCodeType fromValue(String v) {
        for (CompleteStatusCodeType c: CompleteStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
