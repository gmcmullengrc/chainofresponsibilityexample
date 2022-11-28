/**
 * @author George McMullen x Jada Senebouttarath
 * @version 1.0
 * Test.java
 */

// INFORMAL TEST ENVIRONMENT
public class Test {

    public static void main(String[] args) {
        System.out.println();

        // Test scenarios
        System.out.println("Test amount: $1");
        ATM.withdraw(new Money(1));
        System.out.println("Test amount: $0");
        ATM.withdraw(new Money(0));
        System.out.println("Test amount: $9999999999");
        ATM.withdraw(new Money(999999999));
        System.out.println("Test amount: $541");
        ATM.withdraw(new Money(541));
        System.out.println("Test amount: $20");
        ATM.withdraw(new Money(20));
    }
}