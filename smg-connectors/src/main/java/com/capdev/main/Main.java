package com.capdev.main;

import com.capdev.service.payload.ServiceRequest;
import com.capdev.services.CreateAccountAmplitude;
import com.capdev.services.GetCustomerFileListAmplitude;

public class Main {
	
	
	public static void main (String args[]) {
		System.out.println("je suis la");
		GetCustomerFileListAmplitude createAccAmplitude = new GetCustomerFileListAmplitude();
		
		ServiceRequest req = new ServiceRequest();
		createAccAmplitude.callSoap(req);
		
	}

}
