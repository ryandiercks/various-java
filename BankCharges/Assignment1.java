
/**
 * Nathan Lee Becker
 * 03/11/15
 */

/**
 *  This Program calculates Bank Charges
 */

// Imports
import java.util.Scanner;
import java.text.DecimalFormat;

public class Assignment1 
{
    public static void main(String[] args) 
    {    
        // Creates Scanner input
        Scanner input = new Scanner (System.in);

        //Variables
        int numberOfChecks = 0;
        double monthlyCharge = 10.00;
        double bankFees = 0.0;
        double totalCharges = 0;
        
        // Creates decimal format
        DecimalFormat formatter = new DecimalFormat("#,##0.00");

        // Get number of checks
        System.out.print("How many checks did you write this month?");
        numberOfChecks = input.nextInt();
        
        // Make sure number of checks are not 0
        while (numberOfChecks <= 0)
        {
            System.out.println("0 is not a valid entry for number of checks");
            System.out.print("How many checks did you write this month?");
            numberOfChecks = input.nextInt();
        }

        // If/Else Statesments for check fees
        if (numberOfChecks < 20)
        {   
            bankFees=numberOfChecks * 0.10;
        }
        if (numberOfChecks >= 20 && numberOfChecks < 40)
        {
            bankFees=numberOfChecks * 0.08;
        }
        else if (numberOfChecks >= 40 && numberOfChecks < 60)
        {
            bankFees=numberOfChecks * 0.06;
        }
        else if (numberOfChecks > 60)
        {
            bankFees=numberOfChecks * 0.04;
        }
        
        totalCharges = bankFees + monthlyCharge;

        // Print out service fee and total charges
        System.out.println("Service fee = $" + bankFees);
        System.out.println("Total charges = $" + totalCharges);




    }
}
