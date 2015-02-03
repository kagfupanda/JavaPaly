//Siddharth Srinivasan
//Period 4
//Program 3.3
//solves linear equation (Cramers rule)
package my;

import java.util.Scanner;

public class ch3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e and f: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		double e = scanner.nextDouble();
		double f = scanner.nextDouble();
		double denominator = (a * d) - (b * c);
		double x = ((e*d) - (b*f))/denominator;
		double y = ((a * f) - (e * c))/ denominator;
		if (denominator == 0) {
			System.out.println("This equation has no solution");
		} else {
			System.out.println("x is " + x + " and y is " + y);
		}

	}

}
