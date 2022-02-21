package com.org.gen.day6;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> animals = new ArrayList<>();
		animals.add("dog");animals.add("cat");animals.add("horse");animals.add("duck");
		System.out.println("ArrayList -> "+animals);
		animals.add(0, "Ass");
		System.out.println("ArrayList -> "+animals);
		System.out.println("Dog is present in list ? "+animals.contains("dog"));
		


	}

}
