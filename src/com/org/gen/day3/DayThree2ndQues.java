package com.org.gen.day3;

abstract class Bank{
	abstract void getBalance();
}

class BankA extends Bank{
	String balance ="$100";

	
	void getBalance() {
		System.out.println("BankA has bance  "+balance);
	}
	
}
class BankB extends Bank{
	String balance ="$150";

	
	void getBalance() {
		System.out.println("BankB has bance  "+balance);
	}
	
}
class BankC extends Bank{
	String balance ="$200";

	
	void getBalance() {
		System.out.println("BankC has bance  "+balance);
	}
	
}

public class DayThree2ndQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA a1 =new BankA();
		a1.getBalance();
		BankB b1 =new BankB();
		b1.getBalance();
		BankC c1 =new BankC();
		c1.getBalance();

	}

}
