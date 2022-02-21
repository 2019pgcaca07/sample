package com.org.gen.day5;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int arr[] = new int[7];
			arr[10]=10/5;

			System.out.println("last statement of try block");
		}catch(ArithmeticException e) {
			

			System.out.println("you should not divide a number by zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			

			System.out.println("Accesssing array elements outside of the limit");
		}catch(Exception e) {
			

			System.out.println("some other exception");
		}finally {
			System.out.println("this is the final block");
		}
		System.out.println("out of the try catch");
		
	}
	

}
