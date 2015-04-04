package dreamix.exercises;

import java.util.Scanner;

/**
 * The class contains static methods for
 * checking if a number is factorialix or not and
 * for calculating a number's factorial.
 * Factorialix number is a natural number 
 * that equals the sum of the factorials 
 * of its decimal digits.  
 * @author Viktoriya
 *
 */
public class Factorialix {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		Integer n = Integer.valueOf(scanner.next());
		scanner.close();
		for (int i = 3; i <= n; i++) {
			if(isFactorialix(i)) {
				System.out.println(i);
			}
		}

	}
	/**
	 * Calculates if a number is factorialix or not
	 * @param n - the number that will be checked
	 * @return boolean - is n factorialix or not
	 */
	public static boolean isFactorialix(int n) {
		int factSum = 0;
		int tempNum = n;
		int j = 10;
		while(tempNum != 0) {
			factSum += factorial(tempNum % j);
			tempNum /= 10;
		}
		return factSum == n; 
	}
	
	/**
	 * Calculates the factorial of a number
	 * @param n - the number which factorial is needed
	 * @return int - factorial of n
	 */
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		return n * factorial(--n);
	}
}