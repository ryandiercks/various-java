import java.util.Scanner; // Needed for the scanner class
/**
 * Write a description of class Payroll here.
 * 
 * @author (Ryan Diercks) 
 * @version (02022015)
 */
public class Payroll
{
   public static void main(String[] args)
       {
           String name;         // To hole a name
           int hours;           // Hours worked
           double payRate;      // Hourly pay rate
           double grossPay;     // Gross Pay
           
           //Create a Scanner object to read input.
           Scanner keyboard = new Scanner(System.in);
           
           // Get the user's name.
           System.out.print("What is your name? ");
           name = keyboard.nextLine();
           
           // Get the number of hours worked this week.
           System.out.print("How many hours did you work this week? ");
           hours = keyboard.nextInt();
           
           // Get the user's hourly pay rate.
           System.out.print("What is your hourly pay rate? ");
           payRate = keyboard.nextDouble();
           
           // Calculate the gross pay.
           grossPay = hours * payRate;
           
           // Display the resulting information.
           System.out.println("Hello " + name);
           System.out.println("Your gross pay is $" + grossPay);
        }
    }
           