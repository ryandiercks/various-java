
/**
 * Write a description of class Discount here.
 * 
 * @author (Ryan Diercks) 
 * @version (01282015)
 */
public class Discount
{
    public static void main(String[] args)
    {
        //Declare a variable called regularPrice that will be initialized to a value of 59.0
        double regularPrice = 59.0;        
        //Declare a double variable aclled discount and salePrice on 1 line
        double salePrice, discount;
        //Calculate the amount of a 20% discount
        discount = regularPrice * 0.2;
        //Calculate the sale price
        salePrice = regularPrice - discount;
        //Display the results
        System.out.println("Regular price: $" + regularPrice);
        System.out.println("Discount amount $" + discount);
        System.out.println("Sale price: $" + salePrice);
    }        
        
}
