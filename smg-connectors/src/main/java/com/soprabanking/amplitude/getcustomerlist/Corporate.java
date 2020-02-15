
package com.soprabanking.amplitude.getcustomerlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour corporate complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété corporateName.
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
     * Définit la valeur de la propriété corporateName.
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
     * Obtient la valeur de la propriété abbreviation.
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
     * Définit la valeur de la propriété abbreviation.
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
     * Obtient la valeur de la propriété tradeRegisterNumber.
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
     * Définit la valeur de la propriété tradeRegisterNumber.
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
     * Obtient la valeur de la propriété businessLicenseNumber.
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
     * Définit la valeur de la propriété businessLicenseNumber.
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
     * Obtient la valeur de la propriété taxIdentityNumber.
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
     * Définit la valeur de la propriété taxIdentityNumber.
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
     * Obtient la valeur de la propriété customersGroup.
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
     * Définit la valeur de la propriété customersGroup.
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
