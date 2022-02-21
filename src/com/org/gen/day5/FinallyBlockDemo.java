package com.org.gen.day5;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =20,b=30,c=0;
		try {
			int sum = a+b;
			System.out.println(sum);
			sum =sum/c;
			System.out.println("sum= "+sum);
			
		}catch(NullPointerException e) {
			System.out.println(e);
			System.out.println("in catch");
		}finally {
			System.out.println("finally block must execute");
		}
		System.out.println("out of box");

	}

}
