package my;

import java.util.Scanner;

public class ch3_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double x3 = scanner.nextDouble();
		double y3 = scanner.nextDouble();
		double x4 = scanner.nextDouble();
		double y4 = scanner.nextDouble();
		
		double a = y1-y2;
		double b = x1 - x2;
		double c = y3 - y4;
		double d = x3 - x4;
		double e = (y1 - y2) *x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4)*y3;
		double denominator = a*d-b*c;
		double intersectionX = Math.abs((e*d - b*f)/(a*d - b*c));
		double intersectionY = Math.abs((a*f - e*c)/(a*d - b*c));
		if (denominator == 0) {
			System.out.println("The two lines are parallel");
		} else {
			System.out.print("The intersection point is at (" + intersectionX + ", " + intersectionY + ")");
		}
		
		
		
	}

}
