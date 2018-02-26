import java.util.Scanner;  // scanner class
 
public class bankCharges
{
    public static void main(String[] args)
    {
        double checks =0,
           totalckfee =0,
           ckfee = 10,
           ckfee1 =.1,
           ckfee2 = .08,
           ckfee3 = .06,
           ckfee4 = .04,
           checkFee = 1;
           String input;
           Scanner keyboard = new Scanner(System.in);
 
    int number; 
    System.out.println("Please enter the number of checks you wrote last month");
    input = keyboard.nextLine();
 
    if (checks < 0)  // negative is false
    {
    System.out.print("You cannot write a negative number of checks!");
    }
 
    if(checks >= 60)
        checkFee =(ckfee4);
    else if(checks >= 40)
        checkFee = (ckfee3);
    else if(checks >=20)
        checkFee = (ckfee2);
    else if(checks <20)
        checkFee = (ckfee1);
 
                     //adds all fees
    totalckfee = (ckfee + checkFee * checks);
 
                     //if closing true(because user didn't enter negative number, show total fees
    System.out.print("Your total monthly Bank Fees are $" + totalckfee);
}
}