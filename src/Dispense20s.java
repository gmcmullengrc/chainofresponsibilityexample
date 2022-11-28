/**
 * @author George McMullen x Jada Senebouttarath
 * @version 1.0
 * Dispense20s.java
 */

public class Dispense20s extends Dispenser {

    public Dispense20s() {
        super();
    }

    // Method for dispensing $20 bills
    @Override
    public void dispense(Money currency) {
        // Data validation in case input is null
        if (currency != null) {
            // Getting amount remaining
            int amountRemaining = currency.getAmount();
            // Validating amount remaining has at least $20 inside
            if (amountRemaining >= 20) {
                int count = amountRemaining / 20;
                amountRemaining = amountRemaining % 20;
                System.out.println("Dispensing '" + count + "' $20 bills.");
            }
            // If any money is still remaining, pass to next dispenser
            if (amountRemaining > 0 && this.nextDispenser != null) {
                this.nextDispenser.dispense(new Money(amountRemaining));
            }
        }
    }
}