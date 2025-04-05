package Bank;

import Bank.Exceptions.InsufficientFundsException;

public class BankAccount {

    private double balance;

    public BankAccount(double amount) {
        this.balance = amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount);
        }
        balance -= amount;
        System.out.println("Withdraw successful");
    }
}
