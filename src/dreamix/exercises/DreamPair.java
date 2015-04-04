package dreamix.exercises;

/**
 * Provide static methods to check if a number
 * is a dream pair or not. Also a method
 * to calculate the sum of a number's denominators.
 * @author Viktoriya
 *
 */
public class DreamPair {
	
	public static void main(String[] args) {
		
		for(int p = 1; p <= 1000; p++) {
			if(isDreamPair(p)) {
				System.out.println("[" + p + " , " + denominatorsSum(p) + "]");
			}
		}
	}
	
	/** Checks whether a number is a dream pair or not
	 * @param p - the number to be checked
	 * @return true - if it is a dream pair; otherwise return false
	 */
	public static boolean isDreamPair(int p) {
		int pSum = denominatorsSum(p);
		int qSum = denominatorsSum(pSum);
		return (p == qSum); 
			
	}
	
	/** Calculates the sum of the denominators of a number
	 * @param number
	 * @return int - the sum of the number's denominators
	 */
	public static int denominatorsSum(int number) {
		int sum = 0;
		for(int i = number - 1; i > 0; i--) {
			if(number % i == 0) {
				sum += i;
			}
		}
		
		return sum;
		
	}

}
