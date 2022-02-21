package com.org.gen.day6;

import java.util.LinkedList;

public class ProductLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<LinkList> link = new LinkedList<LinkList>();
		
		LinkList p1= new LinkList(1,"Laptop","electronic",10);
		LinkList p2= new LinkList(2,"Mobile","electronic",20);
		LinkList p3= new LinkList(3,"Tab","electronic",20);
		LinkList p4= new LinkList(4,"Macbook","electronic",15);
		
		link.add(p1);link.add(p2);link.add(p3);link.add(p4);
		
		for(LinkList p : link) {
			System.out.println("product id "+p.id+"product name "+p.pname+"Type "+p.ptype+"quantity "+p.qnty);
		}
		

	}

}
