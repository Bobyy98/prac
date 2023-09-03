import java.util.Scanner;

class BankAccount
{
    private double balance;

    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance = balance + amount;
            System.out.println("Deposited: $" + amount);
        }
        else
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount)
    {
        if (amount > 0 && balance >= amount)
        {
            balance = balance - amount;
            System.out.println("Withdrawn: $" + amount);
        }
        else
        {
            System.out.println("Insufficient funds or invalid withdrawl amount.");  
        }
    }

    public double getBalance()
    {
        return balance;
    }
}

class SavingsAccount extends BankAccount
{
    public SavingsAccount(double initialBalance)
    {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount)
    {
        if (getBalance() >= 100 && amount > 0 && getBalance() - amount >= 100)
        {
            super.withdraw(amount);
        }
        else
        {
            System.out.println("Withdrawl not allowed due to insufficient funds or minimum balance requirements.");
        }
    }

}

public class BankAccountInherit1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance for Savings Account: $");
        double initialBalance = sc.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(initialBalance);

        while (true)
        {
            System.out.println("\nOptions:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Select an option (1/2/3/4): ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = sc.nextDouble();
                    savingsAccount.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawl amount: $");
                    double withdrawlAmount = sc.nextDouble();
                    savingsAccount.withdraw(withdrawlAmount);
                    break;

                case 3:
                    System.out.println("Remaining balance: $" + savingsAccount.getBalance());
                    break;
                
                case 4:
                    System.out.println("Exiting the program.");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
