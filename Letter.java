public abstract class Letter<T extends Content>
{
    private int		cost;
    private Inhabitant	sender;
    private Inhabitant	receiver;
    private T		content;

    public Letter(int cost, Inhabitant sender, Inhabitant receiver, T content)
	{
	    this.cost = cost;
	    this.sender = sender;
	    this.receiver = receiver;
	    this.content = content;
	}

    public int getCost()
    {
	return (this.cost);
    }

    public Inhabitant getSender()
    {
	return (this.sender);
    }

    public Inhabitant getReceiver()
    {
	return (this.receiver);
    }

    public T getContent()
    {
	return (this.content);
    }    
}