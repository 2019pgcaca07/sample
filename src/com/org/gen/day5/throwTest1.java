package com.org.gen.day5;

public class throwTest1 {
	
	static void checkData(int x,int y) {
		if(x>15 && y<30) {
			throw new ArithmeticException("Student is not eligible for registration s");
		}else {
			System.out.println("Student entry is valid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		checkData(16,20);
		System.out.println("done !!");
		

	}

}
