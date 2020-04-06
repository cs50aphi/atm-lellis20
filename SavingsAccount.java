// Savings Account
public class SavingsAccount
{
    private double saveBalance;

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
        saveBalance -= withdrawal;
        return saveBalance;
    }
    public double depositSaving(double deposit)
    {
        saveBalance += deposit;
        return saveBalance;
    }
}