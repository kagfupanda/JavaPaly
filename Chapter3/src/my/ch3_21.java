package my;

import java.util.Scanner;

public class ch3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter year: (e.g., 2012): ");
		int year = scanner.nextInt();
		System.out.print("Enter month: 1-12: ");
		int month = scanner.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		int day = scanner.nextInt();
		if (month == 1) {
			month = 13;
			year = year - 1;
		} else if (month == 2) {
			month = 14;
			year = year - 1;
		}
		int secondTerm = (26*(month + 1))/(10);
		int thirdTerm = year % 100;
		int fourthTerm = thirdTerm/4;
		int fifthTerm = (year/100)/4;
		int sixthTerm = 5 * (year/100);
		int dayOfTheWeek = (day + secondTerm + thirdTerm + fourthTerm + fifthTerm + sixthTerm) % 7;
		if (dayOfTheWeek == 0) {
			System.out.println("Day of the week is Saturday");
		} else if (dayOfTheWeek == 1) {
			System.out.println("Day of the week is Sunday");
		} else if (dayOfTheWeek == 2) {
			System.out.println("Day of the week is Monday");
		} else if (dayOfTheWeek == 3) {
			System.out.println("Day of the week is Tuesday");
		} else if (dayOfTheWeek == 4 ) {
			System.out.println("Day of the week is Wednesday");
		} else if (dayOfTheWeek == 5) {
			System.out.println("Day of the week is Thursday");
		} else {
			System.out.println("Day of the week is Friday");
		} 
		
		

	}

}
