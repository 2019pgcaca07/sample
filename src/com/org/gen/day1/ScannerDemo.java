package com.org.gen.day1;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * System.out.println("enter name age and salary");
		 * 
		 * String name =sc.nextLine(); // string input
		 * 
		 * int age = sc.nextInt();
		 * 
		 * double salary = sc.nextDouble();
		 * 
		 * System.out.println("employee name is "+name);
		 * System.out.println("employee age is "+age);
		 * System.out.println("employee salary is "+salary);
		 * System.out.println("do you want to continue ? y/n ");
		 * 
		 * char p = sc.next().charAt(0); //it will pick character at 0th index
		 * 
		 * System.out.println("continue:"+p);
		 */
		 
		 System.out.println("2nd");
		 
		 Scanner citizen = new Scanner(System.in);
		 System.out.println("enter the voterId ");
		 int vId = citizen.nextInt();
		 citizen.nextLine();
		 System.out.println("enter the name ");
		 String nam = citizen.nextLine();
		 System.out.println("enter the age ");
		 int ag = citizen.nextInt();
		 citizen.nextLine();
		 System.out.println("enter the location ");
		 String loc = citizen.nextLine();
		 
		 System.out.println("employee vid is "+vId);
		 System.out.println("employee name is "+nam);
		 System.out.println("employee age is "+ag);
		 System.out.println("employee loc is "+loc);
		 
		 
		 
		 
		 
		 
	}

}
