package com.org.gen.day3;
abstract class Abs{
	public Abs() {
		System.out.println("This is constructor of abstract class");
	}
	abstract void a_method();
	void normalMethod() {

		System.out.println("This is normal method of abstract class");
	}
}

class SubClass extends Abs{
	void a_method() {

		System.out.println("This is abstract method ");
	}
}

public class DayThree4thQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass s1 = new SubClass();
		s1.a_method();
		s1.normalMethod();

	}

}
