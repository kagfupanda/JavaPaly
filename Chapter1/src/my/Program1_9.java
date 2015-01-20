/**
 * 
 */
package my;

/**
 * @author Siddharth
 * Period 4
 * Program 1.9
 * This program calculates the area and perimeter and displays the result as a double
 */
public class Program1_9 {

	/**
	 * Description: function to calculate the area with length and width as input
	 * Input: takes 2 doubles length and width as input
	 * Return: returns the area as a double
	 */
	public static double getArea(double length, double width) {
		double area = length * width;
		return area;
	}
	/**
	 * Description: function to calculate the perimeter with length and width as input
	 * Input: takes 2 doubles length and width as input
	 * Return: returns the perimeter as a double
	 */
	public static double getPerimeter(double length, double width) {
		double perimeter = 2 * (length + width);
		return perimeter;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getArea(4.5D, 7.9D));
		System.out.println(getPerimeter(4.5, 7.9));

	}

}
