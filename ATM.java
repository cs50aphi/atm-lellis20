// ATM
import java.util.Scanner;

public class ATM
{

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        boolean session = true;
        int numTransactions = 0;
        String choice;
        SavingsAccount saveAcc = new SavingsAccount(100);
        CheckingAccount checkAcc = new CheckingAccount(10);
        System.out.println("Welcome to myATM! How may I assist you?");
        // System.out.println(saveAcc.getBalance() + " " + checkAcc.getBalance());
        /*
        static void printBalances()
        {
            System.out.println("Your checking account has " + checkAcc.getBalance() + " credits.");
            System.out.println("Your savings account has " + saveAcc.getBalance() + " credits.\n");
        }*/
        while (session)
        {
            System.out.println("Do you want to: (D)eposit, (W)ithdraw, (C)heck Balance, (T)ransfer, (Q)uit? ");
            choice = kb.next();
            numTransactions++;
            switch(choice)
            {
                case "D":
                case "d":
                    // Deposit
                    System.out.print("Deposit to: (1)Checking or (2)Savings? ");
                    int userSpecify = kb.nextInt();
                    System.out.print("How many credits do you want to deposit? ");
                    if (userSpecify == 1)
                    {
                        checkAcc.depositChecking(kb.nextDouble());
                    }
                    else if (userSpecify == 2)
                    {
                        saveAcc.depositSaving(kb.nextDouble());
                    }
                    System.out.println("Your checking account has " + checkAcc.getBalance() + " credits.");
                    System.out.println("Your savings account has " + saveAcc.getBalance() + " credits.\n");
                    break;
                case "W":
                case "w":
                    // Withdraw
                    System.out.println("Withdraw from: (1)Checking or (2)Savings?");
                    userSpecify = kb.nextInt();
                    System.out.print("How many credits do you want to withdraw? ");
                    if (userSpecify == 1)
                    {
                        // Make sure they have enough money
                        if (checkAcc.withdrawChecking(kb.nextDouble()) == -1)
                        {
                            System.out.println("Insufficient funds!");
                        }
                    }
                    else if (userSpecify == 2)
                    {
                        if (saveAcc.withdrawSaving(kb.nextDouble()) == -1)
                        {
                            System.out.println("Insufficient funds!");
                        }
                    }
                    System.out.println("Your checking account has " + checkAcc.getBalance() + " credits.");
                    System.out.println("Your savings account has " + saveAcc.getBalance() + " credits.\n");
                    break;
                case "C":
                case "c":
                    // Check Balance
                    System.out.println("Your checking account has " + checkAcc.getBalance() + " credits.");
                    System.out.println("Your savings account has " + saveAcc.getBalance() + " credits.\n");
                    break;
                case "T":
                case "t":
                    // Transfer Money
                    System.out.println("Transfer from: (1)Checking to Savings or (2)Savings to Checking?");
                    userSpecify = kb.nextInt();
                    System.out.println("Amount to transfer?");
                    double transAmt = kb.nextDouble();
                    if (userSpecify == 1)
                    {
                        if (checkAcc.withdrawChecking(transAmt) == -1)
                        {
                            System.out.println("Insufficient funds!");
                        }
                        else
                        {
                            saveAcc.depositSaving(transAmt);
                        }
                    }
                    else if (userSpecify == 2)
                    {
                        if (saveAcc.withdrawSaving(transAmt) == -1)
                        {
                            System.out.println("Insufficient funds!");
                        }
                        else
                        {
                            checkAcc.depositChecking(transAmt);
                        }
                    }
                    System.out.println("Your checking account has " + checkAcc.getBalance() + " credits.");
                    System.out.println("Your savings account has " + saveAcc.getBalance() + " credits.\n");
                    break;
                case "Q":
                case "q":
                default:
                    // Quit out of program
                    // printBalances();
                    System.out.println("Your checking account has " + checkAcc.getBalance() + " credits.");
                    System.out.println("Your savings account has " + saveAcc.getBalance() + " credits.\n");
                    session = false;
                    break;

                // Calculate interest rate every 5 transactions
                // if (numTransactions)

            }

        }

    }
}