/**
 * @author George McMullen x Jada Senebouttarath
 * @version 1.0
 * Dispense1s.java
 */

public class Dispense1s extends Dispenser {

    public Dispense1s() {
        super();
    }

    // Method for dispensing $1 bills
    @Override
    public void dispense(Money currency) {
        // Data validation in case input is null
        if (currency != null) {
            // Getting amount remaining
            int amountRemaining = currency.getAmount();
            // Validating amount remaining has at least $1 inside
            int count = amountRemaining / 1;
            // Not required, but updates amountRemaining to 0
            amountRemaining = amountRemaining % 1;
            System.out.println("Dispensing '" + count + "' $1 bills.");

        }
    }
}