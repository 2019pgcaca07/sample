package com.org.gen.day7;
import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		System.out.println("ArrayList "+ numbers);
		ListIterator<Integer> itr = numbers.listIterator();
		
		
		int number1 = itr.next();
		System.out.println("next element = "+number1);
		
		int index1=itr.nextIndex();
		System.out.println("position of the next element "+index1);
		
		System.out.println("is there any next element ??"+itr.hasNext());
		
		
	}

}
