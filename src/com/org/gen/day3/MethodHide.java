package com.org.gen.day3;

class ParentClass{
	public static void classMethod() {
		System.out.println("class method in parent class");
	}
	public  void instanceMethod() {
		System.out.println("instance method in parent class");
	}
}
class ChildClass extends ParentClass{
	public static void classMethod() {
		System.out.println("classmethod in child class");
	}
	public  void instanceMethod() {
		System.out.println("instance method in child class");
	}
}

public class MethodHide {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass x = new ChildClass();
		x.classMethod(); // method hiding
	   x.instanceMethod();//method overridding
	   
	   ChildClass c = new ChildClass();
	   c.classMethod();// hiding
	   c.instanceMethod();//ridding
	   
	   ParentClass p = new ParentClass();
	   p.classMethod();
	   p.instanceMethod();

	}

}
