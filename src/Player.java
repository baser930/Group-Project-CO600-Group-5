
/**
 * 
 */
public class Player
{
    private String name;
    private String noughtOrCross;
    private int wins;

    /**
     * Constructor for objects of class Player
     */
    public Player(String name, String noughtOrCross)
    {
        this.name = name;
        this.noughtOrCross = noughtOrCross;
        this.wins = 0;
    }

    public String getName()
    {
        return name;
    }
    
    public void setNoughtOrCross(String noughtOrCross)
    {
        this.noughtOrCross = noughtOrCross;
    }
    
    public String getNoughtOrCross()
    {
        return noughtOrCross;
    }
    
    public void incrementWins()
    {
        this.wins = this.wins + 1;
    }
    
    public int getWins()
    {
        return wins;
    }  
}
