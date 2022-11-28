/**
 * @author George McMullen x Jada Senebouttarath
 * @version 1.0
 * Dispenser.java
 */

public abstract class Dispenser {

    // nextDispenser - Used for referencing who the next sequential dispenser is
    protected Dispenser nextDispenser;

    // setNextDispenser - Used for setting who the next sequential dispenser is
    public void setNextDispenser(Dispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    // dispense - Used for dispensing from a specific bill type dispenser
    public abstract void dispense(Money currency);

}
