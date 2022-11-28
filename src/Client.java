/**
 * @author George McMullen x Jada Senebouttarath
 * @version 1.0
 * Client.java
 */

import java.util.*;

public class Client {

    public static void main(String[] args) {
        // Using try to catch errors if user doesn't input INT
        try {
            // Creating scanner
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an amount to withdraw ($1000 max)");
            // Saving user input as INT
            int amount = scanner.nextInt();
            // Validating INT is valid
            if (isValidAmount(amount)) {
                // Actually call withdraw
                ATM.withdraw(new Money(amount));
            }
        } catch(Exception e) {
            // Error in case user input isn't an INT
            System.out.println("Please enter a number");
        }
    }

    // Method for validation
    private static boolean isValidAmount(int amountEntered) {
        // Throw error if input is 0 or under
        if (amountEntered <= 0) {
            System.out.println("Please enter a valid amount");
            return false;
        }
        // Throw error if input is over 1000 (artificial limit)
        else if (amountEntered > 1000) {
            System.out.println("Entered amount is too great, please see a teller");
            return false;
        }
        return true;
    }

}