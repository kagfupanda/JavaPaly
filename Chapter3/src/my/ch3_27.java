package my;

import java.util.Scanner;

public class ch3_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		double pointX = scanner.nextDouble();
		double pointY = scanner.nextDouble();
		//System.out.println(pointX);
		//System.out.println(pointY);
		double triPoint1x = 0;
		double triPoint1y = 100;
		double triPoint2x = 200;
		double triPoint2y = 0;
		double triSlope = (triPoint1y - triPoint2y)/(triPoint1x - triPoint2x);
		//System.out.println(triSlope);
		if ((pointX >= 0.0 && pointX <= 200.0) && (pointY >= 0.0 && pointY <= 100.0)) {
			double maxY;
			maxY = triPoint1y + triSlope * pointX - triSlope * triPoint1x;
			//System.out.println(maxY);
			if (pointY <= maxY) {
				System.out.println("The point is inside the triangle");
				return;
			}
		}
		System.out.println("The point is outside the triangle");

	}

}
