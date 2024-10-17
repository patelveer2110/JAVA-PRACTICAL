public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, User user, double interestRate) {
        super(initialBalance, user);
        this.interestRate = interestRate;
    }

    // Method overriding to apply interest
    @Override
    public double getBalance() {
        return balance + (balance * interestRate);
    }
}
