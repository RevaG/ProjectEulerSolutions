import java.util.Scanner;

/**
 * @author Revani Govender
 * Project Euler Problem 7
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
 * we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 *
 */
public class ProjectEulerProblem7 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find the nth prime: ");
        int n = scanner.nextInt();
        if (n == 1) {
    		System.out.println("The " + n + "st prime is: " + nthPrime(n));

        } else if (n == 2) {
    		System.out.println("The " + n + "nd prime is: " + nthPrime(n));

        } else {
        	System.out.println("The " + n + "th prime is: " + nthPrime(n));
        }
    }
    /*
     * Returns the nth prime 
     */
    public static long nthPrime(long n) {
        int numberOfPrimes = 1;
        long prime = 1;
        
        while (numberOfPrimes <= n) {
            prime++;
            if (isPrime(prime)) {
                numberOfPrimes++;
            }
        }
        return prime;
    }
    
    /*
     * checks if prime, 
     * returns true if prime, else false
     */
    public static boolean isPrime(long n) {
        if (n < 2) {
        	return false;
        }  else if (n == 2) {
        	return true;
        }
        
        for (int i = 2; i < Math.pow(n, 0.5) + 1; i++) {
            if (n % i == 0) {
                return false;
            } 
        }
        return true;
            
    }

}
