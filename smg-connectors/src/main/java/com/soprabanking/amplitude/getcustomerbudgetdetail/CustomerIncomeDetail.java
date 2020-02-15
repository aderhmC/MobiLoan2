
package com.soprabanking.amplitude.getcustomerbudgetdetail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour customerIncomeDetail complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerIncomeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://soprabanking.com/amplitude}customerIncomeDetailIdentifier"/>
 *         &lt;element name="incomeCode" type="{http://soprabanking.com/amplitude}typeOfcustomerIncomes" minOccurs="0"/>
 *         &lt;element name="incomePeriodicityCode" type="{http://soprabanking.com/amplitude}periodicity" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://soprabanking.com/amplitude}amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerIncomeDetail", propOrder = {
    "identifier",
    "incomeCode",
    "incomePeriodicityCode",
    "amount"
})
public class CustomerIncomeDetail {

    @XmlElement(required = true)
    protected CustomerIncomeDetailIdentifier identifier;
    protected TypeOfcustomerIncomes incomeCode;
    @XmlSchemaType(name = "string")
    protected Periodicity incomePeriodicityCode;
    protected Amount amount;

    /**
     * Obtient la valeur de la propri�t� identifier.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIncomeDetailIdentifier }
     *     
     */
    public CustomerIncomeDetailIdentifier getIdentifier() {
        return identifier;
    }

    /**
     * D�finit la valeur de la propri�t� identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIncomeDetailIdentifier }
     *     
     */
    public void setIdentifier(CustomerIncomeDetailIdentifier value) {
        this.identifier = value;
    }

    /**
     * Obtient la valeur de la propri�t� incomeCode.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfcustomerIncomes }
     *     
     */
    public TypeOfcustomerIncomes getIncomeCode() {
        return incomeCode;
    }

    /**
     * D�finit la valeur de la propri�t� incomeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfcustomerIncomes }
     *     
     */
    public void setIncomeCode(TypeOfcustomerIncomes value) {
        this.incomeCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� incomePeriodicityCode.
     * 
     * @return
     *     possible object is
     *     {@link Periodicity }
     *     
     */
    public Periodicity getIncomePeriodicityCode() {
        return incomePeriodicityCode;
    }

    /**
     * D�finit la valeur de la propri�t� incomePeriodicityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Periodicity }
     *     
     */
    public void setIncomePeriodicityCode(Periodicity value) {
        this.incomePeriodicityCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� amount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * D�finit la valeur de la propri�t� amount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

}
