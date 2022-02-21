package com.org.gen.day5;

interface C{
	public Employee getEmployee();
}

interface D{
	public Employee getEmployee(String name ,int age);
	
}
class Employee{
	String eName;
	int age;
	public Employee() {
		super();
	}
	public Employee(String eName, int age) {
		super();
		this.eName = eName;
		this.age = age;
	}
	
	public void getInfo() {
System.out.println(" ia am method od class employee");
	}
	
}

public class TestConstructorReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lambda Expression
		C c1 = ()->new Employee();
		c1.getEmployee().getClass();
		
		D d1 = (eName,age)->new Employee(eName,age);
	    d1.getEmployee("Yash", 22).getInfo();
	    
	    //method
	    
	    C c2 =Employee::new;
	    c2.getEmployee().getInfo();
	    
	    D d2 = Employee::new;
	    d2.getEmployee("Raj", 20).getInfo();
	}

}
