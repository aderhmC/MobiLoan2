
package com.soprabanking.amplitude.getcustomerlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour comparisonAdditionalData complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="comparisonAdditionalData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://soprabanking.com/amplitude}charMax10"/>
 *         &lt;element name="value" type="{http://soprabanking.com/amplitude}comparisonAdditionalDataValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comparisonAdditionalData", propOrder = {
    "identifier",
    "value"
})
public class ComparisonAdditionalData {

    @XmlElement(required = true)
    protected String identifier;
    @XmlElement(required = true)
    protected ComparisonAdditionalDataValue value;

    /**
     * Obtient la valeur de la propriété identifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Définit la valeur de la propriété identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonAdditionalDataValue }
     *     
     */
    public ComparisonAdditionalDataValue getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonAdditionalDataValue }
     *     
     */
    public void setValue(ComparisonAdditionalDataValue value) {
        this.value = value;
    }

}
