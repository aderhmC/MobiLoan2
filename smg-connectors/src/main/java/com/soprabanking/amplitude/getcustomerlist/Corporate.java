
package com.soprabanking.amplitude.getcustomerlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour corporate complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="corporate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="corporateName" type="{http://soprabanking.com/amplitude}charMax65" minOccurs="0"/>
 *         &lt;element name="abbreviation" type="{http://soprabanking.com/amplitude}charMax20" minOccurs="0"/>
 *         &lt;element name="tradeRegisterNumber" type="{http://soprabanking.com/amplitude}charMax20" minOccurs="0"/>
 *         &lt;element name="businessLicenseNumber" type="{http://soprabanking.com/amplitude}charMax20" minOccurs="0"/>
 *         &lt;element name="taxIdentityNumber" type="{http://soprabanking.com/amplitude}charMax20" minOccurs="0"/>
 *         &lt;element name="customersGroup" type="{http://soprabanking.com/amplitude}customersGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "corporate", propOrder = {
    "corporateName",
    "abbreviation",
    "tradeRegisterNumber",
    "businessLicenseNumber",
    "taxIdentityNumber",
    "customersGroup"
})
public class Corporate {

    protected String corporateName;
    protected String abbreviation;
    protected String tradeRegisterNumber;
    protected String businessLicenseNumber;
    protected String taxIdentityNumber;
    protected CustomersGroup customersGroup;

    /**
     * Obtient la valeur de la propri�t� corporateName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateName() {
        return corporateName;
    }

    /**
     * D�finit la valeur de la propri�t� corporateName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateName(String value) {
        this.corporateName = value;
    }

    /**
     * Obtient la valeur de la propri�t� abbreviation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * D�finit la valeur de la propri�t� abbreviation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
    }

    /**
     * Obtient la valeur de la propri�t� tradeRegisterNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeRegisterNumber() {
        return tradeRegisterNumber;
    }

    /**
     * D�finit la valeur de la propri�t� tradeRegisterNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeRegisterNumber(String value) {
        this.tradeRegisterNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� businessLicenseNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessLicenseNumber() {
        return businessLicenseNumber;
    }

    /**
     * D�finit la valeur de la propri�t� businessLicenseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessLicenseNumber(String value) {
        this.businessLicenseNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� taxIdentityNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdentityNumber() {
        return taxIdentityNumber;
    }

    /**
     * D�finit la valeur de la propri�t� taxIdentityNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdentityNumber(String value) {
        this.taxIdentityNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� customersGroup.
     * 
     * @return
     *     possible object is
     *     {@link CustomersGroup }
     *     
     */
    public CustomersGroup getCustomersGroup() {
        return customersGroup;
    }

    /**
     * D�finit la valeur de la propri�t� customersGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomersGroup }
     *     
     */
    public void setCustomersGroup(CustomersGroup value) {
        this.customersGroup = value;
    }

}
