import java.util.Scanner;

class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    public SavingsAccount(double initialBalance, double withdrawalLimit) {
        super(initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance && amount <= withdrawalLimit) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Invalid withdrawal");
        }
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalFee;

    public CheckingAccount(double initialBalance, double withdrawalFee) {
        super(initialBalance);
        this.withdrawalFee = withdrawalFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= (amount + withdrawalFee);
            System.out.println("Withdrawn $" + amount + " with a fee of $" + withdrawalFee);
        } else {
            System.out.println("Invalid withdrawal");
        }
    }
}

public class BankAccountProInherit8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance for Savings Account: ");
        double initialSavingsBalance = scanner.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(initialSavingsBalance, 500.0);

        System.out.print("Enter initial balance for Checking Account: ");
        double initialCheckingBalance = scanner.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount(initialCheckingBalance, 2.0);

        System.out.print("Enter deposit amount for Savings Account: ");
        double depositAmount = scanner.nextDouble();
        savingsAccount.deposit(depositAmount);

        System.out.print("Enter withdrawal amount for Savings Account: ");
        double withdrawalAmount = scanner.nextDouble();
        savingsAccount.withdraw(withdrawalAmount);

        System.out.print("Enter deposit amount for Checking Account: ");
        depositAmount = scanner.nextDouble();
        checkingAccount.deposit(depositAmount);

        System.out.print("Enter withdrawal amount for Checking Account: ");
        withdrawalAmount = scanner.nextDouble();
        checkingAccount.withdraw(withdrawalAmount);

        scanner.close();
    }
}
