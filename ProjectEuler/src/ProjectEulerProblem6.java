import java.util.Scanner;

/**
 * @author Revani Govender
 * Project Euler Problem 6
 * The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of
 * the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the 
 * first one hundred natural numbers and the square of the sum.
 *
 */
public class ProjectEulerProblem6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.print("Enter number of natural numbers to calculate: ");
		int number = reader.nextInt();
		System.out.println("Square of Sums - Sum of Squares: " + (squareOfSums(number) - sumOfSquares(number)));
		
	}
	
	public static int sumOfSquares(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum = sum + (i*i); //  also:  Math.pow(i, 2) for square

		}
		return sum;
	}
	
	public static int squareOfSums(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
		}

		return sum * sum;
	}
	

}
