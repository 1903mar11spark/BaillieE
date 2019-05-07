package com.revature.creatures;

public abstract class Animal {
	
	protected int speed;
	protected boolean isHungry;
	
	
	public Animal() {
		super();
	}

	public Animal(int speed, boolean isHungry) {
		super();
		this.speed = speed;
		this.isHungry = isHungry;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isHungry() {
		return isHungry;
	}
	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}

	@Override
	public String toString() {
		return "Animal [speed=" + speed + ", isHungry=" + isHungry + "]";
	}
	

}
