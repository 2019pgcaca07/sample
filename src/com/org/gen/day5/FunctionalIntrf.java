package com.org.gen.day5;

@FunctionalInterface
interface Stas{
	void prts();
	 static void pwd() {
		System.out.println("this is pwd");
	}
}

class Bvg implements Stas{
	@Override
	void prts() {
		System.out.println("this is yes");
		
	}
	 static void pwd() {
		System.out.println("this is pwd1");
	}
}


public class FunctionalIntrf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bvg a1 = new Bvg();
		a1.pwd();
		
				

	}

}
