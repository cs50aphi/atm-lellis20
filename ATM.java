// ATM
import java.util.Scanner;

public class ATM
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        boolean session = true;
        String choice;
        SavingsAccount saveAcc = new SavingsAccount();
        CheckingAccount checkAcc = new CheckingAccount();
        System.out.println("Welcome to your ATM! How may I assist you?");
        // System.out.println(saveAcc.getBalance() + " " + checkAcc.getBalance());
        while (session)
        {
            System.out.println("Do you want to: (D)eposit, (W)ithdraw, (C)heck Balance, (T)ransfer, (Q)uit?");
            choice = kb.next();
            switch(choice)
            {
                case "D":
                case "d":
                    // Deposit
                    System.out.print("Deposit to: (1)Checking or (2)Savings?");
                    if (kb.next() == "1")
                    {
                        System.out.print("How many credits do you want to deposit?");
                        double deposit = kb.nextDouble();
                        checkAcc.depositChecking(deposit);
                        System.out.println("Your checking account has " + checkAcc.getBalance() + " credits.");
                        System.out.println("Your savings account has " + saveAcc.getBalance() + " credits.");
                    }
                    break;
                case "W":
                case "w":
                    // Withdraw
                    break;
                case "C":
                case "c":
                    System.out.println("Your checking account has " + checkAcc.getBalance() + " credits.");
                    System.out.println("Your savings account has " + saveAcc.getBalance() + " credits.");
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
                    break;

            }

        }

    }
}