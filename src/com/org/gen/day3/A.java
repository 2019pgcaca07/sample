package com.org.gen.day3;

@FuncionalInterface

public interface A {

	default void m1() {
		System.out.println("m1");
	}
	
	 void m2();
	
	static void m3() {
		System.out.println("m1");
		
	}
}

class B implements A{
	
	
	
	
}
