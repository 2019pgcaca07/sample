package com.org.gen.day7;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream file = new FileInputStream("E://filestrm.txt");
		
		int i = file.read();
		System.out.println("read the file data");
		System.out.println((char)i);
		file.close();
		}catch(IOException e) {
			e.printStackTrace();
			
		}

	}

}
