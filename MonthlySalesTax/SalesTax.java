import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/** Sales tax class
 * Chapter 7
 * Programming challenge 2, monthly sales tax
 */

public class SalesTax extends JFrame
{
    private JPanel panel;       // A panel to hold everything
    private JTextField totalSales;  // To get total sales
    private JButton calcButton;     // Calculates everything
    
    // Constants for tax rates
    private final double COUNTY_RATE = 0.02;
    private final double STATE_RATE = 0.04;
    
    //Constants for window size
    private final int WINDOW_WIDTH = 360;
    private final int WINDOW_HEIGHT = 100;
    
    public SalesTax()
    {
        //Set the title.
        setTitle("Monthly Sales Tax Reporter");
        
        // Specify what happens on close button click
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Build the panel that contains the other components
        buildPanel();
       
        //Add the panel to the content pane.
        add(panel);
        
        //Size and display the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setVisible(true);
    }
    /** The buildPanel method creates a panel containing other components
     * 
     * 
     */
    private void buildPanel()
    {
        // create a label prompting for the total sales
        JLabel totalSalesMsg = new JLabel("Enter the total Sales:");
        
        //Create a text field for total sales
        totalSales = new JTextField(10);
        
        //Create a button to click
        calcButton = new JButton("Calculate Sales Tax");
        
        // Add an action listener to the button
        calcButton.addActionListener(new CalcButtonListener());
        
        //Create a panel.
        panel = new JPanel();
        
        // Add the label, text field, and button to the panel.
        panel.add(totalSalesMsg);
        panel.add(totalSales);
        panel.add(calcButton);
    }
    
    private class CalcButtonListener implements ActionListener
    {
        
        public void actionPerformed(ActionEvent e)
        {
            double totalSalesAmount,    // to hold the total sales amount
                    countyTaxAmount,
                    stateTaxAmount,
                    totalTaxAmount;
                    
            //Create a decimal format object to format output.
            DecimalFormat dollar = new DecimalFormat("#,##0.00");
            
            //Get the total sales
            totalSalesAmount = Double.parseDouble(totalSales.getText());
            
            //Calculate the county tax
            countyTaxAmount = totalSalesAmount * COUNTY_RATE;
            
            //calculate the state tax.
            stateTaxAmount = totalSalesAmount * STATE_RATE;
            
            //calculate the total sales
            totalTaxAmount = countyTaxAmount + stateTaxAmount;
            
            //Display the results
            JOptionPane.showMessageDialog(null, "CountySalesTax: $" + dollar.format(countyTaxAmount) 
            + "\nState Sales Tax: $" + dollar.format(stateTaxAmount) + "\nTotal Sales Tax: $" + 
            dollar.format(totalTaxAmount));
        }
    }
    /**The main method creates an instance of the 
     * salesTaxClass, causing it to display its window.
     * 
     */
    
    public static void main(String[] args)
    {
        SalesTax stw = new SalesTax();
    }
}