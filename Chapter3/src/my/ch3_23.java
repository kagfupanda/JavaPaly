//Siddharth Srinivasan
//Period 4
//Program 3.23
//program determines if point is in rectangle or not
package my;

import java.util.Scanner;

public class ch3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		final double widRect = 10;
		final double heightRect = 5;
		final double centerRectX = 0;
		final double centerRectY = 0;
		System.out.print("Enter a point with two coordinates: ");
		double pointX = scanner.nextDouble();
		double pointY = scanner.nextDouble();
		double horizDistance = pointX - centerRectX;
		double vertDistance = pointY - centerRectY;
		if (horizDistance <= (10/2) && vertDistance <= (5.0/2)) {
			System.out.println("Point (" + pointX + ", " + pointY + ") is in the rectangle");
		} else {
			System.out.println("Point (" + pointX + ", " + pointY + ") is not in the rectangle");
		}

	}

}
