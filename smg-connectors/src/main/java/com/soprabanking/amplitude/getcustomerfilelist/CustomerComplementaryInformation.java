
package com.soprabanking.amplitude.getcustomerfilelist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour customerComplementaryInformation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerComplementaryInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="complementaryInformation" type="{http://soprabanking.com/amplitude}comparisonAdditionalData"/>
 *         &lt;element name="designation" type="{http://soprabanking.com/amplitude}charMax30" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerComplementaryInformation", propOrder = {
    "complementaryInformation",
    "designation"
})
public class CustomerComplementaryInformation {

    @XmlElement(required = true)
    protected ComparisonAdditionalData complementaryInformation;
    protected String designation;

    /**
     * Obtient la valeur de la propriété complementaryInformation.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonAdditionalData }
     *     
     */
    public ComparisonAdditionalData getComplementaryInformation() {
        return complementaryInformation;
    }

    /**
     * Définit la valeur de la propriété complementaryInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonAdditionalData }
     *     
     */
    public void setComplementaryInformation(ComparisonAdditionalData value) {
        this.complementaryInformation = value;
    }

    /**
     * Obtient la valeur de la propriété designation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Définit la valeur de la propriété designation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignation(String value) {
        this.designation = value;
    }

}
