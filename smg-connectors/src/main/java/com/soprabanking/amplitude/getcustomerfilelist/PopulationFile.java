
package com.soprabanking.amplitude.getcustomerfilelist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour populationFile complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="populationFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://soprabanking.com/amplitude}restrictedCustomer" minOccurs="0"/>
 *         &lt;element name="customerType" type="{http://soprabanking.com/amplitude}customerType" minOccurs="0"/>
 *         &lt;element name="activeProfile" type="{http://soprabanking.com/amplitude}customerProfile" minOccurs="0"/>
 *         &lt;element name="nationalIdentifier" type="{http://soprabanking.com/amplitude}charMax20" minOccurs="0"/>
 *         &lt;element name="customerOfficer" type="{http://soprabanking.com/amplitude}customerOfficer" minOccurs="0"/>
 *         &lt;element name="additionalInformation" type="{http://soprabanking.com/amplitude}customerComplementaryInformation" minOccurs="0"/>
 *         &lt;element name="externalReference" type="{http://soprabanking.com/amplitude}charMax25" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "populationFile", propOrder = {
    "customer",
    "customerType",
    "activeProfile",
    "nationalIdentifier",
    "customerOfficer",
    "additionalInformation",
    "externalReference"
})
public class PopulationFile {

    protected RestrictedCustomer customer;
    protected String customerType;
    protected CustomerProfile activeProfile;
    protected String nationalIdentifier;
    protected CustomerOfficer customerOfficer;
    protected CustomerComplementaryInformation additionalInformation;
    protected String externalReference;

    /**
     * Obtient la valeur de la propri�t� customer.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedCustomer }
     *     
     */
    public RestrictedCustomer getCustomer() {
        return customer;
    }

    /**
     * D�finit la valeur de la propri�t� customer.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedCustomer }
     *     
     */
    public void setCustomer(RestrictedCustomer value) {
        this.customer = value;
    }

    /**
     * Obtient la valeur de la propri�t� customerType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * D�finit la valeur de la propri�t� customerType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Obtient la valeur de la propri�t� activeProfile.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfile }
     *     
     */
    public CustomerProfile getActiveProfile() {
        return activeProfile;
    }

    /**
     * D�finit la valeur de la propri�t� activeProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfile }
     *     
     */
    public void setActiveProfile(CustomerProfile value) {
        this.activeProfile = value;
    }

    /**
     * Obtient la valeur de la propri�t� nationalIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdentifier() {
        return nationalIdentifier;
    }

    /**
     * D�finit la valeur de la propri�t� nationalIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdentifier(String value) {
        this.nationalIdentifier = value;
    }

    /**
     * Obtient la valeur de la propri�t� customerOfficer.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOfficer }
     *     
     */
    public CustomerOfficer getCustomerOfficer() {
        return customerOfficer;
    }

    /**
     * D�finit la valeur de la propri�t� customerOfficer.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOfficer }
     *     
     */
    public void setCustomerOfficer(CustomerOfficer value) {
        this.customerOfficer = value;
    }

    /**
     * Obtient la valeur de la propri�t� additionalInformation.
     * 
     * @return
     *     possible object is
     *     {@link CustomerComplementaryInformation }
     *     
     */
    public CustomerComplementaryInformation getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * D�finit la valeur de la propri�t� additionalInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerComplementaryInformation }
     *     
     */
    public void setAdditionalInformation(CustomerComplementaryInformation value) {
        this.additionalInformation = value;
    }

    /**
     * Obtient la valeur de la propri�t� externalReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * D�finit la valeur de la propri�t� externalReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

}
