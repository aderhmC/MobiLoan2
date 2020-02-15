
package com.soprabanking.amplitude.getcustomerfilelist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCustomerFileListRequestFlow complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCustomerFileListRequestFlow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestHeader" type="{http://soprabanking.com/amplitude}requestHeader"/>
 *         &lt;element name="getCustomerFileListRequest" type="{http://soprabanking.com/amplitude}getCustomerFileListRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerFileListRequestFlow", propOrder = {
    "requestHeader",
    "getCustomerFileListRequest"
})
public class GetCustomerFileListRequestFlow {

    @XmlElement(required = true)
    protected RequestHeader requestHeader;
    @XmlElement(required = true)
    protected GetCustomerFileListRequest getCustomerFileListRequest;

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
     * Obtient la valeur de la propriété getCustomerFileListRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerFileListRequest }
     *     
     */
    public GetCustomerFileListRequest getGetCustomerFileListRequest() {
        return getCustomerFileListRequest;
    }

    /**
     * Définit la valeur de la propriété getCustomerFileListRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerFileListRequest }
     *     
     */
    public void setGetCustomerFileListRequest(GetCustomerFileListRequest value) {
        this.getCustomerFileListRequest = value;
    }

}
