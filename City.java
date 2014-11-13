import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class City
{
    private String		name;
    private List<Inhabitant>	inhabitants;
    private List<Letter>	postBox;

    public City(String name)
    {
	this.name = name;
	this.inhabitants = new LinkedList<Inhabitant>();
	this.postBox = new LinkedList<Letter>();
    }

    public String getName()
    {
	return (this.name);
    }

    public void sendLetter(Letter l)
    {
	this.postBox.add(l);
    }

    public void distributeLetters()
    {
	
    }

}