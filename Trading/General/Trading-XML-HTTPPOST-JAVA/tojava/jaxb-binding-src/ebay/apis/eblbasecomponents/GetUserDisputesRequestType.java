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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Requests a list of disputes the requester is involved in as buyer or seller.
 * 				The list includes both Unpaid Item and Item Not Received disputes.
 * 			
 * 
 * <p>Java class for GetUserDisputesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserDisputesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="DisputeFilterType" type="{urn:ebay:apis:eBLBaseComponents}DisputeFilterTypeCodeType" minOccurs="0"/>
 *         &lt;element name="DisputeSortType" type="{urn:ebay:apis:eBLBaseComponents}DisputeSortTypeCodeType" minOccurs="0"/>
 *         &lt;element name="ModTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ModTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserDisputesRequestType", propOrder = {
    "disputeFilterType",
    "disputeSortType",
    "modTimeFrom",
    "modTimeTo",
    "pagination"
})
public class GetUserDisputesRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "DisputeFilterType")
    protected DisputeFilterTypeCodeType disputeFilterType;
    @XmlElement(name = "DisputeSortType")
    protected DisputeSortTypeCodeType disputeSortType;
    @XmlElement(name = "ModTimeFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modTimeFrom;
    @XmlElement(name = "ModTimeTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modTimeTo;
    @XmlElement(name = "Pagination")
    protected PaginationType pagination;

    /**
     * Gets the value of the disputeFilterType property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeFilterTypeCodeType }
     *     
     */
    public DisputeFilterTypeCodeType getDisputeFilterType() {
        return disputeFilterType;
    }

    /**
     * Sets the value of the disputeFilterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeFilterTypeCodeType }
     *     
     */
    public void setDisputeFilterType(DisputeFilterTypeCodeType value) {
        this.disputeFilterType = value;
    }

    /**
     * Gets the value of the disputeSortType property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeSortTypeCodeType }
     *     
     */
    public DisputeSortTypeCodeType getDisputeSortType() {
        return disputeSortType;
    }

    /**
     * Sets the value of the disputeSortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeSortTypeCodeType }
     *     
     */
    public void setDisputeSortType(DisputeSortTypeCodeType value) {
        this.disputeSortType = value;
    }

    /**
     * Gets the value of the modTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModTimeFrom() {
        return modTimeFrom;
    }

    /**
     * Sets the value of the modTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModTimeFrom(XMLGregorianCalendar value) {
        this.modTimeFrom = value;
    }

    /**
     * Gets the value of the modTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModTimeTo() {
        return modTimeTo;
    }

    /**
     * Sets the value of the modTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModTimeTo(XMLGregorianCalendar value) {
        this.modTimeTo = value;
    }

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationType }
     *     
     */
    public PaginationType getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationType }
     *     
     */
    public void setPagination(PaginationType value) {
        this.pagination = value;
    }

}