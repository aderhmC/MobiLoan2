
package com.soprabanking.amplitude.getcustomerfilelist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCustomerFileListResponseFlow complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCustomerFileListResponseFlow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseHeader" type="{http://soprabanking.com/amplitude}responseHeader"/>
 *         &lt;element name="responseStatus" type="{http://soprabanking.com/amplitude}responseStatus"/>
 *         &lt;element name="getCustomerFileListResponse" type="{http://soprabanking.com/amplitude}getCustomerFileListResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerFileListResponseFlow", propOrder = {
    "responseHeader",
    "responseStatus",
    "getCustomerFileListResponse"
})
public class GetCustomerFileListResponseFlow {

    @XmlElement(required = true)
    protected ResponseHeader responseHeader;
    @XmlElement(required = true)
    protected ResponseStatus responseStatus;
    protected GetCustomerFileListResponse getCustomerFileListResponse;

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
     * Obtient la valeur de la propriété getCustomerFileListResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerFileListResponse }
     *     
     */
    public GetCustomerFileListResponse getGetCustomerFileListResponse() {
        return getCustomerFileListResponse;
    }

    /**
     * Définit la valeur de la propriété getCustomerFileListResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerFileListResponse }
     *     
     */
    public void setGetCustomerFileListResponse(GetCustomerFileListResponse value) {
        this.getCustomerFileListResponse = value;
    }

}
