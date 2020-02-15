
package com.soprabanking.amplitude.getcustomercontactlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCustomerContactListRequestFlow complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCustomerContactListRequestFlow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestHeader" type="{http://soprabanking.com/amplitude}requestHeader"/>
 *         &lt;element name="getCustomerContactListRequest" type="{http://soprabanking.com/amplitude}getCustomerContactListRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerContactListRequestFlow", propOrder = {
    "requestHeader",
    "getCustomerContactListRequest"
})
public class GetCustomerContactListRequestFlow {

    @XmlElement(required = true)
    protected RequestHeader requestHeader;
    @XmlElement(required = true)
    protected GetCustomerContactListRequest getCustomerContactListRequest;

    /**
     * Obtient la valeur de la propriété requestHeader.
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
     * Définit la valeur de la propriété requestHeader.
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
     * Obtient la valeur de la propriété getCustomerContactListRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerContactListRequest }
     *     
     */
    public GetCustomerContactListRequest getGetCustomerContactListRequest() {
        return getCustomerContactListRequest;
    }

    /**
     * Définit la valeur de la propriété getCustomerContactListRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerContactListRequest }
     *     
     */
    public void setGetCustomerContactListRequest(GetCustomerContactListRequest value) {
        this.getCustomerContactListRequest = value;
    }

}
