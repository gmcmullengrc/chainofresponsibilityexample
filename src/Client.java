/**
 * @author George McMullen x Jada Senebouttarath
 * @version 1.0
 * Client.java
 */

import java.util.*;

public class Client {

    // TO-DO:
    // ------
    // Write a main method for:
    //     Getting the user's input
    //     Validating it's an INT
    //     Sending it to our handler


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