
package com.soprabanking.amplitude.getcustomerlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour individual complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="individual">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastname" type="{http://soprabanking.com/amplitude}charMax36" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://soprabanking.com/amplitude}charMax30" minOccurs="0"/>
 *         &lt;element name="middlename" type="{http://soprabanking.com/amplitude}charMax30" minOccurs="0"/>
 *         &lt;element name="thirdName" type="{http://soprabanking.com/amplitude}charMax30" minOccurs="0"/>
 *         &lt;element name="birthdate" type="{http://soprabanking.com/amplitude}comparisonDate" minOccurs="0"/>
 *         &lt;element name="idPaper" type="{http://soprabanking.com/amplitude}idPaper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "individual", propOrder = {
    "lastname",
    "firstname",
    "middlename",
    "thirdName",
    "birthdate",
    "idPaper"
})
public class Individual {

    protected String lastname;
    protected String firstname;
    protected String middlename;
    protected String thirdName;
    protected ComparisonDate birthdate;
    protected IdPaper idPaper;

    /**
     * Obtient la valeur de la propriété lastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Définit la valeur de la propriété lastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Obtient la valeur de la propriété firstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Définit la valeur de la propriété firstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Obtient la valeur de la propriété middlename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * Définit la valeur de la propriété middlename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlename(String value) {
        this.middlename = value;
    }

    /**
     * Obtient la valeur de la propriété thirdName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdName() {
        return thirdName;
    }

    /**
     * Définit la valeur de la propriété thirdName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdName(String value) {
        this.thirdName = value;
    }

    /**
     * Obtient la valeur de la propriété birthdate.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonDate }
     *     
     */
    public ComparisonDate getBirthdate() {
        return birthdate;
    }

    /**
     * Définit la valeur de la propriété birthdate.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonDate }
     *     
     */
    public void setBirthdate(ComparisonDate value) {
        this.birthdate = value;
    }

    /**
     * Obtient la valeur de la propriété idPaper.
     * 
     * @return
     *     possible object is
     *     {@link IdPaper }
     *     
     */
    public IdPaper getIdPaper() {
        return idPaper;
    }

    /**
     * Définit la valeur de la propriété idPaper.
     * 
     * @param value
     *     allowed object is
     *     {@link IdPaper }
     *     
     */
    public void setIdPaper(IdPaper value) {
        this.idPaper = value;
    }

}
