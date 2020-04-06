// Savings Account
public class SavingsAccount
{
    private double saveBalance;
    public SavingsAccount()
    {
        saveBalance = 100;
    }
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
    public double depostSaving(double deposit)
    {
        saveBalance += deposit;
        return saveBalance;
    }
}