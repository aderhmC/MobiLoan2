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
import com.soprabanking.amplitude.createcustomer.CreateCustomer;
import com.soprabanking.amplitude.createcustomer.CreateCustomerPortType;
import com.soprabanking.amplitude.createcustomer.CreateCustomerRequest;
import com.soprabanking.amplitude.createcustomer.CreateCustomerRequestFlow;
import com.soprabanking.amplitude.createcustomer.CreateCustomerResponseFlow;
import com.soprabanking.amplitude.createcustomer.RequestHeader;

public class CreateCustomerAmplitude implements IService {

	public static final String DATE_FORMAT_AMPLITUDE = "yyyy-MM-dd'T'hh:mm:ss";

	public ServiceResponse callSoap(ServiceRequest req) {
		ServiceResponse serviceResponse = new ServiceResponse();
		ServiceResponseHeader headerResponse = new ServiceResponseHeader();
		try {
			
			CreateCustomerRequestFlow requestFolow = new CreateCustomerRequestFlow();
			CreateCustomerRequest createCustomerRequest = new CreateCustomerRequest();
			CreateCustomerResponseFlow response = null;
			RequestHeader header = new RequestHeader();
			header.setRequestId("requestId");
			header.setServiceName("serviceName");

			
			SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT_AMPLITUDE);
			String date = format.format(new Date());
			XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
			createCustomerRequest.setCustomerType("1");
			createCustomerRequest.setTitleCode("titleCode");
			
			
			
			header.setTimestamp(xmlDate);
			header.setUserCode("userCode");

			

			requestFolow.setRequestHeader(header);
			requestFolow.setCreateCustomerRequest(createCustomerRequest);

			CreateCustomer service = new CreateCustomer();
			CreateCustomerPortType port = service.getCreateCustomerPortType();
			response = (CreateCustomerResponseFlow) port.createCustomer(requestFolow);
			
			System.out.println(response.getCreateCustomerResponse().getCustomerCode());
			
			headerResponse.setCode(new Long(200));
			serviceResponse.setHeader(headerResponse);
			Map<String, Object> body = new HashMap<String, Object>();
			body.put("Hi", response.getCreateCustomerResponse().getCustomerCode());
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
