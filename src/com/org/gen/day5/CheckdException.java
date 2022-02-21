package com.org.gen.day5;

/*
 * try-catch
 * try-finally
 * try-catch-finally*/

public class CheckdException {
static int x=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello exception");
	try {
		Thread.sleep(1000);
		
		System.out.println("normal1");
		System.out.println("normal2");
		
	}catch(Exception e){
		System.out.println(e);
	}
	
	try {
		Thread.sleep(1000);
		
		System.out.println("normal1");
		x=x/0;
		System.out.println("normal2");
		
	}catch(Exception e){
		System.out.println(e);
	}

	}

}
