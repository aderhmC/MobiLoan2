
package com.soprabanking.amplitude.getcustomerfilelist;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour amount complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="amount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://soprabanking.com/amplitude}decimal19_4"/>
 *         &lt;element name="currency" type="{http://soprabanking.com/amplitude}amountCurrency"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "amount", propOrder = {
    "amount",
    "currency"
})
public class Amount {

    @XmlElement(required = true)
    protected BigDecimal amount;
    @XmlElement(required = true)
    protected AmountCurrency currency;

    /**
     * Obtient la valeur de la propriété amount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Définit la valeur de la propriété amount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Obtient la valeur de la propriété currency.
     * 
     * @return
     *     possible object is
     *     {@link AmountCurrency }
     *     
     */
    public AmountCurrency getCurrency() {
        return currency;
    }

    /**
     * Définit la valeur de la propriété currency.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountCurrency }
     *     
     */
    public void setCurrency(AmountCurrency value) {
        this.currency = value;
    }

}
