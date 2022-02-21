package com.org.gen.day1;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cities[]= {"Dhanbad","hnjn","ghbjn"};
		System.out.println("name of cities");
		for(String c : cities) {
			System.out.println(c);
		}

		
		int sum[] = {1,2,3,4,5,6,7,8,9};
		int n=0;
		for(int x : sum) {
			n=n+x;
		}
		System.out.println("sum is" +n);
	}

}
