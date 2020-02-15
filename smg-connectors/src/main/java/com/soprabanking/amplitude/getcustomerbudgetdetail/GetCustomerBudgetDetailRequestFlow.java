
package com.soprabanking.amplitude.getcustomerbudgetdetail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCustomerBudgetDetailRequestFlow complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCustomerBudgetDetailRequestFlow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestHeader" type="{http://soprabanking.com/amplitude}requestHeader"/>
 *         &lt;element name="getCustomerBudgetDetailRequest" type="{http://soprabanking.com/amplitude}getCustomerBudgetDetailRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerBudgetDetailRequestFlow", propOrder = {
    "requestHeader",
    "getCustomerBudgetDetailRequest"
})
public class GetCustomerBudgetDetailRequestFlow {

    @XmlElement(required = true)
    protected RequestHeader requestHeader;
    @XmlElement(required = true)
    protected GetCustomerBudgetDetailRequest getCustomerBudgetDetailRequest;

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
     * Obtient la valeur de la propriété getCustomerBudgetDetailRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerBudgetDetailRequest }
     *     
     */
    public GetCustomerBudgetDetailRequest getGetCustomerBudgetDetailRequest() {
        return getCustomerBudgetDetailRequest;
    }

    /**
     * Définit la valeur de la propriété getCustomerBudgetDetailRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerBudgetDetailRequest }
     *     
     */
    public void setGetCustomerBudgetDetailRequest(GetCustomerBudgetDetailRequest value) {
        this.getCustomerBudgetDetailRequest = value;
    }

}
