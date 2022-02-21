package com.org.gen.day4;

interface TaxPrints{
	
	void sample(String text);
}

class CallBack implements TaxPrints{

	@Override
	public void sample(String text) {
		// TODO Auto-generated method stub
		System.out.println("The text is ->"+text);
		
	}
	
	
		
}

public class Ac {
	//reference of interface
	TaxPrints text1;
	

	public Ac(TaxPrints text1) {
		super();
		this.text1 = text1;
	}
	
	public void sampleFun(String s) {
		text1.sample(s);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA objA = new ClassA();
		Ac obj2 = new Ac(objA);
		obj2.sampleFun("program is about callback interface");
		

	}

}
