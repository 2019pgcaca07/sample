package com.org.gen.day3;

//SAM // functional

@FunctionalInterface
public interface Home {
  
	void homeloan();//single abstract method  it can be implementd in sub class
	
	
	static int calLoan(int p,int r ,int t) {
		int si =(p*r*t)/100;
		return si;
		
		
	}
	default void m2() {                             // it can be implementd in sub class
		System.out.println("pay the loan at given time");
	}
	default void typeOfHome() {                 //it can be implementd in sub class
		System.out.println("type of home size");
	}
	
	
	
}
