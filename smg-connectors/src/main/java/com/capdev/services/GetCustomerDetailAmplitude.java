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
import com.soprabanking.amplitude.getcustomerdetail.GetCustomerDetail;
import com.soprabanking.amplitude.getcustomerdetail.GetCustomerDetailPortType;
import com.soprabanking.amplitude.getcustomerdetail.GetCustomerDetailRequest;
import com.soprabanking.amplitude.getcustomerdetail.GetCustomerDetailRequestFlow;
import com.soprabanking.amplitude.getcustomerdetail.GetCustomerDetailResponseFlow;
import com.soprabanking.amplitude.getcustomerdetail.RequestHeader;

public class GetCustomerDetailAmplitude implements IService {
	
	public static final String DATE_FORMAT_AMPLITUDE = "yyyy-MM-dd'T'hh:mm:ss";

	public ServiceResponse callRest(ServiceRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

	public ServiceResponse callSoap(ServiceRequest req) {
		ServiceResponse serviceResponse = new ServiceResponse();
		ServiceResponseHeader headerResponse = new ServiceResponseHeader();
		try {
			
			GetCustomerDetailRequestFlow requestFolow = new GetCustomerDetailRequestFlow();
			GetCustomerDetailRequest getCustomerDetailRequest = new GetCustomerDetailRequest();
			GetCustomerDetailResponseFlow response = null;
			RequestHeader header = new RequestHeader();
			header.setRequestId("requestId");
			header.setServiceName("serviceName");
			
			SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT_AMPLITUDE);
			String date = format.format(new Date());
			XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
			
			header.setTimestamp(xmlDate);
			header.setUserCode("userCode");

			requestFolow.setRequestHeader(header);
			requestFolow.setGetCustomerDetailRequest(getCustomerDetailRequest);

			GetCustomerDetail service = new GetCustomerDetail();
			GetCustomerDetailPortType port = service.getGetCustomerDetailPortType();
			response = (GetCustomerDetailResponseFlow) port.getCustomerDetail(requestFolow);
						
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
