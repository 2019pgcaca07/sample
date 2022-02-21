package com.org.gen.day4;

interface Myinterface{
	public String print(String data);
}
interface Comparedata{
	public void print(int a,int b);
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//implementation of interface using lambda expression
	Myinterface m1 = (data)->{
		System.out.println("Lambda expression");
		return "my data " +data;
	};
	
	String s = m1.print("java");
	System.out.println(s);
	
	CompareData c1 = (a,b)->{
		if(a>b)

			System.out.println(+a+" is greater ");
		else

			System.out.println(+b +" is greater");
			
	};
	

	}

}
