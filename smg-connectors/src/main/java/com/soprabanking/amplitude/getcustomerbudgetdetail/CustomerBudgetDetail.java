
package com.soprabanking.amplitude.getcustomerbudgetdetail;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour customerBudgetDetail complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerBudgetDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerCode" type="{http://soprabanking.com/amplitude}customerCode"/>
 *         &lt;element name="budgetReferenceYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="averageTaxRate" type="{http://soprabanking.com/amplitude}decimal15_7" minOccurs="0"/>
 *         &lt;element name="customerIncomesDetail" type="{http://soprabanking.com/amplitude}customerIncomesDetail" minOccurs="0"/>
 *         &lt;element name="customerChargesDetail" type="{http://soprabanking.com/amplitude}customerChargesDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerBudgetDetail", propOrder = {
    "customerCode",
    "budgetReferenceYear",
    "averageTaxRate",
    "customerIncomesDetail",
    "customerChargesDetail"
})
public class CustomerBudgetDetail {

    @XmlElement(required = true)
    protected String customerCode;
    protected Integer budgetReferenceYear;
    protected BigDecimal averageTaxRate;
    protected CustomerIncomesDetail customerIncomesDetail;
    protected CustomerChargesDetail customerChargesDetail;

    /**
     * Obtient la valeur de la propri�t� customerCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * D�finit la valeur de la propri�t� customerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� budgetReferenceYear.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBudgetReferenceYear() {
        return budgetReferenceYear;
    }

    /**
     * D�finit la valeur de la propri�t� budgetReferenceYear.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBudgetReferenceYear(Integer value) {
        this.budgetReferenceYear = value;
    }

    /**
     * Obtient la valeur de la propri�t� averageTaxRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageTaxRate() {
        return averageTaxRate;
    }

    /**
     * D�finit la valeur de la propri�t� averageTaxRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageTaxRate(BigDecimal value) {
        this.averageTaxRate = value;
    }

    /**
     * Obtient la valeur de la propri�t� customerIncomesDetail.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIncomesDetail }
     *     
     */
    public CustomerIncomesDetail getCustomerIncomesDetail() {
        return customerIncomesDetail;
    }

    /**
     * D�finit la valeur de la propri�t� customerIncomesDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIncomesDetail }
     *     
     */
    public void setCustomerIncomesDetail(CustomerIncomesDetail value) {
        this.customerIncomesDetail = value;
    }

    /**
     * Obtient la valeur de la propri�t� customerChargesDetail.
     * 
     * @return
     *     possible object is
     *     {@link CustomerChargesDetail }
     *     
     */
    public CustomerChargesDetail getCustomerChargesDetail() {
        return customerChargesDetail;
    }

    /**
     * D�finit la valeur de la propri�t� customerChargesDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerChargesDetail }
     *     
     */
    public void setCustomerChargesDetail(CustomerChargesDetail value) {
        this.customerChargesDetail = value;
    }

}
