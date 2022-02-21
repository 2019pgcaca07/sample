package com.org.gen.day6;
import java.util.Vector;
import java.util.Iterator;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v = new Vector<>();
		v.add("dog");v.add("horse");
		Vector<String> v1 = new Vector<>();
		v1.add("duck");v1.add("cow");v1.add("cat");
		v1.add("sheep");
		
		v.addAll(1,v1);
		System.out.println("complete data - "+v);
		System.out.println(v.get(2));
		
		Iterator<String> itr = v.iterator();
		System.out.println("vactor : ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println(" "
					);
		}
		
		

	}

}
