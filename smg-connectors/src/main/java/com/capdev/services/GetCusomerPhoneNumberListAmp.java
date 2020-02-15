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
import com.soprabanking.amplitude.getcustomerphonenumberlist.GetCustomerPhoneNumberList;
import com.soprabanking.amplitude.getcustomerphonenumberlist.GetCustomerPhoneNumberListPortType;
import com.soprabanking.amplitude.getcustomerphonenumberlist.GetCustomerPhoneNumberListRequest;
import com.soprabanking.amplitude.getcustomerphonenumberlist.GetCustomerPhoneNumberListRequestFlow;
import com.soprabanking.amplitude.getcustomerphonenumberlist.GetCustomerPhoneNumberListResponseFlow;
import com.soprabanking.amplitude.getcustomerphonenumberlist.RequestHeader;

public class GetCusomerPhoneNumberListAmp implements IService {

	public static final String DATE_FORMAT_AMPLITUDE = "yyyy-MM-dd'T'hh:mm:ss";
	
	public ServiceResponse callRest(ServiceRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

	public ServiceResponse callSoap(ServiceRequest req) {
		ServiceResponse serviceResponse = new ServiceResponse();
		ServiceResponseHeader headerResponse = new ServiceResponseHeader();
		try {
			
			GetCustomerPhoneNumberListRequestFlow requestFolow = new GetCustomerPhoneNumberListRequestFlow();
			GetCustomerPhoneNumberListRequest getCustomerPhoneNumberListRequest = new GetCustomerPhoneNumberListRequest();
			GetCustomerPhoneNumberListResponseFlow response = null;
			RequestHeader header = new RequestHeader();
			header.setRequestId("requestId");
			header.setServiceName("serviceName");
			
			SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT_AMPLITUDE);
			String date = format.format(new Date());
			XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
			
			header.setTimestamp(xmlDate);
			header.setUserCode("userCode");

			requestFolow.setRequestHeader(header);
			requestFolow.setGetCustomerPhoneNumberListRequest(getCustomerPhoneNumberListRequest);

			GetCustomerPhoneNumberList service = new GetCustomerPhoneNumberList();
			GetCustomerPhoneNumberListPortType port = service.getGetCustomerPhoneNumberListPortType();
			response = (GetCustomerPhoneNumberListResponseFlow) port.getCustomerPhoneNumberList(requestFolow);
						
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
