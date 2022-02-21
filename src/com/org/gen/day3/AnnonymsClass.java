package com.org.gen.day3;


interface Demo{
	int a=20;
	void count();
}

public class AnnonymsClass {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d = new Demo();
		public void count() {
			System.out.println("couning....");
		}
		d.count();
		

	}

}
