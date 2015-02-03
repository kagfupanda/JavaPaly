//Siddharth Srinivasan
//Period 4
//Program 3.33
//This program takes the weight and price of 2 packages and displays which package has the better price
package my;

import java.util.Scanner;

public class ch3_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter weight and price for package 1: ");
		double weight1 = scanner.nextDouble();
		double price1 = scanner.nextDouble();
		System.out.print("Enter weight and price for package 2: ");
		double weight2 = scanner.nextDouble();
		double price2 = scanner.nextDouble();
		
		double pricePerWeight1 = price1/weight1;
		double pricePerWeight2 = price2/weight2;
		
		
		if (pricePerWeight1 < pricePerWeight2) {
			System.out.println("Package 1 has a better price");
		} else if (pricePerWeight1 > pricePerWeight2) {
			System.out.println("Package 2 has a better price");
		} else {
			System.out.println("Package 1 and 2 have equal price");
		}
		

	}

}
