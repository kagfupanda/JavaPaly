//Siddharth Srinivasan
//Period 4
//Program 3.29
//Program determines if circle is in or overlapping
package my;

import java.util.Scanner;

public class ch3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double centerX1 = scanner.nextDouble();
		double centerY1 = scanner.nextDouble();
		double radius1 = scanner.nextDouble();
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double centerX2 = scanner.nextDouble();
		double centerY2 = scanner.nextDouble();
		double radius2 = scanner.nextDouble();
		double distanceCenter = Math.sqrt(Math.pow(centerX2 - centerX1, 2) + Math.pow(centerY2 - centerY1, 2));
		double radiusCondition1 = Math.abs(radius1 - radius2);
		double radiusCondition2 = radius1 + radius2;
		if (distanceCenter <= radiusCondition1) {
			System.out.println("circle2 is inside circle1");
		} else if (distanceCenter <= radiusCondition2) {
			System.out.println("circle2 overlaps circle1");
		} else {
			System.out.println("circle2 does not overlap circle1");
		}

	}

}
