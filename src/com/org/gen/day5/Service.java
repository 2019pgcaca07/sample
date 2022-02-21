package com.org.gen.day5;

public class Service {
  
	public void validEmail(String email) {
		if(isDomainValid(email)) {
			throw new DomainNotValidException(email);
		}
	}
		
		private boolean isDomainValid(string email) {
			
			return false;
		}
	}
}
