package com.org.gen.day6;

enum Weekdays{
	Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}
enum Size{
	   Small,Xsamall,Medium,Large,ExtraLarge
}

class Test{
	Size PizzaSize;
	
	public Test(Size pizzaSize) {
		super();
		PizzaSize 
	}
	public void order() {
		switch(PizzaSize) {
		case Small:
			System.out.println("I ordered a small size pizza");
			break;
		case Medium:
			System.out.println("I ordered a small size pizza");
			break;
	     default:
	    	 throw new IllegalArgumentException("Not available : "+PizzaSize);
			
		}
	}
}

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
