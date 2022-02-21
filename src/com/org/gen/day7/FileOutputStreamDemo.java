package com.org.gen.day7;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data="Reading the data from the file and writting by machine";
		try {
			FileOutputStream out = new 	FileOutputStream("E://filestrm.txt");
			byte[] arr = data.getBytes();	
			out.write(arr); 
			System.out.println(" done ||");
			out.close();
		}catch(Exception e) {
			
		}

	}

}
