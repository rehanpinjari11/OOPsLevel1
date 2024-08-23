package OOPs_Level_1;

import java.util.Scanner;

public class BankAccount {

    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposited " + amount + " Successful. New Balance: " + balance);
        }
        else
        {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + "Successful. New Balance: " + balance);
        }
        else
        {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double getBalance()
    {
        return balance;
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Bank Account Number:");
        String accountNumber = sc.nextLine();

        System.out.println("Enter the Account Balance:");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(accountNumber, balance);


        while (true)
        {
            System.out.println("Enter the 1 to Deposit or Enter 2 to Withdraw or Enter 3 to Exit: ");
            int option = sc.nextInt();

            if (option == 1)
            {
                System.out.println("Enter the money to Deposit:");
                double amount = sc.nextDouble();

                acc.deposit(amount);

            }
            else if (option == 2)
            {
                System.out.println("Enter the Money to Withdraw");
                double amount = sc.nextDouble();

                acc.withdraw(amount);
            }
            else if (option == 3)
            {
                System.out.println("Thank You!");
                break;
            }
            else
            {
                System.out.println("Invalid Input! Enter Valid Input");

            }
        }

    }
}
