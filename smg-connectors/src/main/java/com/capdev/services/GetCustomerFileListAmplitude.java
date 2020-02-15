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
import com.soprabanking.amplitude.getcustomerfilelist.RequestHeader;
import com.soprabanking.amplitude.getcustomerfilelist.GetCustomerFileList;
import com.soprabanking.amplitude.getcustomerfilelist.GetCustomerFileListPortType;
import com.soprabanking.amplitude.getcustomerfilelist.GetCustomerFileListRequest;
import com.soprabanking.amplitude.getcustomerfilelist.GetCustomerFileListRequestFlow;
import com.soprabanking.amplitude.getcustomerfilelist.GetCustomerFileListResponseFlow;

public class GetCustomerFileListAmplitude implements IService {
	
	public static final String DATE_FORMAT_AMPLITUDE = "yyyy-MM-dd'T'hh:mm:ss";

	public ServiceResponse callRest(ServiceRequest req) {
		return null;
	}

	public ServiceResponse callSoap(ServiceRequest req) {
		ServiceResponse serviceResponse = new ServiceResponse();
		ServiceResponseHeader headerResponse = new ServiceResponseHeader();
		try {
			
			GetCustomerFileListRequestFlow requestFolow = new GetCustomerFileListRequestFlow();
			GetCustomerFileListRequest getCustomerFileListRequest = new GetCustomerFileListRequest();
			GetCustomerFileListResponseFlow response = null;
			RequestHeader header = new RequestHeader();
			header.setRequestId("requestId");
			header.setServiceName("serviceName");
			
			SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT_AMPLITUDE);
			String date = format.format(new Date());
			XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
			
			header.setTimestamp(xmlDate);
			header.setUserCode("userCode");

			requestFolow.setRequestHeader(header);
			requestFolow.setGetCustomerFileListRequest(getCustomerFileListRequest);

			GetCustomerFileList service = new GetCustomerFileList();
			GetCustomerFileListPortType port = service.getGetCustomerFileListPortType();
			response = (GetCustomerFileListResponseFlow) port.getCustomerFileList(requestFolow);
						
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
