import java.util.ArrayList;
import java.util.Scanner;

class ATM {
    private double balance;
    private ArrayList<String> transactionHistory;

    public ATM() {
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: $" + amount);
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: $" + amount);
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    public void transfer(double amount, ATM targetAccount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            targetAccount.deposit(amount);
            transactionHistory.add("Transferred: $" + amount + " to account " + targetAccount.hashCode());
            System.out.println("Transferred: $" + amount + " to account " + targetAccount.hashCode());
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public void showTransactionHistory() {
        System.out.println("Transaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM myAccount = new ATM();
        ATM targetAccount = new ATM();  // For transfer demonstration

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Transaction History");
            System.out.println("6. Quit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    myAccount.showBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    myAccount.transfer(transferAmount, targetAccount);
                    break;
                case 5:
                    myAccount.showTransactionHistory();
                    break;
                case 6:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
