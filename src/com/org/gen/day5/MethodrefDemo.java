package com.org.gen.day5;

@FunctionalInterface
interface A{
	void getName(String name);
	
}

public class MethodrefDemo implements A {
	static void getInfo(String info) {
		System.out.println(info);
		System.out.println("this is also printing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = (name)->System.out.println(name);
		a.getName("SAM is excuting");
		
		A a1 = MethodrefDemo::getInfo;//now a1 has reference of getInfo method
		a1.getName("getInfo of class is excuting");//passing getInfo method refernce to getName

	}
	@Override
	public void getName(String name) {
		
	}

}


