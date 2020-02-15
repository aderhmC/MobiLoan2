
package com.soprabanking.amplitude.getcustomerbudgetdetail;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soprabanking.amplitude.getcustomerbudgetdetail package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ErrorResponseFlow_QNAME = new QName("http://soprabanking.com/amplitude", "errorResponseFlow");
    private final static QName _GetStatusRequestFlow_QNAME = new QName("http://soprabanking.com/amplitude", "getStatusRequestFlow");
    private final static QName _GetCustomerBudgetDetailRequestFlow_QNAME = new QName("http://soprabanking.com/amplitude", "getCustomerBudgetDetailRequestFlow");
    private final static QName _GetCustomerBudgetDetailResponseFlow_QNAME = new QName("http://soprabanking.com/amplitude", "getCustomerBudgetDetailResponseFlow");
    private final static QName _GetStatusResponseFlow_QNAME = new QName("http://soprabanking.com/amplitude", "getStatusResponseFlow");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soprabanking.amplitude.getcustomerbudgetdetail
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStatusResponseFlow }
     * 
     */
    public GetStatusResponseFlow createGetStatusResponseFlow() {
        return new GetStatusResponseFlow();
    }

    /**
     * Create an instance of {@link ErrorResponseFlow }
     * 
     */
    public ErrorResponseFlow createErrorResponseFlow() {
        return new ErrorResponseFlow();
    }

    /**
     * Create an instance of {@link GetStatusRequestFlow }
     * 
     */
    public GetStatusRequestFlow createGetStatusRequestFlow() {
        return new GetStatusRequestFlow();
    }

    /**
     * Create an instance of {@link GetCustomerBudgetDetailRequestFlow }
     * 
     */
    public GetCustomerBudgetDetailRequestFlow createGetCustomerBudgetDetailRequestFlow() {
        return new GetCustomerBudgetDetailRequestFlow();
    }

    /**
     * Create an instance of {@link GetCustomerBudgetDetailResponseFlow }
     * 
     */
    public GetCustomerBudgetDetailResponseFlow createGetCustomerBudgetDetailResponseFlow() {
        return new GetCustomerBudgetDetailResponseFlow();
    }

    /**
     * Create an instance of {@link ResponseStatusMessage }
     * 
     */
    public ResponseStatusMessage createResponseStatusMessage() {
        return new ResponseStatusMessage();
    }

    /**
     * Create an instance of {@link ResponseHeader }
     * 
     */
    public ResponseHeader createResponseHeader() {
        return new ResponseHeader();
    }

    /**
     * Create an instance of {@link Language }
     * 
     */
    public Language createLanguage() {
        return new Language();
    }

    /**
     * Create an instance of {@link CustomerBudgetDetail }
     * 
     */
    public CustomerBudgetDetail createCustomerBudgetDetail() {
        return new CustomerBudgetDetail();
    }

    /**
     * Create an instance of {@link TypeOfcustomerCharges }
     * 
     */
    public TypeOfcustomerCharges createTypeOfcustomerCharges() {
        return new TypeOfcustomerCharges();
    }

    /**
     * Create an instance of {@link CustomerChargeDetail }
     * 
     */
    public CustomerChargeDetail createCustomerChargeDetail() {
        return new CustomerChargeDetail();
    }

    /**
     * Create an instance of {@link SimpleCurrency }
     * 
     */
    public SimpleCurrency createSimpleCurrency() {
        return new SimpleCurrency();
    }

    /**
     * Create an instance of {@link CustomerIncomesDetail }
     * 
     */
    public CustomerIncomesDetail createCustomerIncomesDetail() {
        return new CustomerIncomesDetail();
    }

    /**
     * Create an instance of {@link CustomerIdentifier }
     * 
     */
    public CustomerIdentifier createCustomerIdentifier() {
        return new CustomerIdentifier();
    }

    /**
     * Create an instance of {@link AmountCurrency }
     * 
     */
    public AmountCurrency createAmountCurrency() {
        return new AmountCurrency();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link TypeOfcustomerIncomes }
     * 
     */
    public TypeOfcustomerIncomes createTypeOfcustomerIncomes() {
        return new TypeOfcustomerIncomes();
    }

    /**
     * Create an instance of {@link Amount }
     * 
     */
    public Amount createAmount() {
        return new Amount();
    }

    /**
     * Create an instance of {@link CustomerIncomeDetail }
     * 
     */
    public CustomerIncomeDetail createCustomerIncomeDetail() {
        return new CustomerIncomeDetail();
    }

    /**
     * Create an instance of {@link CustomerIncomeDetailIdentifier }
     * 
     */
    public CustomerIncomeDetailIdentifier createCustomerIncomeDetailIdentifier() {
        return new CustomerIncomeDetailIdentifier();
    }

    /**
     * Create an instance of {@link GetCustomerBudgetDetailResponse }
     * 
     */
    public GetCustomerBudgetDetailResponse createGetCustomerBudgetDetailResponse() {
        return new GetCustomerBudgetDetailResponse();
    }

    /**
     * Create an instance of {@link ResponseStatus }
     * 
     */
    public ResponseStatus createResponseStatus() {
        return new ResponseStatus();
    }

    /**
     * Create an instance of {@link GetCustomerBudgetDetailRequest }
     * 
     */
    public GetCustomerBudgetDetailRequest createGetCustomerBudgetDetailRequest() {
        return new GetCustomerBudgetDetailRequest();
    }

    /**
     * Create an instance of {@link ResponseStatusMessages }
     * 
     */
    public ResponseStatusMessages createResponseStatusMessages() {
        return new ResponseStatusMessages();
    }

    /**
     * Create an instance of {@link CustomerChargeDetailIdentifier }
     * 
     */
    public CustomerChargeDetailIdentifier createCustomerChargeDetailIdentifier() {
        return new CustomerChargeDetailIdentifier();
    }

    /**
     * Create an instance of {@link CustomerChargesDetail }
     * 
     */
    public CustomerChargesDetail createCustomerChargesDetail() {
        return new CustomerChargesDetail();
    }

    /**
     * Create an instance of {@link ErrorInformation }
     * 
     */
    public ErrorInformation createErrorInformation() {
        return new ErrorInformation();
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorResponseFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soprabanking.com/amplitude", name = "errorResponseFlow")
    public JAXBElement<ErrorResponseFlow> createErrorResponseFlow(ErrorResponseFlow value) {
        return new JAXBElement<ErrorResponseFlow>(_ErrorResponseFlow_QNAME, ErrorResponseFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusRequestFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soprabanking.com/amplitude", name = "getStatusRequestFlow")
    public JAXBElement<GetStatusRequestFlow> createGetStatusRequestFlow(GetStatusRequestFlow value) {
        return new JAXBElement<GetStatusRequestFlow>(_GetStatusRequestFlow_QNAME, GetStatusRequestFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerBudgetDetailRequestFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soprabanking.com/amplitude", name = "getCustomerBudgetDetailRequestFlow")
    public JAXBElement<GetCustomerBudgetDetailRequestFlow> createGetCustomerBudgetDetailRequestFlow(GetCustomerBudgetDetailRequestFlow value) {
        return new JAXBElement<GetCustomerBudgetDetailRequestFlow>(_GetCustomerBudgetDetailRequestFlow_QNAME, GetCustomerBudgetDetailRequestFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerBudgetDetailResponseFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soprabanking.com/amplitude", name = "getCustomerBudgetDetailResponseFlow")
    public JAXBElement<GetCustomerBudgetDetailResponseFlow> createGetCustomerBudgetDetailResponseFlow(GetCustomerBudgetDetailResponseFlow value) {
        return new JAXBElement<GetCustomerBudgetDetailResponseFlow>(_GetCustomerBudgetDetailResponseFlow_QNAME, GetCustomerBudgetDetailResponseFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusResponseFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soprabanking.com/amplitude", name = "getStatusResponseFlow")
    public JAXBElement<GetStatusResponseFlow> createGetStatusResponseFlow(GetStatusResponseFlow value) {
        return new JAXBElement<GetStatusResponseFlow>(_GetStatusResponseFlow_QNAME, GetStatusResponseFlow.class, null, value);
    }

}
