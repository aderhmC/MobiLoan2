
package com.soprabanking.amplitude.getcustomerfilelist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour comparisonAdditionalDataValue complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="comparisonAdditionalDataValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="alphanumeric" type="{http://soprabanking.com/amplitude}designation" minOccurs="0"/>
 *         &lt;element name="amountOrRate" type="{http://soprabanking.com/amplitude}comparisonDecimal" minOccurs="0"/>
 *         &lt;element name="date" type="{http://soprabanking.com/amplitude}comparisonDate" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comparisonAdditionalDataValue", propOrder = {
    "alphanumeric",
    "amountOrRate",
    "date"
})
public class ComparisonAdditionalDataValue {

    protected Designation alphanumeric;
    protected ComparisonDecimal amountOrRate;
    protected ComparisonDate date;

    /**
     * Obtient la valeur de la propri�t� alphanumeric.
     * 
     * @return
     *     possible object is
     *     {@link Designation }
     *     
     */
    public Designation getAlphanumeric() {
        return alphanumeric;
    }

    /**
     * D�finit la valeur de la propri�t� alphanumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link Designation }
     *     
     */
    public void setAlphanumeric(Designation value) {
        this.alphanumeric = value;
    }

    /**
     * Obtient la valeur de la propri�t� amountOrRate.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonDecimal }
     *     
     */
    public ComparisonDecimal getAmountOrRate() {
        return amountOrRate;
    }

    /**
     * D�finit la valeur de la propri�t� amountOrRate.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonDecimal }
     *     
     */
    public void setAmountOrRate(ComparisonDecimal value) {
        this.amountOrRate = value;
    }

    /**
     * Obtient la valeur de la propri�t� date.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonDate }
     *     
     */
    public ComparisonDate getDate() {
        return date;
    }

    /**
     * D�finit la valeur de la propri�t� date.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonDate }
     *     
     */
    public void setDate(ComparisonDate value) {
        this.date = value;
    }

}
