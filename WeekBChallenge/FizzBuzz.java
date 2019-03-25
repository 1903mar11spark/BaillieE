public class FizzBuzz {

public static void main(String[] args) {
	fizzBuzz1(100);
	fizzBuzz2(19,5);
	fizzBuzz3(2,10,2,5);
	int[] numbers = {3,5};
        String[] terms = {"fizz","buzz"};
        fizzBuzz4(1,100,numbers,terms);

	}

//made static
public static void fizzBuzz1(int x) {
	int f = 5;
	int t = 3;
	for(int i = 1; i < x ;i++) {
		if ((i % f == 0) && (i % t == 0)) {
			System.out.println("fizzbuzz");
		} else if (i % f == 0) {
			System.out.println("buzz");
		} else if (i % t == 0){
			System.out.println("fizz");
		} else {
			System.out.println(i);
			}
		}
} 

public static void fizzBuzz2(int m,int n){
	if(m<=n) {
		for(int i = m; i <= n; i++) {
			if ((i % 5 == 0) && (i % 3 == 0)) {
				System.out.println("fizzbuzz");
			} else if (i % 4 == 0) {
				System.out.println("buzz");
			} else if (i % 3 == 0){
				System.out.println("fizz");
			} else {
				System.out.println(i);
			}
		}
			} else {
				System.out.println("m must be less than or equal to n");
		}
}

public static void fizzBuzz3(int m, int n, int fizzNum, int buzzNum){
	if((m<=n) && (fizzNum != buzzNum)) {
		for(int i = m; i <= n; i++) {
			if ((i % fizzNum == 0) && (i % buzzNum == 0)) {
				System.out.println("fizzbuzz");
			} else if (i % fizzNum == 0) {
				System.out.println("buzz");
			} else if (i % buzzNum == 0){
				System.out.println("fizz");
			} else {
				System.out.println(i);
				}
			}
				} else {
				System.out.println("m must be less than or equal to n, and fizzNum cannot be equal to buzzNum");
				}
		}
	}

public static void fizzBuzz4(int m, int n, int[] numbers, String[] terms){
		if (m<=n) {
			for(int i = m; i < n ;i++) {
				if ((i % numbers[0] == 0) && (i % numbers[1] == 0)) {
					System.out.println(terms[0]+terms[1]);
				} else if (i % numbers[0] == 0) {
					System.out.println(terms[0]);
				} else if (i % numbers[1] == 0){
					System.out.println(terms[1]);
				} else {
					System.out.println(i);
				}
			}
				} else {
					System.out.println("M must be less than or equal to n");
			}
}
