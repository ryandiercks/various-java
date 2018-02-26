import java.util.Scanner; // Needed for the scanner class
/**
 * Write a description of class SalesTaxScanner here.
 * 
 * @author (Ryan Diercks) 
 * @version (02032015)
 */
public class SalesTaxScanner
{
   public static void main(String[] args)
       {
           String name;         // To hold a name
           double purchase;                   // Purchase price
           double stateSalesTax;              // State sales tax
           double countySalesTax;             // Hourly pay rate
           double totalTax;                   // Total Tax
           double totalSale;                  // Total Sale

           
           //Create a Scanner object to read input.
           Scanner keyboard = new Scanner(System.in);
           
           // Get the user's name.
           System.out.print("What is your name? ");
           name = keyboard.nextLine();
           
            // Get the purchase price.
           System.out.print("What was the amount of your purchase? ");
           purchase = keyboard.nextDouble();
           
           // Get the state sales tax.
           System.out.print("What is the state sales tax? ");
           stateSalesTax = keyboard.nextDouble();
           
           // Get the county sales tax.
           System.out.print("What is the county sales tax? ");
           countySalesTax = keyboard.nextDouble();
           
           
           // Calculate the total tax.
           totalTax = stateSalesTax + countySalesTax;
           
           // Calculate the total of the sale.
           totalSale = ((stateSalesTax + countySalesTax) + 1) * purchase;
           
           // Display the resulting information.
           System.out.println("Hello " + name);
           System.out.println("Your total sales tax is " + totalTax);
           System.out.println("The total of the sale is " + totalSale);
        }
    }
           