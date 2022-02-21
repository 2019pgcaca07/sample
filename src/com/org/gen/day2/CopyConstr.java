package com.org.gen.day2;

public class CopyConstr {
	
	int a=10;int b=20;
	
	//default constr
	CopyConstr(){
		
	}
	//copy constructor
	CopyConstr(CopyConstr n){
		a=n.a;b=n.b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step3
		CopyConstr n= new CopyConstr();
		System.out.println("value of a"+n.a);
		System.out.println("value of b"+n.b);
		//step4
		n.a=50;
		n.b=40;
		System.out.println("updating values of a and b in the existing object");
		System.out.println("value of a"+n.a);
		System.out.println("value of b"+n.b);
		
		//step5
		CopyConstr n2 = new CopyConstr();
		System.out.println("not getting updated values of a and b in the new object");
		System.out.println("value of a"+n2.a);
		System.out.println("value of b"+n2.b);
		
		//type6
		CopyConstr n3 = new CopyConstr(n);
		System.out.println("getting update values of a and b in the new object");
		System.out.println("value of a"+n3.a);
		System.out.println("value of b"+n3.b);

		
	}

}
