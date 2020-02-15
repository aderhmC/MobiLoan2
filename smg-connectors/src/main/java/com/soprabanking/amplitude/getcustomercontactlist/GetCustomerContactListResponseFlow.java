
package com.soprabanking.amplitude.getcustomercontactlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCustomerContactListResponseFlow complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCustomerContactListResponseFlow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseHeader" type="{http://soprabanking.com/amplitude}responseHeader"/>
 *         &lt;element name="responseStatus" type="{http://soprabanking.com/amplitude}responseStatus"/>
 *         &lt;element name="getCustomerContactListResponse" type="{http://soprabanking.com/amplitude}getCustomerContactListResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerContactListResponseFlow", propOrder = {
    "responseHeader",
    "responseStatus",
    "getCustomerContactListResponse"
})
public class GetCustomerContactListResponseFlow {

    @XmlElement(required = true)
    protected ResponseHeader responseHeader;
    @XmlElement(required = true)
    protected ResponseStatus responseStatus;
    protected GetCustomerContactListResponse getCustomerContactListResponse;

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
     * Obtient la valeur de la propriété getCustomerContactListResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerContactListResponse }
     *     
     */
    public GetCustomerContactListResponse getGetCustomerContactListResponse() {
        return getCustomerContactListResponse;
    }

    /**
     * Définit la valeur de la propriété getCustomerContactListResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerContactListResponse }
     *     
     */
    public void setGetCustomerContactListResponse(GetCustomerContactListResponse value) {
        this.getCustomerContactListResponse = value;
    }

}
