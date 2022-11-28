/**
 * @author George McMullen x Jada Senebouttarath
 * @version 1.0
 * Dispense10s.java
 */

public class Dispense10s extends Dispenser {

    public Dispense10s() {
        super();
    }

    // Method for dispensing $10 bills
    @Override
    public void dispense(Money currency) {
        // Data validation in case input is null
        if (currency != null) {
            // Getting amount remaining
            int amountRemaining = currency.getAmount();
            // Validating amount remaining has at least $10 inside
            if (amountRemaining >= 10) {
                int count = amountRemaining / 10;
                amountRemaining = amountRemaining % 10;
                System.out.println("Dispensing '" + count + "' $10 bills.");
            }
            // If any money is still remaining, pass to next dispenser
            if (amountRemaining > 0 && this.nextDispenser != null) {
                this.nextDispenser.dispense(new Money(amountRemaining));
            }
        }
    }
}