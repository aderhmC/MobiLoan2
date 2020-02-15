
package com.soprabanking.amplitude.getcustomerfilelist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour designation complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="designation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comparisonOperator" type="{http://soprabanking.com/amplitude}comparisonOperator"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "designation", propOrder = {
    "value",
    "comparisonOperator"
})
public class Designation {

    @XmlElement(required = true)
    protected String value;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ComparisonOperator comparisonOperator;

    /**
     * Obtient la valeur de la propri�t� value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * D�finit la valeur de la propri�t� value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propri�t� comparisonOperator.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperator }
     *     
     */
    public ComparisonOperator getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * D�finit la valeur de la propri�t� comparisonOperator.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperator }
     *     
     */
    public void setComparisonOperator(ComparisonOperator value) {
        this.comparisonOperator = value;
    }

}
