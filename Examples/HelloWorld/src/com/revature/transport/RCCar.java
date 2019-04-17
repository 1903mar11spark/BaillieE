package com.revature.transport;

public class RCCar extends Car {

	public RCCar() {
		super();
		System.out.println("constructor for RRC");
		
	}

	public RCCar(int topSpeed, int yearManufactured, String make, String model) {
		super(topSpeed, yearManufactured, make, model);
		//overloaded constructors
	}

	@Override
	public String toString() {
		return "RCCar [getYearManufactured()=" + getYearManufactured() + ", make()=" + getMake() + ", model()="
				+ getModel() + ", toString()=" + super.toString() + ", getTopSpeed()=" + getTopSpeed()+ "]";
	}

	//not overriding will get the same instance values -- it will say whatever
	
	
	public RCCar(int yearManufactured, String make, String model) {
		super(yearManufactured, make, model);
		
	}

	
}
