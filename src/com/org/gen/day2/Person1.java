package com.org.gen.day2;

public class Person1 {

	String name;
	int age;
	String address; // instance variable

	
	  //default constructor
	  
	  public Person1() { 
		  super();
	      name="abc"; age=2; address="Mumbai";
	      System.out.println(name +" "+age+" "+address);
	      }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person1 p1 = new Person1(); // calling default constructor

	}

}
