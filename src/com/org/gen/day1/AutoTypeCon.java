package com.org.gen.day1;

public class AutoTypeCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		System.out.println("integer value is :"+ num); //print 10
		double data =num;
		 System.out.println("double value is: "+ data); // automatic conversion and prints 10.0
		 
		 int x = (int)data;
		 
		 String s = String.valueOf(num);
		 
		 System.out.println("converted into string:"+s);
		 
		 //string to int ,here you have to parse int to store in string
		 
		 int y=Integer.parseInt(s);
		 System.out.println("string to int "+y);

	}

}
