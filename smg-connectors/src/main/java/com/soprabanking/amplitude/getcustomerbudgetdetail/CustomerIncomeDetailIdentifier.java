
package com.soprabanking.amplitude.getcustomerbudgetdetail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour customerIncomeDetailIdentifier complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerIncomeDetailIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerCode" type="{http://soprabanking.com/amplitude}customerCode"/>
 *         &lt;element name="displayOrderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerIncomeDetailIdentifier", propOrder = {
    "customerCode",
    "displayOrderNumber"
})
public class CustomerIncomeDetailIdentifier {

    @XmlElement(required = true)
    protected String customerCode;
    protected int displayOrderNumber;

    /**
     * Obtient la valeur de la propri�t� customerCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * D�finit la valeur de la propri�t� customerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� displayOrderNumber.
     * 
     */
    public int getDisplayOrderNumber() {
        return displayOrderNumber;
    }

    /**
     * D�finit la valeur de la propri�t� displayOrderNumber.
     * 
     */
    public void setDisplayOrderNumber(int value) {
        this.displayOrderNumber = value;
    }

}
