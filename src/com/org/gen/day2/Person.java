package com.org.gen.day2;

public class Person {

	String name;int age; String address; //instance variable
	void display() {
		System.out .println(name+" "+ age +" "+address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Person p = new Person(); // calling default constructor
    p.display();
	}

}
