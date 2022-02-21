package com.org.gen.day2;

public class SchoolDay {
	
	String name = "Mrak";//instance variable
	SchoolDay(){
		int id =123;
		System.out.println("Id of student"+id);
	}
	public void mySchool() {
		String schoolName ="SSM"; //local variable
		System.out.println("name of school "+schoolName);
	}
	public void mySchool1() {
		
		System.out.println("name of school " +schoolName); //schoolName is a local var of mySchool method so not accesed outside
	}
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SchoolDay sc = new SchoolDay();
		sc.mySchool();

	}

}
