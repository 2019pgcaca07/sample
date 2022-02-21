package com.org.gen.day3;

class A{
	String s ="hello";
	
}
	

class B extends A{
	
	String s ="hii";
	void display() {
		System.out.println(super.s);
		System.out.println(s);
	
}
}

public class HidTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		b.display();
		
		A a = new B();

		
			
			System.out.println(a.s);
		

	}

}
