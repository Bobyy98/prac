import java.util.Scanner;

public class BankAccount25
{
    private String accountNumber;
    private double balance;
    
    // Constructor
    public BankAccount25(String accountNumber, double initialBalance)
    {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    //Method to deposit funds into the account
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance = balance + amount;
            System.out.println("Deposited: $" + amount);
        }
        else
        {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to withdraw funds from the account
    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrawn: $" + amount);
        }
        else
        {
            System.out.println("Invalid amount for withdrawl.");
        }
    }

    //Method to check the current balance
    public double checkBalance()
    {
        return balance;
    }

    // Main method for testing
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accnum = sc.nextLine();

        System.out.print("Enter account balance: ");
        double accbal = sc.nextDouble();

        BankAccount25 account = new BankAccount25(accnum, accbal);

        System.out.println("Initial Balance: $" + account.checkBalance());

        System.out.print("Enter amount to be deposited: ");
        double depo = sc.nextDouble();

        account.deposit(depo);
        System.out.println("New Balance: $" + account.checkBalance());

        System.out.print("Enter amount to be withdrawn: ");
        double with = sc.nextDouble();

        account.withdraw(with);
        System.out.println("Final Balance: $" + account.checkBalance());

        sc.close();
    }
}
