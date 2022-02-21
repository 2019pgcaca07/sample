package com.org.gen.day3;

public class Loan implements Car, Home, Education {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Loan l =new Loan();
		l.carloan();l.homeloan();l.eduloan();
		
		Home h = new Loan();
		int home = Home.calLoan(2000, 9, 10);
		System.out.println("simple int on home loan is "+home);
		
		

	}

	@Override
	public void eduloan() {
		// TODO Auto-generated method stub
		System.out.println("edu loan interest is 8");
		
	}

	@Override
	public void homeloan() {
		// TODO Auto-generated method stub

		System.out.println("edu loan interest is 9");
		
	}

	@Override
	public void carloan() {
		// TODO Auto-generated method stub

		System.out.println("edu loan interest is 10");
		
	}
	
	

}
