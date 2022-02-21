package com.org.gen.day5;



public class TryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("11");
		System.out.println("before divide");
		
		
		try {
			int x= 1/0;
			System.out.println("after divide");
			
		}catch(Exception e) {
			System.out.println("a number is divided by zero " +e);
		}
		System.out.println("22");

	}

}
