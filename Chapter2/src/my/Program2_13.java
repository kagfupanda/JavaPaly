/**
 * 
 */
package my;

import java.util.Scanner;

/**
 * @author Siddharth
 * Period 4
 * Program 2.13
 * This program reads a monthly saving amount and displays the account value after six months
 *
 */
public class Program2_13 {
	/**
	 * Description: calculates ending account after numMonths months
	 * Input:
	 * @param numMonths
	 * @param monthlyDeposit
	 * @param annualRate
	 * Return: returns ending balance as a double
	 */
	public static double getEndingBalance(int numMonths, double monthlyDeposit, double annualRate) {
		double monthlyRate = annualRate/12; 
		double endingBalance1 = monthlyDeposit * (1 + monthlyRate);
		double endingBalance2 = (monthlyDeposit + endingBalance1) * (1 + monthlyRate);
		double endingBalance = 0;
		for (int i = 1; i <= numMonths; i = i + 1) {
			endingBalance = (monthlyDeposit + endingBalance)  * (1 + monthlyRate);
		}
		return endingBalance;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of months: ");
		int numberOfMonths = scanner.nextInt(); // from the question
		System.out.print("Enter the monthly deposit: ");
		double monthlyDeposit = scanner.nextDouble()/100; // from the question
		System.out.print("Enter the annual interest rate: ");
		double annualRate = scanner.nextDouble(); //from the question
		System.out.format("%.2f%n", getEndingBalance(numberOfMonths, monthlyDeposit, annualRate));

	}

}
