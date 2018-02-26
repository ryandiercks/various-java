import java.util.Scanner;
/**
 * Write a description of class LargestandSmallest here.
 * 
 * @author (Ryan Diercks) 
 * @version 022615
 */
public class LargestAndSmallest {

	public static void main(String[] args) {
		
		// Store user input
		int value; 		
	
		// Smallest value
		int smallest;
		
		// Larget value
		int largest = 0; 								
		
		// Create Scanner object
		Scanner input = new Scanner(System.in);			
		
		// Display program instructions
		System.out.println("Instructions: The computer will prompt you for a");
		System.out.println("number value each time until you enter the number" + "\'\n-99'");
		
		// Prompt user for input
		System.out.print("Enter a number: ");			
		value = input.nextInt();
		
		// Assign first value as smallest
		smallest = value;
		
		// Construct while loop to prompt user for input using a sentinel condition.
		while(value != -99){							
			System.out.print("Enter a number: ");			
			value = input.nextInt();
			if(value != -99){
				if (value > smallest){
					largest = value;
				}
				else{
					smallest =value;					
				}		
			}
		}
		
		// Display largest and smallest value
		System.out.println("Smallest Value: " + smallest + "\nLargest Value: " + largest);
	}
}