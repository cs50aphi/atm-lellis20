// Checking Account
// No need for transfer function, it's just a withdrawal then a deposit
public class CheckingAccount {

    private double balance;

    // Set up account
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
        // Check if there are sufficient funds
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