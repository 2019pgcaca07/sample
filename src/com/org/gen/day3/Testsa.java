package com.org.gen.day3;

class Car1{
	String carName,carType;
	
	
	public Car1(String carName, String carType) {
		super();
		this.carName = carName;
		this.carType = carType;
	}
	private String getCarName() {
		
		return this.carName;
	}
//inner class
	class Engine{
		String engineType;
		void setEngine() {
			//access outerclass member
			if(Car1.this.carType.equals("4WD")) {
				//invoking method getCarNAme() of car
				if(Car1.this.getCarName().equals("Crysler")) {
					this.engineType="Smaller";
				}else {
					this.engineType="Bigger";
				}
			}
		}
		String getEngineType() {
			return this.engineType;
		}
	}
}

public class Testsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car1 car = new Car1("Mazda","BMW");
		Car1.Engine eng = car.new Engine();
		eng.setEngine();
		eng.getEngineType();
		

	}

}
