public class BankAccount implements AccountOperations {
    protected double balance;
    private User user;

    public BankAccount(double initialBalance, User user) {
        this.balance = initialBalance;
        this.user = user;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public User getUser() {
        return user;
    }
}
