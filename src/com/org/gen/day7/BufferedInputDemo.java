package com.org.gen.day7;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class BufferedInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("give file name");
		String name = s.nextLine();
		 
		FileOutputStream f = new FileOutputStream(name,true);
		System.out.println("write into the file");
		String str = s.nextLine();
		byte[] b = str.getBytes();
		
		f.write(b);
		System.out.println("success");
		f.close();

	}

}
