/**
 * 
 */
package my;

import java.util.Scanner;

//Siddharth Srinivasan
//Period 4
//Program 2.25
//This program displays workers work information 
 
 
public class Program2_25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = scanner.next();
		System.out.print("Enter hours worked this week: ");
		double hours = scanner.nextDouble();
		System.out.print("Enter hourly pay Rate: ");
		double pay = scanner.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double fedTax = scanner.nextDouble() * 100;
		System.out.print("Enter state tax withholding rate: ");
		double stateTax = scanner.nextDouble() * 100;
		double grossPay = pay * hours;
		double fedWithhold = grossPay * (fedTax/100);
		double stateWithhold = grossPay * (stateTax/100);
		double netPay = grossPay - (stateWithhold + fedWithhold);
		System.out.println("Employee Name: " + name);
		System.out.println("Hours worked: " + hours);
		System.out.println("Pay rate: " + pay);
		System.out.format("Gross Pay: %.2f%n", grossPay);
		System.out.format("Federal Withholding: %.2f%n", fedWithhold);
		System.out.format("State withholding: %.2f%n", stateWithhold);
		System.out.format("Total deduction: %.2f%n", (stateWithhold + fedWithhold));
		System.out.format("Net Pay: $ %.2f%n", netPay);
		
		
		
		

	}

}
