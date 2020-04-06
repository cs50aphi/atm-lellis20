// Savings Account
public class SavingsAccount
{
    private double saveBalance;

    // Set up account
    public SavingsAccount(double userSpec)
    {
        saveBalance = userSpec;
    }

    public double getBalance()
    {
        return saveBalance;
    }

    public double withdrawSaving(double withdrawal)
    {
        // Check if sufficient funds
        if (withdrawal > saveBalance)
        {
            return -1;
        }
        saveBalance -= withdrawal;
        return saveBalance;
    }

    public double depositSaving(double deposit)
    {
        saveBalance += deposit;
        return saveBalance;
    }

    // Called every 5 transactions
    public double calculateInterest(double rate)
    {
        saveBalance *= (rate + 1);
        return 0;
    }
}