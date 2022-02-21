package com.org.gen.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stud = new ArrayList<>();
		stud.add(new Student(123,"Amit",300,12));
		stud.add(new Student(124,"Sumit",500,15));
		stud.add(new Student(120,"Arti",100,10));
		stud.add(new Student(111,"Ziy",120,13));
		stud.add(new Student(101,"Pavan",800,19));
		
		System.out.println("arrange data according to marks");
		
		Collections.sort(stud,new MarksCompare());
		
		
		Iterator<Student> it = stud.iterator();
		while(it.hasNext()) {
			Student st = it.next();
			System.out.println(st.rollno+"  "+st.name+"  "+st.age+"  "+st.marks);
			
		}

		
		

	}

}
