
package com.soprabanking.amplitude.getcustomerphonenumberlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCustomerPhoneNumberListRequestFlow complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCustomerPhoneNumberListRequestFlow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestHeader" type="{http://soprabanking.com/amplitude}requestHeader"/>
 *         &lt;element name="getCustomerPhoneNumberListRequest" type="{http://soprabanking.com/amplitude}getCustomerPhoneNumberListRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerPhoneNumberListRequestFlow", propOrder = {
    "requestHeader",
    "getCustomerPhoneNumberListRequest"
})
public class GetCustomerPhoneNumberListRequestFlow {

    @XmlElement(required = true)
    protected RequestHeader requestHeader;
    @XmlElement(required = true)
    protected GetCustomerPhoneNumberListRequest getCustomerPhoneNumberListRequest;

    /**
     * Obtient la valeur de la propri�t� requestHeader.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * D�finit la valeur de la propri�t� requestHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setRequestHeader(RequestHeader value) {
        this.requestHeader = value;
    }

    /**
     * Obtient la valeur de la propri�t� getCustomerPhoneNumberListRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerPhoneNumberListRequest }
     *     
     */
    public GetCustomerPhoneNumberListRequest getGetCustomerPhoneNumberListRequest() {
        return getCustomerPhoneNumberListRequest;
    }

    /**
     * D�finit la valeur de la propri�t� getCustomerPhoneNumberListRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerPhoneNumberListRequest }
     *     
     */
    public void setGetCustomerPhoneNumberListRequest(GetCustomerPhoneNumberListRequest value) {
        this.getCustomerPhoneNumberListRequest = value;
    }

}
