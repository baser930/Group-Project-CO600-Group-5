
/**
 * This is the game itself 
 * 
 * @author (Tahmoor Ul Haq) 
 * @version (27/03/2016)
 */
public class TicTacToe
{
    private int turn;
    private String letter;
    private boolean winner;
    private String topLeft;
    private String topMiddle;
    private String topRight;
    private String middleLeft;
    private String middleMiddle;
    private String middleRight;
    private String bottomLeft;
    private String bottomMiddle;
    private String bottomRight;
    /**
     * Constructor for objects of class TicTacToe
     */
    public TicTacToe()
    {
        turn = 0;
        letter = "";
        winner = false;
        topLeft = "tl";
        topMiddle = "tm";
        topRight = "tr";
        middleLeft = "ml";
        middleMiddle = "mm";
        middleRight = "mr";
        bottomLeft = "bl";
        bottomMiddle = "bm";
        bottomRight = "br";
    }
    /**
     * The main part of the game, used to place the X and O
     */
    public void play()
    {
        turn = turn + 1;
        if(winner == true)
        {
            System.out.println(letter + " is the winner");
        }
        else if(turn == 1 || turn == 3 || turn == 5 || turn == 7 || turn == 9)
        {
            letter = "X";
        }
        else if(turn == 2 || turn == 4 || turn == 6 || turn == 8)
        {
            letter = "O";
        }
    }
    
    /**
     * returns the current letter, X or O
     */
    public String getLetter()
    {
        return letter;
    }
    
    /**
     * returns the winner, used to check to see if someone has won yet
     */
    public boolean getWinner()
    {
        return winner;
    }
    
    /**
     * used to make know where the X or the O has been placed
     */
    public void topLeft()
    {topLeft = getLetter();}
    public void topMiddle()
    {topMiddle = getLetter();}
    public void topRight()
    {topRight = getLetter();}
    public String getTopLeft()
    {return topLeft;}
    public String getTopMiddle()
    {return topMiddle;}
    public String getTopRight()
    {return topRight;}
    public void middleLeft()
    {middleLeft = getLetter();}
    public void middleMiddle()
    {middleMiddle = getLetter();}
    public void middleRight()
    {middleRight = getLetter();}
    public String getMiddleLeft()
    {return middleLeft;}
    public String getMiddleMiddle()
    {return middleMiddle;}
    public String getMiddleRight()
    {return middleRight;}
    public void bottomLeft()
    {bottomLeft = getLetter();}
    public void bottomMiddle()
    {bottomMiddle = getLetter();} 
    public void bottomRight()
    {bottomRight = getLetter();}
    public String getBottomLeft()
    {return bottomLeft;}
    public String getBottomMiddle()
    {return bottomMiddle;}
    public String getBottomRight()
    {return bottomRight;}
    
    /**
     * checks to see if someone has won yet
     */
    public void checkWinner()
    {
        if(getTopLeft() == getTopMiddle() && getTopMiddle() == getTopRight())
        {winner = true; play();}
        else if(getMiddleLeft() == getMiddleMiddle() && getMiddleMiddle() == getMiddleRight())
        {winner = true; play();}
        else if(getBottomLeft() == getBottomMiddle() && getBottomMiddle() == getBottomRight())
        {winner = true; play();}
        else if(getTopLeft() == getMiddleLeft() && getMiddleLeft() == getBottomLeft())
        {winner = true; play();}
        else if(getTopMiddle() == getMiddleMiddle() && getMiddleMiddle() == getBottomMiddle())
        {winner = true; play();}
        else if(getTopRight() == getMiddleRight() && getMiddleRight() == getBottomRight())
        {winner = true ;play();}
        else if(getTopLeft() == getMiddleMiddle() && getMiddleMiddle() == getBottomRight())
        {winner = true; play();}
        else if(getTopRight() == getMiddleMiddle() && getMiddleMiddle() == getBottomLeft())
        {winner = true; play();}
    }
    
}
