package com.org.gen.day3;

abstract class Employee{
	
	private String name;
	private int id;
	Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	void display() {
		System.out.println("name:"+name+" id: "+id);
	}
}

public class Engineer extends Employee {
	
	
	
	Engineer(String name,int id){
		super(name,id);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer e1 = new Engineer("ram",6);
		e1.display();

	}

}
