
package com.soprabanking.amplitude.getcustomerphonenumberlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCustomerPhoneNumberListResponseFlow complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCustomerPhoneNumberListResponseFlow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseHeader" type="{http://soprabanking.com/amplitude}responseHeader"/>
 *         &lt;element name="responseStatus" type="{http://soprabanking.com/amplitude}responseStatus"/>
 *         &lt;element name="getCustomerPhoneNumberListResponse" type="{http://soprabanking.com/amplitude}getCustomerPhoneNumberListResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerPhoneNumberListResponseFlow", propOrder = {
    "responseHeader",
    "responseStatus",
    "getCustomerPhoneNumberListResponse"
})
public class GetCustomerPhoneNumberListResponseFlow {

    @XmlElement(required = true)
    protected ResponseHeader responseHeader;
    @XmlElement(required = true)
    protected ResponseStatus responseStatus;
    protected GetCustomerPhoneNumberListResponse getCustomerPhoneNumberListResponse;

    /**
     * Obtient la valeur de la propriété responseHeader.
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeader }
     *     
     */
    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    /**
     * Définit la valeur de la propriété responseHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeader }
     *     
     */
    public void setResponseHeader(ResponseHeader value) {
        this.responseHeader = value;
    }

    /**
     * Obtient la valeur de la propriété responseStatus.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatus }
     *     
     */
    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    /**
     * Définit la valeur de la propriété responseStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatus }
     *     
     */
    public void setResponseStatus(ResponseStatus value) {
        this.responseStatus = value;
    }

    /**
     * Obtient la valeur de la propriété getCustomerPhoneNumberListResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerPhoneNumberListResponse }
     *     
     */
    public GetCustomerPhoneNumberListResponse getGetCustomerPhoneNumberListResponse() {
        return getCustomerPhoneNumberListResponse;
    }

    /**
     * Définit la valeur de la propriété getCustomerPhoneNumberListResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerPhoneNumberListResponse }
     *     
     */
    public void setGetCustomerPhoneNumberListResponse(GetCustomerPhoneNumberListResponse value) {
        this.getCustomerPhoneNumberListResponse = value;
    }

}
