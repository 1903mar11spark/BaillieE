package com.revature.transport;

public class Chairlift extends Vehicle {
	
	private double lengthInMeters;
	private int gondolaCount;
	
	public Chairlift(double lengthInMeters, int gondolaCount) {
		super();
		this.lengthInMeters = lengthInMeters;
		this.gondolaCount = gondolaCount;
	}

	public Chairlift() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Chairlift [lengthInMeters=" + lengthInMeters + ", gondolaCount=" + gondolaCount + "]";
	}

	@Override
	public void move() {
		System.out.println("chairlift is moving");
	}

	public double getLengthInMeters() {
		return lengthInMeters;
	}

	public void setLengthInMeters(double lengthInMeters) {
		this.lengthInMeters = lengthInMeters;
	}

	public int getGondolaCount() {
		return gondolaCount;
	}

	public void setGondolaCount(int gondolaCount) {
		this.gondolaCount = gondolaCount;
	}
	

}
