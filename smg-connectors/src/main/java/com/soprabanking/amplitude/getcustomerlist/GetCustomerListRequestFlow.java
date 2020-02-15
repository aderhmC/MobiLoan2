
package com.soprabanking.amplitude.getcustomerlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCustomerListRequestFlow complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCustomerListRequestFlow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestHeader" type="{http://soprabanking.com/amplitude}requestHeader"/>
 *         &lt;element name="getCustomerListRequest" type="{http://soprabanking.com/amplitude}getCustomerListRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerListRequestFlow", propOrder = {
    "requestHeader",
    "getCustomerListRequest"
})
public class GetCustomerListRequestFlow {

    @XmlElement(required = true)
    protected RequestHeader requestHeader;
    @XmlElement(required = true)
    protected GetCustomerListRequest getCustomerListRequest;

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
     * Obtient la valeur de la propriété getCustomerListRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerListRequest }
     *     
     */
    public GetCustomerListRequest getGetCustomerListRequest() {
        return getCustomerListRequest;
    }

    /**
     * Définit la valeur de la propriété getCustomerListRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerListRequest }
     *     
     */
    public void setGetCustomerListRequest(GetCustomerListRequest value) {
        this.getCustomerListRequest = value;
    }

}
