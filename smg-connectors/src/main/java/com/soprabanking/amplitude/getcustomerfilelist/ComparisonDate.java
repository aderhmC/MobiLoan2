
package com.soprabanking.amplitude.getcustomerfilelist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour comparisonDate complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="comparisonDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="date1" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="date2" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "comparisonDate", propOrder = {
    "date1",
    "date2",
    "comparator"
})
public class ComparisonDate {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date1;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date2;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Comparator comparator;

    /**
     * Obtient la valeur de la propri�t� date1.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate1() {
        return date1;
    }

    /**
     * D�finit la valeur de la propri�t� date1.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate1(XMLGregorianCalendar value) {
        this.date1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� date2.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate2() {
        return date2;
    }

    /**
     * D�finit la valeur de la propri�t� date2.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate2(XMLGregorianCalendar value) {
        this.date2 = value;
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
