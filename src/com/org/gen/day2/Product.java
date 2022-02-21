package com.org.gen.day2;

public class Product {
	
	int pid;String proName; int price;
	static String comName ="javacomp";
	
	public Product(int pid,String proName,int price) {
		
		this.pid=pid;
		this.proName=proName;
		this.price=price;
		
		
	}
	static void changeCompany() {
		comName = "Ranjeet";
	}
	
	public void display() {
		System.out.println("Product id:"+pid+"name of product :"+proName+"price"+price+"company Name :"+comName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Product p1=new Product(1,"abc",2000);
		Product p2=new Product(2,"alc",3000);
		Product p3=new Product(3,"ayc",4000);
		Product.changeCompany();   // or simply changeComany();
		p1.display();
		p2.display();
		p3.display();
		
	}

}
