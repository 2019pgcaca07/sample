package com.org.gen.day3;

abstract class Marks{
	abstract void getPercentage();
}

class StudA extends Marks{
	int sub1,sub2,sub3;

	public StudA(int sub1, int sub2, int sub3) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	int per = (sub1+sub2+sub3)%3;
	void getPercentage() {
		System.out.println("Percentage of student A is "+per+"%");
	}
}
class StudB extends Marks{
	int sub1,sub2,sub3,sub4;

	public StudB(int sub1, int sub2, int sub3,int sub4) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
	}
	int sum = (sub1+sub2+sub3+sub4);

	double per = (sum/300.0)*100;
	void getPercentage() {
		System.out.println("Percentage of student B is "+per+"%");
	}
}

public class DayThree3rdQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudA s1 = new StudA(40,65,55);
		s1.getPercentage();
		StudB s2 = new StudB(40,65,55,60);
		s2.getPercentage();
		
	

	}

}
