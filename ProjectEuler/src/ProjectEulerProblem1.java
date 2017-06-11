/** 
 * @author Revani Govender
 * Project Euler Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class ProjectEulerProblem1 {
		
	public static void main(String[] args) {
		int total = 0;
		int limitNumber = 1000;
		
		for(int i=1; i<limitNumber; i++){
			if (i%3 == 0 || i%5==0){
				System.out.print(i + "; ");
				total +=i;
			}
		}
		
		System.out.print("\n" + total);
	}
	

}
