package com.revature.example;

import java.util.ArrayList;
import java.util.List;

import com.revature.transport.*; //do absolutely nothing but save time typing --> searching directory at one level

/*
 *import statements:
 * import com.revature.transport.* => every class in the transport package (single level)
 * import com.reavture.car.*+> just the car class
 * import static com.revature.someotherpackage.classinsomeontherpackage.* => will grab all the 
 * static members of that class
 * 
 * import static com.revature.someotherpackage.ClassInSomeOtherPackage.STATICMEMBER => just STATICMEMBER
 */

public class Tuesday {
	
	public static void main (String[] args) {
		System.out.println("Hello World");
		funWithConstructorsAndCodeBlocks();
	}
	
	static void funWithConstructorsAndCodeBlocks() {
		
		Car c = new Car(); //Vehicle constructor completes before Car
		Car c2 = new Car(800, 2002, "Mercury", "Sable");
		//toString has not been updated which makes it print without showing the top speed
		//How to set value of top speed?
		System.out.println(c2);
		
		//RCCar rcc = RCCar(900, 2019, "Mattel", "Hot Wheels");
		//System.out.println(rcc);
		
	}
	
	static void funWithTransport() {
		//using fully qualified classname to refer to Kayak.
		//this always works!
		com.revature.transport.Kayak k1 = new com.revature.transport.Kayak(3.3, "red");
		
		Kayak k2 = new Kayak(4.5, "silver");
		
		//make some more vehicles
		
		Car c1 = new Car(90, 1999, "Hyundai", "Tuscan");
		Car c2 = new Car(90, 2019, "Tesla", "Model S");
		
		Chairlift cl1 = new Chairlift(12,950);
		
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(k2);
		vehicles.add(k1);
		vehicles.add(c1);
		vehicles.add(c2);
		vehicles.add(cl1);
		
		for (Vehicle v: vehicles) {
			System.out.println(v);
			v.move();
			if (v instanceof Steerable) { //if you remove this than a ClassCastException will be made
				((Steerable) v).turnLeft();
			}
		}
		
		
		
	}
	@SuppressWarnings("deprecation")
	static void funWithWraperClasses() {
		
		//integer-valued primitives
		byte b = 5;
		short s = 6;
		int i = 7;
		long l = 8;
		
		Integer j = i; //autoboxing
		b = new Byte((byte)9); //narrowing conversion - be careful!
		//b = new byte(valueof(9)); 
		
		String str = "55.4";
		Double d = Double.parseDouble(str); 
		//method of Java Double class is a built in method in Java that 
		//returns a new double initialized to the value represented by 
		//the specified String, as done by the valueOf method of class Double.
		d = 77.4;
		
		//check type of d
		System.out.println(d.getClass());
		//or another way
		boolean isDouble = (d instanceof java.lang.Double);
		System.out.println(isDouble);
		
		//
		//str = i; no more loose typing
	}

}
