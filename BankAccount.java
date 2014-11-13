public class BankAccount
{
    private int	amount;

    public BankAccount(int amount)
    {
	this.amount = amount;
    }

    public int credit(int amount)
    {
	this.amount += amount;
	return (this.amount);
    }

    public int debit(int amount)
    {
	this.amount -= amount;
	return (this.amount);
    }
}