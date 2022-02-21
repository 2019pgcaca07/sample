package com.org.gen.day5;

public class CustomerService {
	
	public customer findByName(string name) throws NameNotFoundException{
		if(" ".equals(name)) {
			throw new NameNotFoundException("Name is not available");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerService obj = new CustomerService();

	}

}
