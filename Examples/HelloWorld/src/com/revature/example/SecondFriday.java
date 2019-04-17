package com.revature.example;
import java.lang.reflect.*;
import java.util.Arrays;

import com.revature.transport.Chairlift;



public class SecondFriday {
	public static void main(String[] args) {
		SecondFriday.reflectingOnChairlifts();
	}
	
	@SuppressWarnings("deprecation")
	static void reflectingOnChairlifts() {
		try {
			Class cLiftClass = Class.forName("com.revature.transport.Chairlift");
			System.out.println(cLiftClass.getSimpleName());
			
			Field[] clFields = cLiftClass.getDeclaredFields();
			System.out.println(Arrays.toString(clFields));
			
			Chairlift c1 = (Chairlift) cLiftClass.newInstance();
			Field gondolaCount = cLiftClass.getDeclaredField("gondolaCount");
			gondolaCount.setAccessible(true);
			gondolaCount.set(c1, 3);
			System.out.println(c1);
			
		}catch (ClassNotFoundException e) {
			e.getStackTrace();
		}catch (InstantiationException e) {
			e.printStackTrace();
		}catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
