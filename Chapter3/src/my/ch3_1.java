package my;
import java.util.Scanner;

/*
 * @author Siddharth Srinivasan
 * Period 4
 * Program 3.1
 * This program computes the 2 roots or a quadratic formula
 */
public class ch3_1 {
	public static double discriminant(double a, double b, double c) {
		double discr = Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5);
		return discr;
	}
	
	public static double getPositiveDiscrRoot1(double a, double b, double discr) {
		double root1 = (-b + discr)/(2*a);
		return root1;
	}
	
	public static double getPositiveDiscrRoot2(double a, double b, double discr) {
		double root2 = (-b - discr)/(2*a);
		return root2;
	}
	
	public static double getZeroDiscrRoot(double a, double b) {
		double zeroRoot = (-b)/(2*a);
		return zeroRoot;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// step 1: get a, b, c inputs
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		// step 2: compute discriminant
		double discr = discriminant(a, b, c);
		// step 3: conditional statements, check discriminant
		if (discr > 0.0)  { // double value comparisons
			System.out.println("The roots are " + getPositiveDiscrRoot1(a, b, discr) + " and" + getPositiveDiscrRoot2(a, b, discr));
		} else if (discr == 0.0) {
			System.out.println("The root is " + getZeroDiscrRoot(a, b));
		} else {
			System.out.println("The equation has no real roots");
		}
		// positive discriminant, call getPositiveDisrRoot1(), getPositiveDiscRoot2() and display results
		// negative discriminant, display no roots
		// zero discriminant, call getZeroDiscrRoot() and display results


	}

}
