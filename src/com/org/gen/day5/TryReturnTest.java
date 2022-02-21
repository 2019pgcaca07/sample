package com.org.gen.day5;

//if there is return statement in finally then it overrides all return statements of try and catch return statements

public class TryReturnTest {
	
	int m1() {
		try {
			
			System.out.println("try block");
			return 100/0;
		}catch(Exception e) {
			
			System.out.println("catch block");
			return 67;
		}finally {
			System.out.println("finally block");
		return 200;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryReturnTest tr = new TryReturnTest();
		System.out.println(tr.m1());		

	}

}
