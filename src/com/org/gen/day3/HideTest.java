package com.org.gen.day3;


class X{
	
	 static void m1(int a) {
		System.out.println("m1-x");
	}
	
}

 class Y extends X {
	
 	 static void m1(int y) {
 		System.out.println("m1-y");
	}
	
}

public class HideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		X x = new Y();
		x.m1(0);
		Y y = new Y();
		y.m1(0);

	}

}
