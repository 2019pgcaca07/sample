package com.org.gen.day5;

public class RegistrationServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegistrationService service = new RegistrationService();
		try {
			service.validateName("abc");
		}catch(NameNotFoundException e) {
			
		}

	}

}
