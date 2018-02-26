import java.util.Scanner; // Needed for the Scanner class
/**
 * Write a description of class SecretWord here.
 * 
 * @author (Ryan Diercks) 
 * @version (02092015)
 */
public class SecretWord
{
    public static void main(String[] args)
    {
        String input;       // To hold the user's input
        
        // Create a scanner object for input keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // Prompt the user to enter the secret word.
        System.out.print("Enter the secret word: ");
        input = keyboard.nextLine();
        
        // Determine whether the user entered the secret word.
        System.out.print("Enter the secret word: ");
        input = keyboard.nextLine();
        
        // Determine whether the user entered the secret word.
        if (input.equalsIgnoreCase("PROSPERO"))
        {
            System.out.println("Congratulations! You know the " + "Secret word!");
        }
        else
        {
            System.out.println("Sorry, that is NOT the " + "secret word!");
        }
    }
}