
/**
 * Write a description of class MilesPerGallon here.
 * 
 * @author (Ryan Diercks) 
 * @version (01292015)
 */

import java.util.Scanner;
public class MilesPerGallon
{
    public static void main(String[] args)
    {
        double miles;       //Miles Driven
        double gallons;     //Gallons used
        double mpg;         //Miles-Per-gallon
        
        //Create a scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Prompt the user to enter the miles driven.
        System.out.print("Enter the miles driven: ");
        miles = keyboard.nextDouble();
        
        //prompt the user to enter the galons used.
        System.out.print("Enter the gallons used: ");
        gallons = keyboard.nextDouble();
        
        //Calculate miles-per-gallon
        mpg = miles / gallons;
        
        //Display the miles-per-gallon
        System.out.println("The MPG is " + mpg);
    }
}
    