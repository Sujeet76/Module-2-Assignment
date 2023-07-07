import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

public class Q1_BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the account holder's name: ");
        String accountHolderName = scanner.nextLine();

        BankAccount bankAccount = new BankAccount(accountHolderName);

        System.out.println("Account created successfully.");
        System.out.println("Account Holder Name: " + bankAccount.getAccountHolderName());
        System.out.println("Initial Balance: $" + bankAccount.getBalance());

        System.out.print("Enter the amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        bankAccount.deposit(depositAmount);

        System.out.print("Enter the amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        bankAccount.withdraw(withdrawAmount);

        System.out.println("Updated Balance: $" + bankAccount.getBalance());

        scanner.close();
    }
}
