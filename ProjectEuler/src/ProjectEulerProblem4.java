/**
 * 
 * @author Revani Govender
 * Project Euler Problem 4
 * 
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * 906609
 */
public class ProjectEulerProblem4 {

	public static void main(String[] args) {
		
		// Start with the largest numbers and work backwards
		// Outter loop and inner loop for each of numbers in product
		int product;
		int maxPalindrome = 0;
			for(int k = 999; k > 1; k --){
				for(int i = 999; i > 1; i--) {
				product = k * i;
				if (product == reverseNumbers(product)) {
					if (product > maxPalindrome) {
						maxPalindrome = product;
					}
				}
			}
		}
			System.out.print(maxPalindrome);
		
	}
	
	public static int reverseNumbers(int n) {
	      int reverseNumber =0;
	      while( n != 0 )
	      {
	    	  reverseNumber = (reverseNumber * 10) + (n % 10);
	    	  n = n/10;
	      }
		
	      return reverseNumber;
	}

}
