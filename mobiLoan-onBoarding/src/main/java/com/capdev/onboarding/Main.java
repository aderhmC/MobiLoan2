package com.capdev.onboarding;

import java.util.HashMap;
import java.util.Map;

import com.capdev.onboarding.service.MiddlWare;

public class Main {

	
	public static void main(String[] args) {
		
		MiddlWare middlWare = new MiddlWare();
		Map<String,Object> req = new HashMap<String, Object>();
		req.put("customerCode", "code");
		Map<String,Object> obj = (Map<String, Object>) middlWare.post("CreateCustomerAmplitude", "soap", req);
		System.out.println(obj.get("code"));
	}
}
