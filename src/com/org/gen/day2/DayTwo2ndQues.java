package com.org.gen.day2;


class Member {
	
	String Name,Address;
	int Age,Phone;
	double Salary;
	
	
	
	public Member(String name, String address, int age, int phone, double salary) {
		super();
		Name = name;
		Address = address;
		Age = age;
		Phone = phone;
		Salary = salary;
	}



	public void printSalary() {
		System.out.println("salary is:"+Salary);
	}
	public void display() {
		System.out.println("Name-"+Name+"Adress-"+Address+"Age-"+Age+"phone-"+Phone+"salary"+Salary);
	}
}
class Employee extends Member{
	//super(name,address,age,phone,salary);
	
	String specialization,department;

	public Employee(String name, String address, int age, int phone, double salary) {
		super(name, address, age, phone, salary);
		// TODO Auto-generated constructor stub
	}
	
	
	
}

class Manager extends Member{
	
	public Manager(String name, String address, int age, int phone, double salary) {
		super(name, address, age, phone, salary);
		// TODO Auto-generated constructor stub
	}

	String specialization,department;
}


public class DayTwo2ndQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("ram","varanasi",34,5567,2000);
		Manager m = new Manager("ramu","ranasi",34,5567,2000);
		e.display();
		m.display();

	}

}
