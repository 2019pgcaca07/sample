package com.org.gen.day1;

import java.util.Scanner;

public class conditionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the test score");
		
		String scoreString=kb.nextLine();
		double score = Double.parseDouble(scoreString); // string to double
		
		if(score>60 ) {
			System.out.println("you are doing very well");
			System.out.println("good job");
		}else if(score==60) {
			System.out.println("you are barely passed");
		}else {
			System.out.println("try again");
		}

	}

}
