//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Defines a seller's preferences for allowing buyers to combine more than one
 * 			purchase into one payment.
 * 			
 * 
 * <p>Java class for CombinedPaymentPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CombinedPaymentPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalculatedShippingPreferences" type="{urn:ebay:apis:eBLBaseComponents}CalculatedShippingPreferencesType" minOccurs="0"/>
 *         &lt;element name="CombinedPaymentOption" type="{urn:ebay:apis:eBLBaseComponents}CombinedPaymentOptionCodeType" minOccurs="0"/>
 *         &lt;element name="CombinedPaymentPeriod" type="{urn:ebay:apis:eBLBaseComponents}CombinedPaymentPeriodCodeType" minOccurs="0"/>
 *         &lt;element name="FlatShippingPreferences" type="{urn:ebay:apis:eBLBaseComponents}FlatShippingPreferencesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CombinedPaymentPreferencesType", propOrder = {
    "calculatedShippingPreferences",
    "combinedPaymentOption",
    "combinedPaymentPeriod",
    "flatShippingPreferences"
})
public class CombinedPaymentPreferencesType {

    @XmlElement(name = "CalculatedShippingPreferences")
    protected CalculatedShippingPreferencesType calculatedShippingPreferences;
    @XmlElement(name = "CombinedPaymentOption")
    protected CombinedPaymentOptionCodeType combinedPaymentOption;
    @XmlElement(name = "CombinedPaymentPeriod")
    protected CombinedPaymentPeriodCodeType combinedPaymentPeriod;
    @XmlElement(name = "FlatShippingPreferences")
    protected FlatShippingPreferencesType flatShippingPreferences;

    /**
     * Gets the value of the calculatedShippingPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedShippingPreferencesType }
     *     
     */
    public CalculatedShippingPreferencesType getCalculatedShippingPreferences() {
        return calculatedShippingPreferences;
    }

    /**
     * Sets the value of the calculatedShippingPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedShippingPreferencesType }
     *     
     */
    public void setCalculatedShippingPreferences(CalculatedShippingPreferencesType value) {
        this.calculatedShippingPreferences = value;
    }

    /**
     * Gets the value of the combinedPaymentOption property.
     * 
     * @return
     *     possible object is
     *     {@link CombinedPaymentOptionCodeType }
     *     
     */
    public CombinedPaymentOptionCodeType getCombinedPaymentOption() {
        return combinedPaymentOption;
    }

    /**
     * Sets the value of the combinedPaymentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinedPaymentOptionCodeType }
     *     
     */
    public void setCombinedPaymentOption(CombinedPaymentOptionCodeType value) {
        this.combinedPaymentOption = value;
    }

    /**
     * Gets the value of the combinedPaymentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CombinedPaymentPeriodCodeType }
     *     
     */
    public CombinedPaymentPeriodCodeType getCombinedPaymentPeriod() {
        return combinedPaymentPeriod;
    }

    /**
     * Sets the value of the combinedPaymentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinedPaymentPeriodCodeType }
     *     
     */
    public void setCombinedPaymentPeriod(CombinedPaymentPeriodCodeType value) {
        this.combinedPaymentPeriod = value;
    }

    /**
     * Gets the value of the flatShippingPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link FlatShippingPreferencesType }
     *     
     */
    public FlatShippingPreferencesType getFlatShippingPreferences() {
        return flatShippingPreferences;
    }

    /**
     * Sets the value of the flatShippingPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatShippingPreferencesType }
     *     
     */
    public void setFlatShippingPreferences(FlatShippingPreferencesType value) {
        this.flatShippingPreferences = value;
    }

}