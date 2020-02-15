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
import com.soprabanking.amplitude.getcustomerbudgetdetail.GetCustomerBudgetDetail;
import com.soprabanking.amplitude.getcustomerbudgetdetail.GetCustomerBudgetDetailPortType;
import com.soprabanking.amplitude.getcustomerbudgetdetail.GetCustomerBudgetDetailRequest;
import com.soprabanking.amplitude.getcustomerbudgetdetail.GetCustomerBudgetDetailRequestFlow;
import com.soprabanking.amplitude.getcustomerbudgetdetail.GetCustomerBudgetDetailResponseFlow;
import com.soprabanking.amplitude.getcustomerbudgetdetail.RequestHeader;

public class GetCustomerBudgetDetailAmplitude implements IService {

	public static final String DATE_FORMAT_AMPLITUDE = "yyyy-MM-dd'T'hh:mm:ss";

	public ServiceResponse callRest(ServiceRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

	public ServiceResponse callSoap(ServiceRequest req) {
		ServiceResponse serviceResponse = new ServiceResponse();
		ServiceResponseHeader headerResponse = new ServiceResponseHeader();
		
		try {
			
			GetCustomerBudgetDetailRequestFlow requestFlow = new GetCustomerBudgetDetailRequestFlow();
			GetCustomerBudgetDetailRequest getCustomerBudgetDetailRequest = new GetCustomerBudgetDetailRequest();
			GetCustomerBudgetDetailResponseFlow response = null;
			RequestHeader header = new RequestHeader();
			
			SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT_AMPLITUDE);
			String date = format.format(new Date());
			XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
			
			header.setRequestId("requestId");
			header.setServiceName("serviceName");
			header.setTimestamp(xmlDate);
			header.setUserCode("userCode");
			
			requestFlow.setRequestHeader(header);
			requestFlow.setGetCustomerBudgetDetailRequest(getCustomerBudgetDetailRequest);
			
			GetCustomerBudgetDetail service = new GetCustomerBudgetDetail();
			GetCustomerBudgetDetailPortType port = service.getGetCustomerBudgetDetailPortType();
			response = (GetCustomerBudgetDetailResponseFlow) port.getCustomerBudgetDetail(requestFlow);
			
			headerResponse.setCode(new Long(200));
			serviceResponse.setHeader(headerResponse);
			Map<String, Object> body = new HashMap<String, Object>();
			body.put("Hi", response.getGetCustomerBudgetDetailResponse().getCustomerBudgetDetail().getCustomerCode());
			serviceResponse.setBody(body);
			
		} catch (Exception e) {
			headerResponse.setCode(new Long(400));
			headerResponse.setMessage(e.getMessage());
			serviceResponse.setHeader(headerResponse);
		}
		
		return serviceResponse;
	}

}
