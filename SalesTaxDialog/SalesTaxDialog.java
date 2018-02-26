import javax.swing.JOptionPane; // Needed for the dialog class
/**
 * Write a description of class SalesTaxDialog here.
 * 
 * @author (Ryan Diercks) 
 * @version (02032015)
 */
public class SalesTaxDialog
{
   public static void main(String[] args)
       {
           String inputString;                // For reading input
           String name;                       // To hold a name
           double purchase;                   // Purchase price
           double stateSalesTax;              // State sales tax
           double countySalesTax;             // Hourly pay rate
           double totalTax;                   // Total Tax
           double totalSale;                  // Total Sale

           
           // Get the user's name.
           name = JOptionPane.showInputDialog("What is " + "your name? ");
           
            // Get the purchase price.
           inputString = JOptionPane.showInputDialog("What was the " + " amount of your purchase? ");
           
           purchase = Double.parseDouble(inputString);
           
           // Get the state sales tax
           inputString = JOptionPane.showInputDialog("What is the" + " state sales tax? ");
           
           stateSalesTax = Double.parseDouble(inputString);
           
           // Get the county sales tax
           inputString = JOptionPane.showInputDialog("What is the" + " county sales tax? ");
           
           countySalesTax = Double.parseDouble(inputString);
           
           // Calculate the total tax.
           totalTax = stateSalesTax + countySalesTax;
           
           // Calculate the total of the sale.
           totalSale = ((stateSalesTax + countySalesTax) + 1) * purchase;
           
           // Display the resulting information.
           JOptionPane.showMessageDialog(null, "Hello " + name + ". Your total tax rate is "
           + totalTax + ". The total of your sale with tax is " + totalSale + ".");
        }
    }
           