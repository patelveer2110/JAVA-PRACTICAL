import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create multiple users and their bank accounts
        User user1 = new User("user1", "password123");
        User user2 = new User("user2", "password456");
        User user3 = new User("user3", "password789");

        // Create a list of bank accounts with different types
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount(1000, user1)); // Regular Account for user1
        accounts.add(new SavingsAccount(2000, user2, 0.05)); // Savings Account for user2 with 5% interest
        accounts.add(new BankAccount(3000, user3)); // Regular Account for user3

        // Login functionality for multiple users
        BankAccount loggedInAccount = login(scanner, accounts);
        if (loggedInAccount == null) {
            System.out.println("Login failed. Exiting...");
            return;
        }

        // Main ATM operations
        while (true) {
            System.out.println("\nWelcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + loggedInAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    loggedInAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    loggedInAccount.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static BankAccount login(Scanner scanner, List<BankAccount> accounts) {
        System.out.print("Enter username: ");
        String inputUsername = scanner.next();

        System.out.print("Enter password: ");
        String inputPassword = scanner.next();

        for (BankAccount account : accounts) {
            User user = account.getUser();
            if (user.getUsername().equals(inputUsername) && user.authenticate(inputPassword)) {
                System.out.println("Login successful!");
                return account;
            }
        }
        System.out.println("Incorrect username or password.");
        return null;
    }
}
