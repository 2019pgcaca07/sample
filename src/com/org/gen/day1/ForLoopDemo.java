package com.org.gen.day1;
//import java.util.*;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * int num =0; for(int x=1;x<=20;x++) { num=num+x; }
		 * System.out.println("Total ="+num);
		 */
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
