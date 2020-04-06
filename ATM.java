// ATM
import java.util.Scanner;

public class ATM
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        SavingsAccount saveAcc = new SavingsAccount();
        CheckingAccount checkAcc = new CheckingAccount();
        System.out.println("Welcome to your ATM! How may I assist you?");
        System.out.println(saveAcc.getBalance() + " " + checkAcc.getBalance());
    }
}