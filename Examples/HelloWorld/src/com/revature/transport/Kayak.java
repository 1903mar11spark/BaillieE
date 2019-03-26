package com.revature.transport;

public class Kayak extends Vehicle implements Steerable{
	
	private String color;
	private double length;
	
	public Kayak(double length, String color) {
		super();
		this.length = length;
		this.color = color;
	}

	public Kayak() {
		super();
	}

	@Override
	public String toString() {
		return "Kayak [color=" + color + ", length=" + length + "]";
	}

	@Override
	public void turnRight() {
		System.out.println("paddle on the right");
		
	}

	@Override
	public void turnLeft() {
		System.out.println("padde on the left");
		
	}

	@Override
	public void move() {
		System.out.println("kayak is moving fast");
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	
	
}
