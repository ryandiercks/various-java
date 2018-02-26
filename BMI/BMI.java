import javax.swing.JOptionPane;     // Needed for JOptionPane class
/**
 * Write a description of class BMI here.
 * 
 * @author (Ryan Diercks) 
 * @version (021015)
 */
public class BMI
{
    public static void main(String[] args)
    {
        double weight;
        double height;
        double BMI;
        String input;
        
        // Get the users weight
        input = JOptionPane.showInputDialog("Enter your " + "weight in pounds.");
        weight = Double.parseDouble(input);
        
        // Get the height in inches
        input = JOptionPane.showInputDialog("Enter your " + "height in inches.");
        height = Double.parseDouble(input);
        
        BMI = (weight * 703) / (height * height);
  
     if (BMI < 18.4)
       System.out.println("You are underweight");
     else if (BMI < 18.5)
       System.out.println("You are underweight");
     else if (BMI < 25)
       System.out.println("You are normal weight");
     else if (BMI < 25.1)
       System.out.println("You are overweight");
  }
}
        