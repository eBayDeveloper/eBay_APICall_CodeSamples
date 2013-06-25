//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 06:08:42 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated as Cross Promotions are no longer supported in the APIs.
 * 				
 * 			
 * 
 * <p>Java class for PromotionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PromotionPriceType" type="{urn:ebay:apis:eBLBaseComponents}PromotionItemPriceTypeCodeType" minOccurs="0"/>
 *         &lt;element name="BidCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConvertedPromotionPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionDetailsType", propOrder = {
    "promotionPrice",
    "promotionPriceType",
    "bidCount",
    "convertedPromotionPrice"
})
public class PromotionDetailsType {

    @XmlElement(name = "PromotionPrice")
    protected AmountType promotionPrice;
    @XmlElement(name = "PromotionPriceType")
    protected PromotionItemPriceTypeCodeType promotionPriceType;
    @XmlElement(name = "BidCount")
    protected Integer bidCount;
    @XmlElement(name = "ConvertedPromotionPrice")
    protected AmountType convertedPromotionPrice;

    /**
     * Gets the value of the promotionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * Sets the value of the promotionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPromotionPrice(AmountType value) {
        this.promotionPrice = value;
    }

    /**
     * Gets the value of the promotionPriceType property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionItemPriceTypeCodeType }
     *     
     */
    public PromotionItemPriceTypeCodeType getPromotionPriceType() {
        return promotionPriceType;
    }

    /**
     * Sets the value of the promotionPriceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionItemPriceTypeCodeType }
     *     
     */
    public void setPromotionPriceType(PromotionItemPriceTypeCodeType value) {
        this.promotionPriceType = value;
    }

    /**
     * Gets the value of the bidCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidCount() {
        return bidCount;
    }

    /**
     * Sets the value of the bidCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidCount(Integer value) {
        this.bidCount = value;
    }

    /**
     * Gets the value of the convertedPromotionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedPromotionPrice() {
        return convertedPromotionPrice;
    }

    /**
     * Sets the value of the convertedPromotionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedPromotionPrice(AmountType value) {
        this.convertedPromotionPrice = value;
    }

}