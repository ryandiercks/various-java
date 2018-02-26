/*Ryan Diercks
 *
 *Write a program that calculates the amount a person would earn over a period of time if 
 *his or her salary is one penny the first day, two pennies the second day, and continues to
 *double each day. The program should display a table showing the salary for each day, and 
 *then show the total pay at the end of the period. The output should be displayed in a dollar 
 *amount, not the number of pennies.
 *
 *Input Validation: Do not accept a number less than 1 for the number of days worked
 *
 */
 
import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

 
public class PenniesForPay
 	{
 		public static void main(String[] args)
 		{
 			Scanner input = new Scanner(System.in);
 			DecimalFormat formatter = new DecimalFormat("#.00");
 			int numberOfDaysWorked;
 			double totalPay, salary, pennies;
 			
 			System.out.println("Enter number of days:");
 			numberOfDaysWorked = input.nextInt();
 			
 			while(numberOfDaysWorked < 1)
 			{
 				System.out.println("Must enter number greater than 1:");
 				System.out.println("Enter number of days:");
 				numberOfDaysWorked = input.nextInt();
 			}
 			
 			System.out.println("Day        Amount(Dollars)");
 			System.out.println("--------------------------");
 			
 			int day = 0;
 			pennies = 1;
 			totalPay = 0;
 			
 			for(int x = 1; x <= numberOfDaysWorked; x++)
 			{
 				day++;
 				if(day > 1)
 				{
 					pennies *= 2;
 					salary = pennies/100;
 					System.out.println(day + "          $ " + formatter.format(salary));
 				}
 				else
 				{	
 					salary = pennies/100;
 					System.out.println(day + "          $ " + formatter.format(salary));
 				}
 					
 				totalPay += salary;
 			}	
 				
 			System.out.println("The total pay is: " + totalPay);		
 		}
 
 }