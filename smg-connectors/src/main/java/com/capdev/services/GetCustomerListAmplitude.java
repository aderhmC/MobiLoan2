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
import com.soprabanking.amplitude.getcustomerlist.GetCustomerList;
import com.soprabanking.amplitude.getcustomerlist.GetCustomerListPortType;
import com.soprabanking.amplitude.getcustomerlist.GetCustomerListRequest;
import com.soprabanking.amplitude.getcustomerlist.GetCustomerListRequestFlow;
import com.soprabanking.amplitude.getcustomerlist.GetCustomerListResponseFlow;
import com.soprabanking.amplitude.getcustomerlist.RequestHeader;

public class GetCustomerListAmplitude implements IService{
	
	public static final String DATE_FORMAT_AMPLITUDE = "yyyy-MM-dd'T'hh:mm:ss";

	public ServiceResponse callRest(ServiceRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

	public ServiceResponse callSoap(ServiceRequest req) {
		ServiceResponse serviceResponse = new ServiceResponse();
		ServiceResponseHeader headerResponse = new ServiceResponseHeader();
		
		try {
			
			GetCustomerListRequestFlow requestFlow = new GetCustomerListRequestFlow();
			GetCustomerListRequest getCustomerListRequest = new GetCustomerListRequest();
			GetCustomerListResponseFlow response = null;
			RequestHeader header = new RequestHeader();
			
			SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT_AMPLITUDE);
			String date = format.format(new Date());
			XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
			
			header.setRequestId("requestId");
			header.setServiceName("serviceName");
			header.setTimestamp(xmlDate);
			header.setUserCode("userCode");
			
			requestFlow.setRequestHeader(header);
			requestFlow.setGetCustomerListRequest(getCustomerListRequest);
			
			GetCustomerList service = new GetCustomerList();
			GetCustomerListPortType port = service.getGetCustomerListPortType();
			response = (GetCustomerListResponseFlow) port.getCustomerList(requestFlow);
			
			headerResponse.setCode(new Long(200));
			serviceResponse.setHeader(headerResponse);
			Map<String, Object> body = new HashMap<String, Object>();
			body.put("Hi", response.getResponseStatus().getStatusCode());
			serviceResponse.setBody(body);
			
		} catch (Exception e) {
			headerResponse.setCode(new Long(400));
			headerResponse.setMessage(e.getMessage());
			serviceResponse.setHeader(headerResponse);
		}
		
		return serviceResponse;
	}

}
