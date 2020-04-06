// Checking Account
public class CheckingAccount {

    private double balance;
    public CheckingAccount(double userSpec)
    {
        balance = userSpec;
    }

    public double getBalance()
    {
        return balance;
    }
    public double withdrawChecking(double withdrawal)
    {
        if (withdrawal > balance)
        {
            return -1;
        }
        balance -= withdrawal;
        return balance;
    }
    public double depositChecking(double deposit)
    {
        balance += deposit;
        return balance;
    }
}