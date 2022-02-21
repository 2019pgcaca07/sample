package com.org.gen.day3;

abstract class Parent {
	abstract void message();
}

class FirstClass extends Parent{
	void message() {
		System.out.println("this is first class");
	}
}
class SecondClass extends Parent{
	void message() {
		System.out.println("this is second class");
	}
}

public class DayThree1stQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass f1 =new FirstClass();
		f1.message();
		SecondClass s1 =new SecondClass();
		s1.message();

	}

}
