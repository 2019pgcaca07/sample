package com.org.gen.day1;

import java.util.Scanner;
public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int age ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your age ");
		age = sc.nextInt();
		
		if(age<18) {
			System.out.println("you are not elligible");
			System.out.println("sorry ");
		}else {
			if(age>=18 && age<60) {
				System.out.println("you are elligible ");
				System.out.println("you are at right age ");
			}else {
				System.out.println("you are too old");
			}
		}
	}

}
