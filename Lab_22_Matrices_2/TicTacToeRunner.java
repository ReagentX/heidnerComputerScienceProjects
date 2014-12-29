//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 4/19/14
//Class - Period 5
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToeRunner
{
    public static void main( String args[] ) throws IOException
    {
        TicTacToe perform = new TicTacToe();
        Scanner file = new Scanner(new File("tictactoe.dat"));
        int row = file.nextInt();
        file.nextLine();
        for(int i = 0; i < row; i++)
        {
            String line = file.nextLine();
            perform = new TicTacToe(line);
            System.out.println(perform);
            System.out.println(perform.getWinner());
            System.out.println();
            System.out.println();
        }
    }
} 