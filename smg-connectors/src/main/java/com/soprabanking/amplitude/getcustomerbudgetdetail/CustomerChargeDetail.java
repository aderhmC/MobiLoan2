
package com.soprabanking.amplitude.getcustomerbudgetdetail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour customerChargeDetail complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerChargeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://soprabanking.com/amplitude}customerChargeDetailIdentifier"/>
 *         &lt;element name="chargeCode" type="{http://soprabanking.com/amplitude}typeOfcustomerCharges" minOccurs="0"/>
 *         &lt;element name="periodicityCode" type="{http://soprabanking.com/amplitude}periodicity" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://soprabanking.com/amplitude}amount" minOccurs="0"/>
 *         &lt;element name="initialAmount" type="{http://soprabanking.com/amplitude}amount" minOccurs="0"/>
 *         &lt;element name="maturityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="organisation" type="{http://soprabanking.com/amplitude}charMax30" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerChargeDetail", propOrder = {
    "identifier",
    "chargeCode",
    "periodicityCode",
    "amount",
    "initialAmount",
    "maturityDate",
    "organisation"
})
public class CustomerChargeDetail {

    @XmlElement(required = true)
    protected CustomerChargeDetailIdentifier identifier;
    protected TypeOfcustomerCharges chargeCode;
    @XmlSchemaType(name = "string")
    protected Periodicity periodicityCode;
    protected Amount amount;
    protected Amount initialAmount;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar maturityDate;
    protected String organisation;

    /**
     * Obtient la valeur de la propri�t� identifier.
     * 
     * @return
     *     possible object is
     *     {@link CustomerChargeDetailIdentifier }
     *     
     */
    public CustomerChargeDetailIdentifier getIdentifier() {
        return identifier;
    }

    /**
     * D�finit la valeur de la propri�t� identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerChargeDetailIdentifier }
     *     
     */
    public void setIdentifier(CustomerChargeDetailIdentifier value) {
        this.identifier = value;
    }

    /**
     * Obtient la valeur de la propri�t� chargeCode.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfcustomerCharges }
     *     
     */
    public TypeOfcustomerCharges getChargeCode() {
        return chargeCode;
    }

    /**
     * D�finit la valeur de la propri�t� chargeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfcustomerCharges }
     *     
     */
    public void setChargeCode(TypeOfcustomerCharges value) {
        this.chargeCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� periodicityCode.
     * 
     * @return
     *     possible object is
     *     {@link Periodicity }
     *     
     */
    public Periodicity getPeriodicityCode() {
        return periodicityCode;
    }

    /**
     * D�finit la valeur de la propri�t� periodicityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Periodicity }
     *     
     */
    public void setPeriodicityCode(Periodicity value) {
        this.periodicityCode = value;
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

    /**
     * Obtient la valeur de la propri�t� initialAmount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getInitialAmount() {
        return initialAmount;
    }

    /**
     * D�finit la valeur de la propri�t� initialAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setInitialAmount(Amount value) {
        this.initialAmount = value;
    }

    /**
     * Obtient la valeur de la propri�t� maturityDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaturityDate() {
        return maturityDate;
    }

    /**
     * D�finit la valeur de la propri�t� maturityDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaturityDate(XMLGregorianCalendar value) {
        this.maturityDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� organisation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisation() {
        return organisation;
    }

    /**
     * D�finit la valeur de la propri�t� organisation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisation(String value) {
        this.organisation = value;
    }

}
