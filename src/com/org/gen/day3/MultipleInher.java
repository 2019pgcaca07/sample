package com.org.gen.day3;

abstract class MyClass{
	abstract void calculator(int a,int b);
}

abstract class DataBind{
	abstract void print();
}
class Addition extends MyClass{
	void calculator(int a,int b) {
		int x = a+b;
		System.out.println("sum= "+x);
		
	}
}
class Substraction extends MyClass{
	void calculator(int a,int b) {
		int y = a-b;
		System.out.println("sub= "+y);
		
	}
}

public class MultipleInher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
