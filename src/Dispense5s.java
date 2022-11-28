/**
 * @author George McMullen x Jada Senebouttarath
 * @version 1.0
 * Dispense5s.java
 */

public class Dispense5s extends Dispenser {

    public Dispense5s() {
        super();
    }

    // Method for dispensing $5 bills
    @Override
    public void dispense(Money currency) {
        // Data validation in case input is null
        if (currency != null) {
            // Getting amount remaining
            int amountRemaining = currency.getAmount();
            // Validating amount remaining has at least $5 inside
            if (amountRemaining >= 5) {
                int count = amountRemaining / 5;
                amountRemaining = amountRemaining % 5;
                System.out.println("Dispensing '" + count + "' $5 bills.");
            }
            // If any money is still remaining, pass to next dispenser
            if (amountRemaining > 0 && this.nextDispenser != null) {
                this.nextDispenser.dispense(new Money(amountRemaining));
            }
        }
    }
}