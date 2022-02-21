package com.org.gen.day6;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> link = new LinkedList<String>();
		link.add("Ramesh");
		link.add("Vijay");
		link.add("Aman");
		link.add("Virat");
		link.add("Harsha");
		link.add("Amit");
		int size=link.size();
		//create a string array
		String [] name = new String[size];
		name=link.toArray(name);
		System.out.println("elements of array -> ");
		System.out.println(Arrays.toString(name));
		

	}

}
