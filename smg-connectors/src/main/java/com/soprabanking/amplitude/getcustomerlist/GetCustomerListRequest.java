
package com.soprabanking.amplitude.getcustomerlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCustomerListRequest complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCustomerListRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://soprabanking.com/amplitude}populationFile" minOccurs="0"/>
 *         &lt;element name="qualityCode" type="{http://soprabanking.com/amplitude}customerQuality" minOccurs="0"/>
 *         &lt;element name="individual" type="{http://soprabanking.com/amplitude}individual" minOccurs="0"/>
 *         &lt;element name="corporate" type="{http://soprabanking.com/amplitude}corporate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerListRequest", propOrder = {
    "customer",
    "qualityCode",
    "individual",
    "corporate"
})
public class GetCustomerListRequest {

    protected PopulationFile customer;
    protected CustomerQuality qualityCode;
    protected Individual individual;
    protected Corporate corporate;

    /**
     * Obtient la valeur de la propri�t� customer.
     * 
     * @return
     *     possible object is
     *     {@link PopulationFile }
     *     
     */
    public PopulationFile getCustomer() {
        return customer;
    }

    /**
     * D�finit la valeur de la propri�t� customer.
     * 
     * @param value
     *     allowed object is
     *     {@link PopulationFile }
     *     
     */
    public void setCustomer(PopulationFile value) {
        this.customer = value;
    }

    /**
     * Obtient la valeur de la propri�t� qualityCode.
     * 
     * @return
     *     possible object is
     *     {@link CustomerQuality }
     *     
     */
    public CustomerQuality getQualityCode() {
        return qualityCode;
    }

    /**
     * D�finit la valeur de la propri�t� qualityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerQuality }
     *     
     */
    public void setQualityCode(CustomerQuality value) {
        this.qualityCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� individual.
     * 
     * @return
     *     possible object is
     *     {@link Individual }
     *     
     */
    public Individual getIndividual() {
        return individual;
    }

    /**
     * D�finit la valeur de la propri�t� individual.
     * 
     * @param value
     *     allowed object is
     *     {@link Individual }
     *     
     */
    public void setIndividual(Individual value) {
        this.individual = value;
    }

    /**
     * Obtient la valeur de la propri�t� corporate.
     * 
     * @return
     *     possible object is
     *     {@link Corporate }
     *     
     */
    public Corporate getCorporate() {
        return corporate;
    }

    /**
     * D�finit la valeur de la propri�t� corporate.
     * 
     * @param value
     *     allowed object is
     *     {@link Corporate }
     *     
     */
    public void setCorporate(Corporate value) {
        this.corporate = value;
    }

}
