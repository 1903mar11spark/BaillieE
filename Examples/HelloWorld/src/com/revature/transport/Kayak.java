package com.revature.transport;

public class Kayak extends Vehicle implements Steerable, Comparable<Kayak>{
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kayak other = (Kayak) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		return true;
	}

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

	@Override
	public int compareTo(Kayak arg0) {
		
		return (new Double(this.length)).compareTo(arg0.getLength()); //we are manually boxing --no autoboxing occurs 
		//return this.length.compareTo(arg0.length); // wants a double  -- can convert to wrapper class Double 
	}

	
	
}
