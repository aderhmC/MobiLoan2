package com.capdev.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.capdev.service.IService;
import com.capdev.service.payload.ServiceRequest;
import com.capdev.service.payload.ServiceResponse;
import com.capdev.service.payload.ServiceResponseHeader;
import com.soprabanking.amplitude.createaccount.CreateAccount;
import com.soprabanking.amplitude.createaccount.CreateAccountPortType;
import com.soprabanking.amplitude.createaccount.CreateAccountRequest;
import com.soprabanking.amplitude.createaccount.CreateAccountRequestFlow;
import com.soprabanking.amplitude.createaccount.CreateAccountResponseFlow;
import com.soprabanking.amplitude.createaccount.RequestHeader;

public class CreateAccountAmplitude implements IService{
		
	public static final String DATE_FORMAT_AMPLITUDE = "yyyy-MM-dd'T'hh:mm:ss";

	public ServiceResponse callSoap(ServiceRequest req) {
		ServiceResponse serviceResponse = new ServiceResponse();
		ServiceResponseHeader headerResponse = new ServiceResponseHeader();
		try {
			
			CreateAccountRequestFlow requestFolow = new CreateAccountRequestFlow();
			CreateAccountRequest createAccountRequest = new CreateAccountRequest();
			CreateAccountResponseFlow response = null;
			RequestHeader header = new RequestHeader();
			header.setRequestId("requestId");
			header.setServiceName("serviceName");
			
			SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT_AMPLITUDE);
			String date = format.format(new Date());
			XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
//			createAccountRequest.setCustomerCode("customerCode");
//			createAccountRequest.setCurrencyCode("MAD");
			
			header.setTimestamp(xmlDate);
			header.setUserCode("userCode");

			requestFolow.setRequestHeader(header);
			requestFolow.setCreateAccountRequest(createAccountRequest);

			CreateAccount service = new CreateAccount();
			CreateAccountPortType port = service.getCreateAccountPortType();
			response = (CreateAccountResponseFlow) port.createAccount(requestFolow);
			
			System.out.println(response.getCreateAccountResponse().getAccountIdentifier());
			
			headerResponse.setCode(new Long(200));
			serviceResponse.setHeader(headerResponse);
			Map<String, Object> body = new HashMap<String, Object>();
			
			body.put("accountIdentifier", response.getCreateAccountResponse().getAccountIdentifier());
			serviceResponse.setBody(body);
			
		} catch (Exception e) {
			headerResponse.setCode(new Long(400));
			headerResponse.setMessage(e.getMessage());
			serviceResponse.setHeader(headerResponse);
		}
		return serviceResponse;
	}
		
	
	public ServiceResponse callRest(ServiceRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

}
