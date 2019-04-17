package com.revature.transport;

public abstract class Vehicle {
	
	public Vehicle() {
		super();
		System.out.println("vehicle constructor completed");
	} 
	
	
	
	public Vehicle(int topSpeed) {
		super();
		this.topSpeed = topSpeed;
		System.out.println("vehicle noargs constructor completed");
	}



	private int topSpeed;
	//if protected Car would have inherited it 
	
	public int getTopSpeed() {
		return topSpeed;
	}


	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}


	public abstract void move();

}
