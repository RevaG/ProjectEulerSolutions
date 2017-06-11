import java.util.Scanner;

/**
 * 
 * @author Revani Govender
 * Project Euler Problem 5
 * 2520 is the smallest number that can be divided by each of the numbers 
 * from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible 
 * by all of the numbers from 1 to 20?
 *
 *
 */
public class ProjectEulerProblem5 {

	public static void main(String[] args) {
		boolean foundNumber = false;
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.print("Enter a max divisor to find smallest evenly divisible number: ");
		int maxDivisor = reader.nextInt();
		int number = maxDivisor; //Initialize at max and count by max so you can skip 8/10 for example
		while(!foundNumber) {
			for (int divisor = 1; divisor <= maxDivisor; divisor ++) {
				if (number %divisor != 0) {
					number += maxDivisor;
					break;
				} 
				
				if (divisor == maxDivisor){
					System.out.println("smallest evenly divisible number: " + number);
					foundNumber = true;
				}
			}
			
		}
	}

}
