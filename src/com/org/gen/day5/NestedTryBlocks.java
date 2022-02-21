package com.org.gen.day5;

public class NestedTryBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=5;
		try {
              
			System.out.println("outer try block");
			try {

				System.out.println("inner try block 1");
				int arr[]= {5,10,15};
				int res=10/arr[2];
				

				System.out.println("result= "+res);
				
				try {

					System.out.println("inner try block 2");
					 p=p/2;
					System.out.println("value of p= "+p );
					
				}catch(Exception e) {
					System.out.println("inner catch block 2");
				}
				
			}catch(Exception e) {
				System.out.println("inner catch block 1");
			}
			
		}catch(Exception e) {
			System.out.println("outer catch block ");
		}

	}

}
