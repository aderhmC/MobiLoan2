
package com.soprabanking.amplitude.getcustomerfilelist;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour comparisonDecimal complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="comparisonDecimal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="decimal1" type="{http://soprabanking.com/amplitude}decimal32_16"/>
 *         &lt;element name="decimal2" type="{http://soprabanking.com/amplitude}decimal32_16" minOccurs="0"/>
 *         &lt;element name="comparator" type="{http://soprabanking.com/amplitude}comparator"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comparisonDecimal", propOrder = {
    "decimal1",
    "decimal2",
    "comparator"
})
public class ComparisonDecimal {

    @XmlElement(required = true)
    protected BigDecimal decimal1;
    protected BigDecimal decimal2;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Comparator comparator;

    /**
     * Obtient la valeur de la propri�t� decimal1.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimal1() {
        return decimal1;
    }

    /**
     * D�finit la valeur de la propri�t� decimal1.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimal1(BigDecimal value) {
        this.decimal1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� decimal2.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimal2() {
        return decimal2;
    }

    /**
     * D�finit la valeur de la propri�t� decimal2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimal2(BigDecimal value) {
        this.decimal2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� comparator.
     * 
     * @return
     *     possible object is
     *     {@link Comparator }
     *     
     */
    public Comparator getComparator() {
        return comparator;
    }

    /**
     * D�finit la valeur de la propri�t� comparator.
     * 
     * @param value
     *     allowed object is
     *     {@link Comparator }
     *     
     */
    public void setComparator(Comparator value) {
        this.comparator = value;
    }

}
