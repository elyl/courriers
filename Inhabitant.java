public class Inhabitant
{
    private String	name;
    private City	city;
    private BankAccount	account;

    public Inhabitant(String name, City city, int amount)
    {
	this.name = name;
	this.city = city;
	this.account = new Bankaccount(amount);
    }

    public String getName()
    {
	return (this.name);
    }

    public City getCity()
    {
	return (this.city);
    }

    public BankAccount getAccount()
    {
	return (this.account);
    }
}