package com.org.gen.day5;

interface A1{
	public boolean checkSingleDigit(int x);
}

class Digit implements A1{
	
public boolean checkSingleDigit(int x) {
		
	}
	public static boolean isSingleDigit(int x) {
		
	}
}

public class TestStaticMethodRef extends Digit  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A1 a = (x)->{
			if(x>=0 && x<=9)
				return true;
			else 
				return false;
		};
		a.checkSingleDigit(6);
		
		A1 a1 = TestStaticMethodRef::isSingleDigit;
		a1.checkSingleDigit(7);

	}
	
	//@Override
	
	

}
