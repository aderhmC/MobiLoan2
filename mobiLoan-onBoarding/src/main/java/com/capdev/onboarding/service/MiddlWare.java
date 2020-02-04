package com.capdev.onboarding.service;

import java.util.HashMap;
import java.util.Map;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.ServiceRequestWrapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capdev.service.payload.ServiceRequest;
import com.capdev.service.payload.ServiceRequestHeader;
import com.capdev.service.payload.ServiceResponse;
import com.netflix.ribbon.proxy.annotation.Http.Header;


@Service
public class MiddlWare {
	
	 final String uri = "http://localhost:8060/api/post";
	
	 private RestTemplate restTemplate = new RestTemplate();
	 
	 private ServiceRequest request ;
	  
	 private ServiceRequestHeader header;
	    
	 
	    public Object post(String serviceName, String protocol, Map req) {
	    	 	
	    	RestTemplate restTemplate = new RestTemplate();
	    	request = new ServiceRequest();
	    	header = new ServiceRequestHeader();
	    	header.setUserName("najib.amait");
	    	header.setPassword("test");
	        header.setServiceName(serviceName);
	        header.setProtocol(protocol);
	        
	        request.setHeader(header);
	        request.setBody(req);
	        
	        ServiceResponse response = restTemplate.postForObject(uri, request, ServiceResponse.class);
	    	
	        return response.getBody();
//	        ResponseEntity<Map> response = (ResponseEntity<Map>) this.restTemplate.postForObject(url, request, Map.class, 1);
//	        if(response.getStatusCode() == HttpStatus.OK) {
//	            return response.getBody();
//	        } else {
//	            return null;
//	        }
	    }

}
