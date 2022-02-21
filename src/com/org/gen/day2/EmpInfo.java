package com.org.gen.day2;

public class EmpInfo {
	
	int id ;String name;
	Address adress; // an object of one class is created as a data member inside another class
	VInfo vinfo;
	
	public EmpInfo(int id, String name, Address adress, VInfo vinfo) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.vinfo = vinfo;
	}
  void display() {
	  System.out.println(id +"  "+name);
	  System.out.println(adress.city+ " "+adress.state+ " "+adress.house_no+" "+adress.pin);
	  System.out.println(vinfo.vname+" "+vinfo.vModel);
  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a1 = new Address("Mumbai","Maharashtra",111,12345);
		
		VInfo v1 = new VInfo("xyz","Maruti");
		
		EmpInfo e =new EmpInfo(123,"ranjeet",a1,v1);
		e.display();

	}

}
