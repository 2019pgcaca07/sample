package com.org.gen.day3;

class CPU{
	double price;
	//nested class
	class Processor{
		
		//data member of nested class
		double cores;
		String manufacture;
		double getCache() {
			return 5.5;
		}
		
	}
	//nested protected class
	protected class RAM{
		//data member of nested protected class
		double memory;
		String manufacture;
		double getClockSpeed() {
			return 3.5;
		}
	}
}

public class NestedMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpu = new CPU();
		
		//how to access nested class
		CPU.Processor pro = cpu.new Processor();
		CPU.RAM ram = cpu.new RAM();
		System.out.println("Processor = "+pro.getCache());
		System.out.println("Ram = "+ram.getClockSpeed());
	}

}
