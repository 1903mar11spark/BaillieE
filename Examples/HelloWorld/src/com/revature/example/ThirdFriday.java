package com.revature.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.transport.Car;

public class ThirdFriday {
	
	public static void main(String[] args) {
		
		//String filename = "src/cereal.txt";
		//List<Car> cars = new ArrayList<Car>();
		//cars.add(new Car(12, 1890, "Model", "A"));
		//cars.add(new Car(16, 1893, "Model", "B"));
		//cars.add(new Car(18, 1893, "Model", "C"));
		
		//ThirdFriday.serialize(filename, cars);
		System.out.println(ThirdFriday.deserialize(filename));
	}

	static void serialize(String filename, Object o) {
		
		try {
			FileOutputStream fo = new FileOutputStream(filename);
			
			ObjectOutputStream out = new ObjectOutputStream(fo);
			out.writeObject(o);
			
			out.close();
			fo.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void deserialize(String filename) {
		Object o = null;
		try {
			FileInputStream fileIn = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			o = in.readObject();
			in.close();
			fileIn.close();
			
		} catch (Exception e) {
			
		}
		return o;
		
	}
}
