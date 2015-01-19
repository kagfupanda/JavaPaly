//Siddharth Srinivasan
//Period 4
//Program 2.5
//calculates the gratuity and total
package my;

import java.util.Scanner;

public class Progam2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter you subtotal: ");
		double subTotal = scanner.nextDouble();
		System.out.print("Enter your gratuity rate: ");
		double gratuity = scanner.nextDouble();
		double decGrat = gratuity / 100;
		double finalGrat = decGrat * subTotal;
		double total = finalGrat + subTotal;
		System.out.println("The gratuity is $" + finalGrat + " and total is $" + total);

	}

}
