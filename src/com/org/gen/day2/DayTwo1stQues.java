package com.org.gen.day2;



class Parent{
	void displayP() {
		System.out.println("this is parent class");
	}
}
class Child extends Parent{
	void display() {
		System.out.println("this is child class");
	}
}


public class DayTwo1stQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent ob1 = new Parent();
		Child ob2 = new Child();
		ob1.displayP();
		ob2.display();
		ob2.displayP();
		

	}

}
