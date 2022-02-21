package com.org.gen.day2;

public class Employee {
	
	String empName;
	int empId;
	int salary;
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("this is default constructor");
	}


	public Employee(String empName, int empId, int salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}
	void display() {
		System.out.println("employee name -> "+empName+ " employee id " +empId+ " salary->" +salary);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee("sunil",123,20000);
		e2.display();
		
		
		
		

	}

}
