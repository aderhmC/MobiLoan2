
package com.soprabanking.amplitude.getcustomerphonenumberlist;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soprabanking.amplitude.getcustomerphonenumberlist package. 
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

    private final static QName _GetCustomerPhoneNumberListRequestFlow_QNAME = new QName("http://soprabanking.com/amplitude", "getCustomerPhoneNumberListRequestFlow");
    private final static QName _ErrorResponseFlow_QNAME = new QName("http://soprabanking.com/amplitude", "errorResponseFlow");
    private final static QName _GetStatusRequestFlow_QNAME = new QName("http://soprabanking.com/amplitude", "getStatusRequestFlow");
    private final static QName _GetCustomerPhoneNumberListResponseFlow_QNAME = new QName("http://soprabanking.com/amplitude", "getCustomerPhoneNumberListResponseFlow");
    private final static QName _GetStatusResponseFlow_QNAME = new QName("http://soprabanking.com/amplitude", "getStatusResponseFlow");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soprabanking.amplitude.getcustomerphonenumberlist
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerPhoneNumberListResponseFlow }
     * 
     */
    public GetCustomerPhoneNumberListResponseFlow createGetCustomerPhoneNumberListResponseFlow() {
        return new GetCustomerPhoneNumberListResponseFlow();
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
     * Create an instance of {@link GetCustomerPhoneNumberListRequestFlow }
     * 
     */
    public GetCustomerPhoneNumberListRequestFlow createGetCustomerPhoneNumberListRequestFlow() {
        return new GetCustomerPhoneNumberListRequestFlow();
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
     * Create an instance of {@link GetCustomerPhoneNumberListRequest }
     * 
     */
    public GetCustomerPhoneNumberListRequest createGetCustomerPhoneNumberListRequest() {
        return new GetCustomerPhoneNumberListRequest();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link PhoneType }
     * 
     */
    public PhoneType createPhoneType() {
        return new PhoneType();
    }

    /**
     * Create an instance of {@link FormatOfTelephoneNumber }
     * 
     */
    public FormatOfTelephoneNumber createFormatOfTelephoneNumber() {
        return new FormatOfTelephoneNumber();
    }

    /**
     * Create an instance of {@link ResponseStatus }
     * 
     */
    public ResponseStatus createResponseStatus() {
        return new ResponseStatus();
    }

    /**
     * Create an instance of {@link RestrictedCustomer }
     * 
     */
    public RestrictedCustomer createRestrictedCustomer() {
        return new RestrictedCustomer();
    }

    /**
     * Create an instance of {@link ResponseStatusMessages }
     * 
     */
    public ResponseStatusMessages createResponseStatusMessages() {
        return new ResponseStatusMessages();
    }

    /**
     * Create an instance of {@link GetCustomerPhoneNumberListResponse }
     * 
     */
    public GetCustomerPhoneNumberListResponse createGetCustomerPhoneNumberListResponse() {
        return new GetCustomerPhoneNumberListResponse();
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
     * Create an instance of {@link CustomerPhoneNumber }
     * 
     */
    public CustomerPhoneNumber createCustomerPhoneNumber() {
        return new CustomerPhoneNumber();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerPhoneNumberListRequestFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soprabanking.com/amplitude", name = "getCustomerPhoneNumberListRequestFlow")
    public JAXBElement<GetCustomerPhoneNumberListRequestFlow> createGetCustomerPhoneNumberListRequestFlow(GetCustomerPhoneNumberListRequestFlow value) {
        return new JAXBElement<GetCustomerPhoneNumberListRequestFlow>(_GetCustomerPhoneNumberListRequestFlow_QNAME, GetCustomerPhoneNumberListRequestFlow.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerPhoneNumberListResponseFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soprabanking.com/amplitude", name = "getCustomerPhoneNumberListResponseFlow")
    public JAXBElement<GetCustomerPhoneNumberListResponseFlow> createGetCustomerPhoneNumberListResponseFlow(GetCustomerPhoneNumberListResponseFlow value) {
        return new JAXBElement<GetCustomerPhoneNumberListResponseFlow>(_GetCustomerPhoneNumberListResponseFlow_QNAME, GetCustomerPhoneNumberListResponseFlow.class, null, value);
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
