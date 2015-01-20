/**
 * 
 */
package my;

/**
 * @author Siddharth
 * Period 4
 * Program 1.7
 * This program calculates 2 expressions of approximates of pi and displays the results as a double value 
 */
public class Program1_7 {

	/**
	 * Description: function to approximate pi using the series with max denominator as input
	 * Input: takes an integer max denominator as input
	 * Returns: returns an approximation as double
	 */
	public static double piApproximate(int maxDenominator) {
		double sum = 0;
		boolean flag = true;
		for (int i = 1; i <= maxDenominator; i = i + 2) {
			if (flag == true) {
				sum = sum + 1.0/i;
				flag = false;
			} else {
				sum = sum - 1.0/i;
				flag = true;
			}
		}
		return 4 * sum; // 4 * sum is the approximation according to the series formula
	}
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(piApproximate(11)); // stop at maximum denominator 11
		System.out.println(piApproximate(13)); // stop at maximum denominator 13

	}

}
