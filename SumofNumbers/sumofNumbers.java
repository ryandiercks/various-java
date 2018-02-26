import java.util.Scanner;
/**
 * Write a description of class sumofNumbers here.
 * 
 * @author Ryan Diercks 
 * @version (a version number or a date)
 */
public class sumofNumbers
{
    public static void main(String[] args)
    {
        System.out.println("Enter a positive number");
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        // you have to declare a sum before using it
        int sum = 0;
        for(int i = 0;i <= n; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum is " +sum);
    }
}