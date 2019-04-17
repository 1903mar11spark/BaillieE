package com.revature.calculator;

public class Calculator {

	public static void main(String[] args) {
		double d = 2;
		double e = 5;
		double x = 2;
		double y = 3;
		double[] arr = {2,3,4,5};
		exp(d,e);
		avg(d,e,x,y);
		avg1(arr);
	}
	 
	/*
	public double add(double d, double e) {
		double z;
		z = d + e;
		return z;
	}

	public double sub(double d, double e) {
		double z;
		z = d - e;
		return z;
	}

	public double mult(double d, double e) {
		double z;
		z = d * e;
		return z;
	}

	public double div(double d, double e) {
		double z;
		z = d % e;
		return z;
	}
*/
	public static double avg(double d, double e, double x, double y) {
		double z;
		
		z = ((d + e + x + y)/4);
		System.out.println(z);
		return z;
	}
	
	public static double avg1(double[] numbers) {
		double z;
		int sum = 0;
		if(numbers.length != 0) {
			for(int 1=0; i<numbers.length; i++) {
				sum+= numbers[i];
			}
			double avg = sum/numbers.length
		}
		return z;
	}

	public static double exp(double d, double e) {
		double x = 1;
		if(d == 0) {
			return x;
		} else 
			for(int i=0;i<e;i++) {
				x=x*d;
			}
		System.out.println(x);
		return x;
        }
}
