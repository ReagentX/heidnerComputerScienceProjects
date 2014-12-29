//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
    private String playChoice;
    private String compChoice;
    private int computerInt,r,p,s;

    public RockPaperScissors()
    {
        playChoice="";
        compChoice="";
        computerInt=0;
        r=0;
        p=1;
        s=2;
    }

    public RockPaperScissors(String player)
    {
        
        playChoice="";
        compChoice="";
        computerInt=0;
        r=0;
        p=1;
        s=2;





    }

    public void setPlayers(String player)
    {







    }

    public String determineWinner()
    {
        String winner="";
       computerInt = (int)Math.random()*4;
        
        if (computerInt == 1) 
            compChoice = "R"; 
       else if (computerInt == 2) 
            compChoice = "P"; 
       else if (computerInt == 3) 
            compChoice = "S"; 



















        return winner;
    }

    public String toString()
    {
        String output="";




        return output;
    }
}