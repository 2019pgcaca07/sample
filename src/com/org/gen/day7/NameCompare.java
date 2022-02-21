package com.org.gen.day7;

import java.util.Comparator;

public class NameCompare implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		Student s1=(Student)o1;  
		Student s2=(Student)o2;  
		  
		return s1.name.compareTo(s2.name); 
	}
	
	

}
