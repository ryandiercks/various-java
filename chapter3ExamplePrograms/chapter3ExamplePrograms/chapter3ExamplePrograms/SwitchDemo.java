import java.util.Scanner;       // Needed for Scanner class
/**
 * Write a description of class SwitchDemo here.
 * 
 * @author (Ryan Diercks) 
 * @version (02092015)
 */
public class SwitchDemo
{
    public static void main(String[] args)
    {
        int number;     // A number entered by the user
        
        // Create a scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        // Get one of the numbers 1, 2, or 3 from the user
        System.out.print("Enter 1, 2, or 3: ");
        number = keyboard.nextInt();
        
        // Determine the number entered.
        switch (number)
        {
            case 1:
            System.out.println("You entered 1.");
            break;
            case 2:
            System.out.println("You entered 2.");
            break;
            case 3:
            System.out.println("You entered 3.");
            break;
            default:
            System.out.println("That's Not 1, 2, or 3!");
        }
    }
}