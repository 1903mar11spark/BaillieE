package com.revature.collections;



public class Practice {
	
	public static void main(String[] args) {
		//String a = "a";
		String b = "3-598-2K507-0";
		//System.out.println(encode(a));
		System.out.println(isValidIsbn(b));

		
	}
	/**15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * A check digit is a number that is used to validate a series of numbers whose accuracy you want to insure.
	 *  Frequently the last digit of a number string such as identification number is a check digit. Lets say the 
	 *  identification number starts out at 6 digits. A calculation is done using the six digits and a seventh digit is 
	 *  produced as a result of the calculation. This number is the check digit. There are many calculations 
	 * that can be used - this example illustrates the logic of the MOD11 check digi
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 */ 
			
	public static boolean isValidIsbn(String string) {
		
		String clean = string.replaceAll("\\D+", "");
		
		int[] numbers = new int[clean.length()];
		char[] numString = new char[clean.length()];
		
		int sum=0;
		
		for(int i=0, j=10; i< 10; i++, j--) {
			numString[i] = clean.charAt(i);
			numbers[i] = Character.getNumericValue(numString[i]);
			sum +=numbers[i]*j;
		}
		if(sum%11==0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}


        



		


