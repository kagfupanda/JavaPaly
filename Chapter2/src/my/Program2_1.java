//Siddharth Srinivasan
//Period 4
// Project 2.1
//converts celsius to fahrenheit
package my;
import java.util.Scanner;

public class Program2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the degrees in Celsius");
		double celsius = scanner.nextDouble();
		double fahrenheit = (9/5) * celsius + 32;
		System.out.println("The converted number is " + fahrenheit);
		
		

	}

}
