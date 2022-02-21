package com.org.gen.day1;

import java.util.Scanner;

public class Day1_2ndQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the year");
		
		int year = sc.nextInt();
		
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {

					System.out.println("this is leap year");
				}else {

					System.out.println("this is not leap year");
				}
			}else {

				System.out.println("this is  leap year");
			}
		}else {

			System.out.println("this is not leap year");
		}
	}

}
