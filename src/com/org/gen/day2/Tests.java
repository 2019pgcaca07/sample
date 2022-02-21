package com.org.gen.day2;

class Vehicl{
	public Vehicl() {
		System.out.println("Vehicle constructor");
	}
	public void sound() {
		System.out.println("sound method");
	}
	public void engine() {
		System.out.println("engine method");
	}
	public void price() {
		System.out.println("price method");
	}
	public void sitting() {
		System.out.println("sitting method");
	}
}

class Cars extends Vehicl{
	public Cars() {
		System.out.println("Car constructor");
	}
	public void color() {
		System.out.println("color method");
	}
	public void model() {
		System.out.println("model method");
	}
	
}

class Honda extends Car{
	public Honda() {
		System.out.println("Honda constructor");
	}
	public void HP() {
		System.out.println("HP method");
	}	
}

class HondaCity extends Honda{
	public HondaCity() {
		System.out.println("Hondacity constructor");
	}
	public void features() {
		System.out.println("color method");
	}
	
}
public class Tests extends HondaCity {
	
	 Tests() {
		System.out.println("this is the main class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Tests t1 = new Tests();
       
       
	}

}
