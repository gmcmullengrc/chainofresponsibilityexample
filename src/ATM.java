/**
 * @author George McMullen x Jada Senebouttarath
 * @version 1.0
 * ATM.java
 */

public class ATM {

    // Defining dispenser for 20s
    protected static Dispenser twentyDispenser = new Dispense20s();
    // Defining dispenser for 10s
    protected static Dispenser tenDispenser = new Dispense10s();
    // Defining dispenser for 5s
    protected static Dispenser fiveDispenser = new Dispense5s();
    // Defining dispenser for 1s
    protected static Dispenser oneDispenser = new Dispense1s();
    // Defining dispenser chain to link individual dispensers together
    // This is the code that specifically shows off "Chain of Responsibility"
    protected static Dispenser dispenserChain;
    static {
        // Set order for handlers to process request
        twentyDispenser.setNextDispenser(tenDispenser);
        tenDispenser.setNextDispenser(fiveDispenser);
        fiveDispenser.setNextDispenser(oneDispenser);
        dispenserChain = twentyDispenser;
    }

    // Method that initiates the calling of the chain of responsibility
    public static void withdraw(Money amount) {
        // Validation it's not a null
        if (amount != null) {

            // Starts the chain
            dispenserChain.dispense(amount);
            // Whitespace for formatting
            System.out.println();
        }
    }

}