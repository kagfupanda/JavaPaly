//Siddharth Srinivasan
//Period 4
//Program 3.15
//Program determines if you won the lottery or not
package my;

import java.util.Scanner;

public class ch3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generate lottery number
		int lottery = (int)(Math.random() * 1000);
		
		//prompt user to enter a number
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");
		int guess = scanner.nextInt();
		
		//get digits from lottery number
		int lotteryDigit1 = (lottery / 10) / 10;
		int lotteryDigit2 = (lottery / 10) % 10;
		int lotteryDigit3 = lottery % 10;
		
		//get digits from the guess
		int guessDigit1 = (guess / 10) / 10; //most significant digit (left most)
		int guessDigit2 = (guess / 10) % 10; // middle
		int guessDigit3 = guess % 10;
		
		System.out.println("The lotter number is " + lottery);
		
		//check the guess
		if(guess == lottery) {
			System.out.println("Exact match: you win $10,000");
		} else if (guessDigit1 * 100 + guessDigit2 * 10 + guessDigit3 == lottery
				|| guessDigit1 * 100 + guessDigit3 * 10 + guessDigit2 == lottery
				|| guessDigit2 * 100 + guessDigit1 * 10 + guessDigit3 == lottery
				|| guessDigit2 * 100 + guessDigit3 * 10 + guessDigit1 == lottery
				|| guessDigit3 * 100 + guessDigit1 * 10 + guessDigit2 == lottery
				|| guessDigit3 * 100 + guessDigit2 * 10 + guessDigit1 == lottery) {
			System.out.println("Math all digits: you win $3,000");
		} else if (guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit1 == lotteryDigit3
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2
				|| guessDigit2 == lotteryDigit3
				|| guessDigit3 == lotteryDigit1
				|| guessDigit3 == lotteryDigit2
				|| guessDigit3 == lotteryDigit3) {
			System.out.println("Match one digit: you win $1,000");
		} else {
			System.out.println("Sorry no match");
		}


	}

}
