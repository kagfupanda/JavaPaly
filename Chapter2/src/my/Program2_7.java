//Siddharth Srinivasan
//Period 4
//Program 2.7
//displays years from minutes
package my;

import java.util.Scanner;

public class Program2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		long minutes = scanner.nextLong();
		long hours = minutes / 60;
		long days = hours / 24;
		long years = days / 365;
		long remainingDays = days % 365;
		System.out.print(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days");

	}

}
