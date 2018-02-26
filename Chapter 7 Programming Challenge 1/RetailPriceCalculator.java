import java.util.Scanner;
public class RetailPriceCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double wholeSaleCost;        
        double markUpPercentage;
        double retailPrice;
        
        System.out.println("Enter the wholesale cost");
        wholeSaleCost = input.nextDouble();
        
        System.out.println("Enter the markup percentage");
        markUpPercentage = input.nextDouble();
        
        retailPrice = calculateRetail(wholeSaleCost, markUpPercentage);
        
        System.out.println("The retail price is: " + retailPrice);
    }
    public static double calculateRetail(double wholesale, double markUp)
    {
        double markUpConverted = markUp/100;
        double markUpAmount = wholesale * markUpConverted;
        double retail = wholesale + markUpAmount;
        
        return retail;
    }
}