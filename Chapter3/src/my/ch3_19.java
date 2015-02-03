package my;

import java.util.Scanner;

public class ch3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value for edge 1: ");
		double edge1 = scanner.nextDouble();
		System.out.print("Enter the value for edge 2: ");
		double edge2 = scanner.nextDouble();
		System.out.print("Enter the value for edge 3: ");
		double edge3 = scanner.nextDouble();
		if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1) {
			System.out.println("This is a valid triangle");
		} else {
			System.out.println("This is not a valid triangle");
		}
			

	}

}
