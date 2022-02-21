package com.org.gen.day4;

public class Person implements Cloneable {
	

	 int id;
	 String pname;
	 

	public Person() {
		super();
	}
	


	public Person(int id, String pname) {
		super();
		this.id = id;
		this.pname = pname;
	}
	



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}



	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Person p = new Person(1,"huma");
		Person p1= (Person) p.clone();
		Person p2= new Person(1,"huma");
		System.out.println("hascode1 for p = "+p.hashCode());
		System.out.println("hascode1 for p1 = "+p1.hashCode());
		System.out.println("hascode1 for p2 = "+p2.hashCode());

		System.out.println("comparing p and p2 "+p.equals(p2));
		
		if(p.hashCode()==p2.hashCode()) {
			if(p.equals(p2)) {

				System.out.println("both are equal");
			}else {

				System.out.println("both are not equal");
			}
		}else {

			System.out.println("not equal");
		}
	}

}
