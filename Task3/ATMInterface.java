import java.util.Scanner;

// Represents the user's bank account
class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            return false;
        }

        if (amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }

        balance += amount;
        return true;
    }
}

// Represents the ATM machine
public class ATMInterface {

    private BankAccount account;
    private Scanner scanner;

    public ATMInterface(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void checkBalance() {
        System.out.printf(
            "Current Balance: ₹%.2f%n",
            account.getBalance()
        );
    }

    public void withdraw() {

        System.out.print("Enter amount to withdraw: ₹");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive amount.");
            return;
        }

        if (amount > account.getBalance()) {
            System.out.println("Insufficient balance.");
            return;
        }

        account.withdraw(amount);

        System.out.printf(
            "Withdrawal successful! ₹%.2f withdrawn.%n",
            amount
        );

        System.out.printf(
            "Remaining Balance: ₹%.2f%n",
            account.getBalance()
        );
    }

    public void deposit() {

        System.out.print("Enter amount to deposit: ₹");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive amount.");
            return;
        }

        account.deposit(amount);

        System.out.printf(
            "Deposit successful! ₹%.2f deposited.%n",
            amount
        );

        System.out.printf(
            "Updated Balance: ₹%.2f%n",
            account.getBalance()
        );
    }

    public void start() {

        int choice;

        System.out.println("========================================");
        System.out.println("          WELCOME TO ATM");
        System.out.println("========================================");

        do {

            System.out.println("\n----------- ATM MENU -----------");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.println("--------------------------------");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    withdraw();
                    break;

                case 3:
                    deposit();
                    break;

                case 4:
                    System.out.println(
                        "Thank you for using the ATM. Goodbye!"
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice! Please select 1-4."
                    );
            }

        } while (choice != 4);

        scanner.close();
    }

    public static void main(String[] args) {

        // Starting account balance
        BankAccount account = new BankAccount(10000.00);

        ATMInterface atm = new ATMInterface(account);

        atm.start();
    }
}