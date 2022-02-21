package com.org.gen.day2;


class X{
	public void methodx() {
		System.out.println("Class X method");
	}
}
class Y extends X{
	public void methodY() {
		System.out.println("Class Y method");
		
	}
}

class P extends Y{
	public void methodP() {
		System.out.println("Class P method");
		
	}
}
public class ClassZ extends P {
	ClassZ(){
		System.out.println("Class Z method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ClassZ z =new ClassZ();
      z.methodP();
      z.methodx();
      z.methodY();
     
		
	}

}
