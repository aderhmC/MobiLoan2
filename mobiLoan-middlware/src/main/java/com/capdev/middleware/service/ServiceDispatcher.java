package com.capdev.middleware.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.capdev.middleware.repository.ServiceRepository;
import com.capdev.middleware.web.rest.errors.BadRequestAlertException;
import com.capdev.service.IService;
import com.capdev.service.payload.ServiceRequest;
import com.capdev.service.payload.ServiceRequestHeader;
import com.capdev.service.payload.ServiceResponse;
import com.capdev.services.CreateCustomerAmplitude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import springfox.documentation.swagger2.mappers.ModelMapper;
import springfox.documentation.swagger2.mappers.ModelMapperImpl;

@Service
public class ServiceDispatcher {

	protected ModelMapper modelMapper = new ModelMapperImpl();
	protected ObjectMapper objectMaper = new ObjectMapper()
			.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
			.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
	
	public ServiceResponse call(ServiceRequest request) {
		
		validateRequest(request);	
		authetication(request.getHeader());
		IService service;
		
		try {
			service = (IService) Class.forName("com.capdev.services."+request.getHeader().getServiceName()).newInstance();
		} catch (Exception e) {
			throw new BadRequestAlertException(e.getCause().toString(), null, "");
		}
		
		return service.callSoap(request);

	}

	private void validateRequest(ServiceRequest request) {
		// TODO Auto-generated method stub
		if (request == null || request.getHeader() == null || request.getBody() == null) {
			throw new BadRequestAlertException("Request Header mandatory", null, "");
		}

	}

	private void authetication(ServiceRequestHeader header) {
		// TODO Auto-generated method stub
		if (header.getUserName() == null || header.getPassword() == null) {
			throw new BadRequestAlertException("User and Password mandatory", null, "");
		}
	}
}
