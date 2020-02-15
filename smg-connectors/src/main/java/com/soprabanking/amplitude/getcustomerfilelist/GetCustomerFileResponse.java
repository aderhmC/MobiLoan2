
package com.soprabanking.amplitude.getcustomerfilelist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCustomerFileResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCustomerFileResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://soprabanking.com/amplitude}populationFile" minOccurs="0"/>
 *         &lt;element name="module" type="{http://soprabanking.com/amplitude}module" minOccurs="0"/>
 *         &lt;element name="branch" type="{http://soprabanking.com/amplitude}branch" minOccurs="0"/>
 *         &lt;element name="fileIdentifier" type="{http://soprabanking.com/amplitude}charMax15" minOccurs="0"/>
 *         &lt;element name="fileType" type="{http://soprabanking.com/amplitude}char3" minOccurs="0"/>
 *         &lt;element name="currencyFile" type="{http://soprabanking.com/amplitude}simpleCurrency" minOccurs="0"/>
 *         &lt;element name="installmentDate" type="{http://soprabanking.com/amplitude}comparisonDate" minOccurs="0"/>
 *         &lt;element name="maturityDate" type="{http://soprabanking.com/amplitude}comparisonDate" minOccurs="0"/>
 *         &lt;element name="currencyOfResult" type="{http://soprabanking.com/amplitude}simpleCurrency" minOccurs="0"/>
 *         &lt;element name="originalFileAmount" type="{http://soprabanking.com/amplitude}amount" minOccurs="0"/>
 *         &lt;element name="oustandingFileAmount" type="{http://soprabanking.com/amplitude}amount" minOccurs="0"/>
 *         &lt;element name="originalFileAmountInCurrencyOfResult" type="{http://soprabanking.com/amplitude}amount" minOccurs="0"/>
 *         &lt;element name="oustandingFileAmountInCurrencyOfResult" type="{http://soprabanking.com/amplitude}amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerFileResponse", propOrder = {
    "customer",
    "module",
    "branch",
    "fileIdentifier",
    "fileType",
    "currencyFile",
    "installmentDate",
    "maturityDate",
    "currencyOfResult",
    "originalFileAmount",
    "oustandingFileAmount",
    "originalFileAmountInCurrencyOfResult",
    "oustandingFileAmountInCurrencyOfResult"
})
public class GetCustomerFileResponse {

    protected PopulationFile customer;
    protected Module module;
    protected Branch branch;
    protected String fileIdentifier;
    protected String fileType;
    protected SimpleCurrency currencyFile;
    protected ComparisonDate installmentDate;
    protected ComparisonDate maturityDate;
    protected SimpleCurrency currencyOfResult;
    protected Amount originalFileAmount;
    protected Amount oustandingFileAmount;
    protected Amount originalFileAmountInCurrencyOfResult;
    protected Amount oustandingFileAmountInCurrencyOfResult;

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
     * Obtient la valeur de la propri�t� module.
     * 
     * @return
     *     possible object is
     *     {@link Module }
     *     
     */
    public Module getModule() {
        return module;
    }

    /**
     * D�finit la valeur de la propri�t� module.
     * 
     * @param value
     *     allowed object is
     *     {@link Module }
     *     
     */
    public void setModule(Module value) {
        this.module = value;
    }

    /**
     * Obtient la valeur de la propri�t� branch.
     * 
     * @return
     *     possible object is
     *     {@link Branch }
     *     
     */
    public Branch getBranch() {
        return branch;
    }

    /**
     * D�finit la valeur de la propri�t� branch.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch }
     *     
     */
    public void setBranch(Branch value) {
        this.branch = value;
    }

    /**
     * Obtient la valeur de la propri�t� fileIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileIdentifier() {
        return fileIdentifier;
    }

    /**
     * D�finit la valeur de la propri�t� fileIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileIdentifier(String value) {
        this.fileIdentifier = value;
    }

    /**
     * Obtient la valeur de la propri�t� fileType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * D�finit la valeur de la propri�t� fileType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * Obtient la valeur de la propri�t� currencyFile.
     * 
     * @return
     *     possible object is
     *     {@link SimpleCurrency }
     *     
     */
    public SimpleCurrency getCurrencyFile() {
        return currencyFile;
    }

    /**
     * D�finit la valeur de la propri�t� currencyFile.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleCurrency }
     *     
     */
    public void setCurrencyFile(SimpleCurrency value) {
        this.currencyFile = value;
    }

    /**
     * Obtient la valeur de la propri�t� installmentDate.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonDate }
     *     
     */
    public ComparisonDate getInstallmentDate() {
        return installmentDate;
    }

    /**
     * D�finit la valeur de la propri�t� installmentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonDate }
     *     
     */
    public void setInstallmentDate(ComparisonDate value) {
        this.installmentDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� maturityDate.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonDate }
     *     
     */
    public ComparisonDate getMaturityDate() {
        return maturityDate;
    }

    /**
     * D�finit la valeur de la propri�t� maturityDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonDate }
     *     
     */
    public void setMaturityDate(ComparisonDate value) {
        this.maturityDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� currencyOfResult.
     * 
     * @return
     *     possible object is
     *     {@link SimpleCurrency }
     *     
     */
    public SimpleCurrency getCurrencyOfResult() {
        return currencyOfResult;
    }

    /**
     * D�finit la valeur de la propri�t� currencyOfResult.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleCurrency }
     *     
     */
    public void setCurrencyOfResult(SimpleCurrency value) {
        this.currencyOfResult = value;
    }

    /**
     * Obtient la valeur de la propri�t� originalFileAmount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getOriginalFileAmount() {
        return originalFileAmount;
    }

    /**
     * D�finit la valeur de la propri�t� originalFileAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setOriginalFileAmount(Amount value) {
        this.originalFileAmount = value;
    }

    /**
     * Obtient la valeur de la propri�t� oustandingFileAmount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getOustandingFileAmount() {
        return oustandingFileAmount;
    }

    /**
     * D�finit la valeur de la propri�t� oustandingFileAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setOustandingFileAmount(Amount value) {
        this.oustandingFileAmount = value;
    }

    /**
     * Obtient la valeur de la propri�t� originalFileAmountInCurrencyOfResult.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getOriginalFileAmountInCurrencyOfResult() {
        return originalFileAmountInCurrencyOfResult;
    }

    /**
     * D�finit la valeur de la propri�t� originalFileAmountInCurrencyOfResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setOriginalFileAmountInCurrencyOfResult(Amount value) {
        this.originalFileAmountInCurrencyOfResult = value;
    }

    /**
     * Obtient la valeur de la propri�t� oustandingFileAmountInCurrencyOfResult.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getOustandingFileAmountInCurrencyOfResult() {
        return oustandingFileAmountInCurrencyOfResult;
    }

    /**
     * D�finit la valeur de la propri�t� oustandingFileAmountInCurrencyOfResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setOustandingFileAmountInCurrencyOfResult(Amount value) {
        this.oustandingFileAmountInCurrencyOfResult = value;
    }

}
