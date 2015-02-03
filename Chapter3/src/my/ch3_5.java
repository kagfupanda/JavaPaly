//Siddharth Srinivasan
//Period 4
//Program 3.5
//Determines future day of the week
package my;

import java.util.Scanner;

public class ch3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer for today's day of the week: (between 0 and 6) ");
		int day = scanner.nextInt();
		System.out.println("Enter the number of day elasped: ");
		int elasped = scanner.nextInt();
		int futureDay = ((day + elasped)%6);
		String actualDay = "";
		if (day == 0) {
			actualDay = "Sunday";
		}
		else if (day == 1) {
			actualDay = "Monday";
		} else if (day == 2) {
			actualDay = "Tuesday";
		} else if (day == 3) {
			actualDay = "Wednesday";
		} else if (day == 4) {
			actualDay = "Thursday";
		} else if (day == 5) {
			actualDay = "Friday";
		} else if (day == 6) {
			actualDay = "Saturday";
		}else {
			System.out.print("You didn't enter a correct number");
		}
		
		if (futureDay == 0) {
			System.out.println("The day is " + actualDay + " and the new day is Sunday");
		} else if (futureDay == 1) {
			System.out.println("The day is " + actualDay + " and the new day is Monday");
		} else if (futureDay == 2) {
			System.out.println("The day is " + actualDay + " and the new day is Tuesday");
		} else if (futureDay == 3) {
			System.out.println("The day is " + actualDay + " and the new day is Wednesday");
		} else if (futureDay == 4) {
			System.out.println("The day is " + actualDay + " and the new day is Thursday");
		} else if (futureDay == 5) {
			System.out.println("The day is " + actualDay + " and the new day is Friday");
		} else {
			System.out.println("The day is " + actualDay + " and the new day is Satday");
		}
		
		

	}

}
