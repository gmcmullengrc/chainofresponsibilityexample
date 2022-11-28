/**
 * @author George McMullen x Jada Senebouttarath
 * @version 1.0
 * Money.java
 */

public class Money {

    // Variable holding current amount of money (changes when money is dispensed)
    // Protected so that any class can access it
    protected int amount;

    public Money(int amount) {
        super();
        this.amount = amount;
    }

    // Getter for Money amount
    public int getAmount() {
        return amount;
    }

    // Setter for Money amount
    public void setAmount(int amount) {
        this.amount = amount;
    }

}
