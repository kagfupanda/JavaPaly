package my;

import java.util.Random;
import java.util.Scanner;

public class ch3_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random generator = new Random();
		String playerMove = "";
		String compMove = "";
		System.out.print("Enter 0(scissors), 1(rock), or 2(paper): ");
		int playerInt = scanner.nextInt();
		int compInt = generator.nextInt(3);
		if (compInt == 0) {
			compMove = "Scissors";
		} else if (compInt == 1) {
			compMove = "Rock";
		} else {
			compMove = "Paper";
		}
		if (playerInt == 0) {
			playerMove = "Scissors";
		} else if (playerInt == 1) {
			playerMove = "Rock";
		} else if (playerInt == 2) {
			playerMove = "Paper";
		} else {
			System.out.println("You didn't enter the required numbers");
		}
		if (compInt == playerInt) {
			System.out.println("The computer is " + compMove + " and you are " + playerMove + ". Its a draw");
		} else if (compInt == 1 && playerInt == 0) {
			System.out.println("The computer is " + compMove + " and you are " + playerMove + ". You lost");
		} else if (compInt == 1 && playerInt == 2) {
			System.out.println("The computer is " + compMove + " and you are " + playerMove + ". You win");
		} else if (compInt == 0 && playerInt == 1) {
			System.out.println("The computer is " + compMove + " and you are " + playerMove + ". You win");
		} else if (compInt == 0 && playerInt == 2) {
			System.out.println("The computer is " + compMove + " and you are " + playerMove + ". You lost");
		} else if (compInt == 2 && playerInt == 0) {
			System.out.println("The computer is " + compMove + " and you are " + playerMove + ". You won");
		} else {
			System.out.println("The computer is " + compMove + " and you are " + playerMove + ". You lost");
		}
		

	}

}
