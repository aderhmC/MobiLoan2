
package com.soprabanking.amplitude.getcustomerdetail;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "getCustomerDetailPortType", targetNamespace = "http://soprabanking.com/amplitude")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetCustomerDetailPortType {


    /**
     * 
     * @param parameters
     * @return
     *     returns com.soprabanking.amplitude.getcustomerdetail.GetStatusResponseFlow
     * @throws ErrorResponseFlow_Exception
     */
    @WebMethod(action = "getStatus")
    @WebResult(name = "getStatusResponseFlow", targetNamespace = "http://soprabanking.com/amplitude", partName = "parameters")
    public GetStatusResponseFlow getStatus(
        @WebParam(name = "getStatusRequestFlow", targetNamespace = "http://soprabanking.com/amplitude", partName = "parameters")
        GetStatusRequestFlow parameters)
        throws ErrorResponseFlow_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns com.soprabanking.amplitude.getcustomerdetail.GetCustomerDetailResponseFlow
     * @throws ErrorResponseFlow_Exception
     */
    @WebMethod(action = "getCustomerDetail")
    @WebResult(name = "getCustomerDetailResponseFlow", targetNamespace = "http://soprabanking.com/amplitude", partName = "parameters")
    public GetCustomerDetailResponseFlow getCustomerDetail(
        @WebParam(name = "getCustomerDetailRequestFlow", targetNamespace = "http://soprabanking.com/amplitude", partName = "parameters")
        GetCustomerDetailRequestFlow parameters)
        throws ErrorResponseFlow_Exception
    ;

}
