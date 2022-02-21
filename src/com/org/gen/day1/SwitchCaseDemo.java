package com.org.gen.day1;

import java.util.Scanner;
public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		String menu;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your choice");
		System.out.println("enter 1 for tea");
		System.out.println("enter 2 for cofee");
		System.out.println("enter 3 for cold drink");
		System.out.println("enter 4 for main cource");
		
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
				  System.out.println("welcome to the hotel abc food court");
			      System.out.println("plzz enjoy your tea");
			      break;
		case 2:
			  System.out.println("welcome to the hotel abc food court");
		      System.out.println("plzz enjoy your cofee");
		      break;
		      
		case 3:
			  System.out.println("welcome to the hotel abc food court");
		      System.out.println("plzz enjoy your cold drink");
		      break;	 
		      
		case 4:
			  System.out.println("welcome to the hotel abc food court");
		      System.out.println("plzz select dishes");
		      break;  
		      
		      
		  default:
			  System.out.println("sorry hotel is not serve!!");

		}
		
		
	}
	public static void mainCource() {
		
	}

}
