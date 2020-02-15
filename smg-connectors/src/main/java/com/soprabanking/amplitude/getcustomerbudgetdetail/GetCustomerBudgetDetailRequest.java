
package com.soprabanking.amplitude.getcustomerbudgetdetail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCustomerBudgetDetailRequest complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCustomerBudgetDetailRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerIdentifier" type="{http://soprabanking.com/amplitude}customerIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerBudgetDetailRequest", propOrder = {
    "customerIdentifier"
})
public class GetCustomerBudgetDetailRequest {

    @XmlElement(required = true)
    protected CustomerIdentifier customerIdentifier;

    /**
     * Obtient la valeur de la propri�t� customerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentifier }
     *     
     */
    public CustomerIdentifier getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * D�finit la valeur de la propri�t� customerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentifier }
     *     
     */
    public void setCustomerIdentifier(CustomerIdentifier value) {
        this.customerIdentifier = value;
    }

}
