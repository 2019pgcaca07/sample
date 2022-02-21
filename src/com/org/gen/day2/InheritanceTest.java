package com.org.gen.day2;

class BaseClass{
	void features() {
		System.out.println("A");
		System.out.println("B");
	}
}

class DerivedClass extends BaseClass{
	void ownFeatures() {
		System.out.println("C");
	}
}
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DerivedClass d = new DerivedClass();
		d.features();
		d.ownFeatures();

	}

}
