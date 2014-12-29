// A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 11 March 2014
//Class - Period 5
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.String;

public class GuessingGame
{
    private int lowerBound,upperBound,compChoice,userGuess;
    double cc,totalGuesses,totalCorrect;
    
    public GuessingGame(int low, int up)
    {
        lowerBound = low;
        upperBound = up;
        do{
            cc = Math.random()*(double)upperBound;
        }while(cc < lowerBound || cc > upperBound);
        compChoice = (int)cc;
        out.println("Computer Picks " + compChoice);
        this.playGame();
    }

    public void playGame()
    {
        Scanner g = new Scanner(System.in);
        int count = 0;
        int correct = 0;
        do{
            out.print("Make a new guess: ");
            userGuess = g.nextInt();
            count++;
        }while(userGuess!=compChoice);
        out.println("Congrats! You Win! It took you " + count + " tries to guess " + compChoice);
        totalGuesses += count;
        totalCorrect++;
        out.println("Out of " + String.format("%.0f",totalGuesses) + " you got " + String.format("%.0f",totalCorrect) + " correct. \n You guess wrong " + String.format("%.2f",(totalCorrect/totalGuesses)*100) + "% of the time.\n\n");
        this.toString();
    }

    public String toString()
    {
        return "Out of " + totalGuesses + " you got " + totalCorrect + " correct, giving you an accuracy rating of " + (totalCorrect/totalGuesses)*100;
    }
}
