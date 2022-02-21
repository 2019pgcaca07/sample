package com.org.gen.day4;

class Compare{
	int id ;
	String name;
	public Compare(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(this==obj)
		  return true;
		  if(obj == null || obj.getClass()!= this.getClass())
			  return false;
		  Compare c = (Compare)obj;
		  return (c.name == this.name && c.id == this.id);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
}

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Compare c1 = new Compare(1,"lk");

		Compare c2 = new Compare(1,"lk");
		
		if(c1.hashCode()==c2.hashCode()) {
			
			if(c1.equals(c2))
				System.out.println("equal");
			else
				System.out.println("not equal");
		}else {
			System.out.println("not equal");
		}

	}

}
