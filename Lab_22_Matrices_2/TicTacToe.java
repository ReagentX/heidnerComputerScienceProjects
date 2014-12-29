//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 4/19/14
//Class - Period 5
//Lab  -
import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
    private char[][] mat;
    int free =0;
    int board = 0;
    int[] arrays = new int[3];

    public TicTacToe()
    {
        mat = new char[3][3];
    }

    public TicTacToe(String game)
    {
        if(free == 0)
        {
            mat = new char[3][3];
            free++;
        }
        for(int row =0;row < 3; row++)
        {
            for(int column = 0; column < 3;column++)
            {
                if(board >= game.length() + 1)
                {
                    board = 0;
                }
                mat[row][column] = game.charAt(board);
                board++;
            }
        }
    }

    public String getWinner()
    {
        int direction = 0;
        String winnerX = null;
        String winnerO = null;
        for(int x = 0; x < mat.length;x++)
        {
            if(mat[x][0]==mat[x][1] && mat[x][0] == mat[x][2])
            {
                if(mat[x][0] == 'X')
                {
                    winnerX = " winner is X";
                    direction = 1;
                }
                else
                {
                    winnerO = "winner is O";
                    direction = 2;
                }
            }
        }
        for(int i = 0; i < mat.length; i++)
        {
            if(mat[0]==mat[1] && mat[0] == mat[2])
            {
                if(mat[i][0] == 'X')
                {
                    winnerX = " winner is X";
                    direction = 3;
                }
                else
                {
                    winnerO = "winner is O";
                    direction = 4;
                }
            }
        }
        for(int bat = 2; bat < mat.length; bat++)
            if(mat[bat][0]==mat[bat][1] && mat[bat][0] == mat[bat][2])
            {
                if(mat[0][bat-1] == 'X')
                {
                    winnerX = " winner is X";
                    direction = 5;
                }
                else
                {
                    winnerO = "winner is O";
                    direction = 6;
                }
        }
        
        
        if(direction == 1)
        {
            return "winner is X wins horizontal!";
        }
        else if(direction == 2)
        {
            return "winner is O wins horizontal";
        }
        else if(direction == 3)
        {
            return "winner is X wins vertical!";
        }
        else if(direction == 4)
        {
            return "winner is O wins vertical!";
        }
        else if(direction == 5)
        {
            return "winner is X wins diaganolly!";
        }
        else if(direction == 6)
        {
            return "winner is O wins diaganolly!";
        }

        return "draw";
    }

    public String toString()
    {
        String result="";
        for(int row =0;row < mat.length; row++)
        {
            for(int column = 0; column < mat[row].length;column++)
            {
                result = result + " " + mat[row][column];
            }
            result = result + "\n";
        }

        return result;
    }
}