import java.util.*;

/**
 * 
 * @author Revani Govender
 * Project Euler Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 *
 */
public class ProjectEulerProblem3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.print("Enter a number: ");
		long n = reader.nextLong();
		
		System.out.println("Largest Prime Factor: " + findLargestPrime(n));
	}

	public static long findLargestPrime(long n) {
        ArrayList<Long> factors = new ArrayList<Long>();
        for (long i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
		
		return factors.get(factors.size()-1);
		
	}
}
