 import java.util.Scanner;
 
 
 public class RectangularArea
 {
 	public static void main(String[] args)
 	{
 		Scanner input = new Scanner(System.in);
 		double length = getLength(input);
 		double width = getWidth(input);
 		double area = getArea(length, width);
 		displayData(length, width, area);
 	}
 	
 	public static double getLength(Scanner input)
 	{
 		System.out.println("Enter the length");
 		double length = input.nextDouble();
 		return length;
 	}
 	
 	public static double getWidth(Scanner input)
 	{
 		System.out.println("Enter the width");
 		double width = input.nextDouble();
 		return width;
 	}
 	
 	public static double getArea(double length, double width)
 	{
 		double area = length * width;
 		return area;
 	}
 	
 	public static void displayData(double length, double width, double area)
 	{
 		System.out.println("The length is: " + length
 							+ "\nThe width is: " + width
 							+ "\nThe area is: " + area);				
 	}

 }