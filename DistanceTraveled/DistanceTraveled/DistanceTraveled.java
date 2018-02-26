/*From the Book
 *Program 2, page 242
 *
 *The Distance a vehicle travels can be calculated as follows:
 *
 *Distance = Speed * Time
 *
 *Ryan Diercks
 * 02262015
 */
import java.io.*; 
import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

 
public class DistanceTraveled
 	{
 		public static void main(String[] args) throws IOException
 		{
 			int timeElapsed, hour;
 			double speed, distanceTraveled;
 			Scanner input = new Scanner(System.in);
 			String filename;
 			
 			//Ask for the speed of the Vehicle
 			System.out.println("What is the vehicles speed?");
 			speed = input.nextDouble();
 			
 			while(speed < 0)
 			{
 				System.out.println("Invalid entry, integer must be greater than 0");
 				speed = input.nextDouble();
 			}
 				
 			//Ask for the number of hours
 			System.out.println("How many hours?");
 			timeElapsed = input.nextInt();
 			
 			while(timeElapsed < 1)
 			{
 				System.out.println("Invalid entry, integer must be greater than 0");
 				timeElapsed = input.nextInt();
 			}
 			System.out.print("Enter the file name: ");
 			filename = input.nextLine();
 			
 			File file = new File(filename);
 			if (file.exists())
 			{
 			    System.out.println("The file " + filename + " already exists.");
 			    timeElapsed = input.nextInt();
 			    System.exit(0);
 			}
 			
 			PrintWriter outputFile = new PrintWriter(file);
 			
 			//Provide a table showing totalDistanceTraveled
 			
 			outputFile.println("Hour         Distance Traveled (miles)");
 			outputFile.println("------------------------------------");
 			
 			hour = 0;
 			
 			for(int x = 1; x <= timeElapsed; x++)
 			{
 				hour++;
 				if(hour > 1)
 				{
 					distanceTraveled = hour * speed;
 					outputFile.println(hour + "              " + distanceTraveled);
 				}
 				else
 				{
 					outputFile.println(hour + "              " + speed);
 				}
 				outputFile.close();
 				System.out.println("Data written to the file.");
 			}		
 		}
 
 }