package com.org.gen.day5;


public class TryCatchBlock1 {
int x=30,y=0;
void divide() {
	System.out.println("i am a method "+x);

	try {
		System.out.println("inside try block");
		int z=x/y;
	}catch(NullPointerException e) {

		System.out.println("im am in catch block");
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TryCatchBlock1 a1 =new TryCatchBlock1();

		System.out.println("im am in main method");
		a1.divide();

	}

}
