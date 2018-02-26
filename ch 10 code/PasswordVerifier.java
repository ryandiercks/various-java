import java.util.Scanner;

public class PasswordVerifier {
    public static void main(String[] args) {
        System.out.println("Password Verifier");
        System.out.println("Enter a password that meets the following rules: ");
        System.out.println("-Must be at least 8 characters long" + '\n' +
                "-Must contain at least 1 lower case character" + '\n' +
                "-Must contain at least 1 upper case character" + '\n' +
                "-Must contain at least 1 numeric digit" + '\n' +
                "-Must contain at least 1 special character from the set: !@#$%^&*" + '\n' +
                "-Must not contain the word 'and' or the word 'end'");

        String password;
        String contains1 = "and";
        String contains2 = "end";
        String special = "!@#$%^&*";

        Scanner stdIn = new Scanner(System.in);
        boolean digit = false;        //Has at least 1 digit
        boolean upper = true;        //Has at least 1 upper case letter
        boolean lower = true;        //Has at least 1 lower case letter
        boolean hasspecial = true;    //Has at least 1 special character
        boolean length = true;        //Has at least 8 digits
        boolean endand = true;        //Does not contain end or and
        boolean valid = false;        //Is the password valid?


        System.out.println("Enter password: ");
        password = stdIn.nextLine();


        int result;
        result = password.indexOf(contains1);
        if (result == -1) {
            System.out.println("");
        } else {
            System.out.println("Must not contain the word 'and'");
        }

        int result2;
        result2 = password.indexOf(contains2);
        if (result2 == -1) {
            System.out.println("");
        } else {
            System.out.println("Must not contain the word 'end'");
        }

        if (password.length() < 8) {
            System.out.println("Must be at least 8 characters long.");
        } else {
            System.out.print("");
        }
        for (int i = 0; i < password.length(); i++) {
            if (!(Character.isUpperCase(password.charAt(i)))) ;
            {
                upper = false;
                valid = false;
                i++;
            }
            if (!(Character.isLowerCase(password.charAt(i)))) ;
            {
                lower = false;
                valid = false;
                i++;
            }
            if (!(Character.isDigit(password.charAt(i)))) ;
            {
                digit = false;
                valid = false;
                i++;
            }
            if (!(password.matches(special))) ;
            {
                hasspecial = false;
                valid = false;
            }

            if (upper != true) {
                System.out.println("Must contain an upper case letter.");
            }
            if (lower != true) {
                System.out.println("Must contain a lower case letter.");
            }
            if (digit != true) {
                System.out.println("Must contain a numeric digit.");
            }
            if (hasspecial != true) {
                System.out.println("Must contain a special character.");
            }
            if (valid) {
                System.out.println("Valid.");
            } else if (valid != true) {
                System.out.println("Invalid.");
            }
        }
    }

}