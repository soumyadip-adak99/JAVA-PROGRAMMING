
package Bank.Exceptions;

public class InsufficientFundsException extends Exception {

    private final double amount;

    @Override
    public String toString() {
        return " you don't have money";
    }

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
