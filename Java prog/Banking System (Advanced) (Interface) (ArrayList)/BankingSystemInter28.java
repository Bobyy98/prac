import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Account interface
interface Account28 {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double getBalance();
}

// SavingsAccount class implementing Account interface
class SavingsAccount28 implements Account28 {
    private double balance;
    private double interestRate;

    public SavingsAccount28(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    // Unique method for SavingsAccount
    public void addInterest() {
        double interest = calculateInterest();
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

// CurrentAccount class implementing Account interface
class CurrentAccount28 implements Account28 {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount28(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public double calculateInterest() {
        // Current accounts do not earn interest
        return 0;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    // Unique method for CurrentAccount
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}

// Bank class
class Bank {
    public List<Account28> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account28 account) {
        accounts.add(account);
    }

    public void displayAccounts() {
        System.out.println("List of accounts:");
        for (Account28 account : accounts) {
            System.out.println("Balance: " + account.getBalance());
        }
    }
}

public class BankingSystemInter28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a bank
        Bank bank = new Bank();

        while (true) {
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Add Interest (Savings Account)");
            System.out.println("6. Display Accounts");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter initial balance for Savings Account: ");
                    double initialBalanceSavings = scanner.nextDouble();
                    System.out.print("Enter interest rate for Savings Account: ");
                    double interestRate = scanner.nextDouble();
                    bank.addAccount(new SavingsAccount28(initialBalanceSavings, interestRate));
                    break;
                case 2:
                    System.out.print("Enter initial balance for Current Account: ");
                    double initialBalanceCurrent = scanner.nextDouble();
                    System.out.print("Enter overdraft limit for Current Account: ");
                    double overdraftLimit = scanner.nextDouble();
                    bank.addAccount(new CurrentAccount28(initialBalanceCurrent, overdraftLimit));
                    break;
                case 3:
                    System.out.print("Enter account index: ");
                    int accountIndex1 = scanner.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.accounts.get(accountIndex1).deposit(depositAmount);
                    break;
                case 4:
                    System.out.print("Enter account index: ");
                    int accountIndex2 = scanner.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    bank.accounts.get(accountIndex2).withdraw(withdrawalAmount);
                    break;
                case 5:
                    System.out.print("Enter account index for adding interest (Savings Account): ");
                    int accountIndex3 = scanner.nextInt();
                    if (bank.accounts.get(accountIndex3) instanceof SavingsAccount28) {
                        ((SavingsAccount28) bank.accounts.get(accountIndex3)).addInterest();
                    } else {
                        System.out.println("This account is not a Savings Account.");
                    }
                    break;
                case 6:
                    bank.displayAccounts();
                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
