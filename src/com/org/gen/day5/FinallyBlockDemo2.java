package com.org.gen.day5;

//when system.exit() is invoked before executing finally
//when exception is in fially
//when return statement is in finally
//the above three situations when finally doesn't work

public class FinallyBlockDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("101");
			System.out.println("102");
			System.out.println(200/0);
		}catch(Exception e) {
			System.out.println(100/0);
		}finally {
			System.out.println(300/0);
			System.out.println("444");
		}

	}

}
