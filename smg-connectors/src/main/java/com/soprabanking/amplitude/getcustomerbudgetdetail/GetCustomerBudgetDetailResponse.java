
package com.soprabanking.amplitude.getcustomerbudgetdetail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCustomerBudgetDetailResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCustomerBudgetDetailResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerBudgetDetail" type="{http://soprabanking.com/amplitude}customerBudgetDetail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerBudgetDetailResponse", propOrder = {
    "customerBudgetDetail"
})
public class GetCustomerBudgetDetailResponse {

    @XmlElement(required = true)
    protected CustomerBudgetDetail customerBudgetDetail;

    /**
     * Obtient la valeur de la propriété customerBudgetDetail.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBudgetDetail }
     *     
     */
    public CustomerBudgetDetail getCustomerBudgetDetail() {
        return customerBudgetDetail;
    }

    /**
     * Définit la valeur de la propriété customerBudgetDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBudgetDetail }
     *     
     */
    public void setCustomerBudgetDetail(CustomerBudgetDetail value) {
        this.customerBudgetDetail = value;
    }

}
