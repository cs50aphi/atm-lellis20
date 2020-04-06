// ATM
import java.util.Scanner;

public class ATM
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        boolean session = true;
        String choice;
        SavingsAccount saveAcc = new SavingsAccount(100);
        CheckingAccount checkAcc = new CheckingAccount(10);
        System.out.println("Welcome to your ATM! How may I assist you?");
        // System.out.println(saveAcc.getBalance() + " " + checkAcc.getBalance());
        while (session)
        {
            System.out.println("Do you want to: (D)eposit, (W)ithdraw, (C)heck Balance, (T)ransfer, (Q)uit? ");
            choice = kb.next();
            switch(choice)
            {
                case "D":
                case "d":
                    // Deposit
                    System.out.print("Deposit to: (1)Checking or (2)Savings? ");
                    int userSpecify = kb.nextInt();
                    if (userSpecify == 1)
                    {
                        System.out.print("How many credits do you want to deposit? ");
                        checkAcc.depositChecking(kb.nextDouble());
                        System.out.println("Your checking account has " + checkAcc.getBalance() + " credits.");
                        System.out.println("Your savings account has " + saveAcc.getBalance() + " credits.\n");
                    }
                    else if (userSpecify == 2)
                    {
                        System.out.print("How many credits do you want to deposit? ");
                        saveAcc.depositSaving(kb.nextDouble());
                        System.out.println("Your checking account has " + checkAcc.getBalance() + " credits.");
                        System.out.println("Your savings account has " + saveAcc.getBalance() + " credits.\n");
                    }
                    break;
                case "W":
                case "w":
                    // Withdraw
                    break;
                case "C":
                case "c":
                    System.out.println("Your checking account has " + checkAcc.getBalance() + " credits.");
                    System.out.println("Your savings account has " + saveAcc.getBalance() + " credits.\n");
                    // Check Balance
                    break;
                case "T":
                case "t":
                    // Transfer Money
                    break;
                case "Q":
                case "q":
                default:
                    // Quit out of program
                    session = false;
                    break;

            }

        }

    }
}