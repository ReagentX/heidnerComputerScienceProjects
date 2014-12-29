//? A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import static java.lang.System.*;

public class TicTacToe
{
    private char[][] mat;
    Scanner reader;
    public TicTacToe()
    {

    }
    public TicTacToe(String game)
    {
        try{
            reader = new Scanner(new File("cc.dat") );
        }catch(FileNotFoundException e){ System.out.println("Sorry, Can't Find the File");}

        int length = reader.nextInt();
        bank = new OnlinePurchase[length];
        int idx = 0; 
        while(reader.hasNext()){
            reader.nextLine();
            name = reader.nextLine();
            t = reader.nextLine();
            prov = reader.nextLine();
            ccnum = reader.nextLine();
            phoneN = reader.nextLine();
            pr = reader.nextDouble();
            bank[idx] = new OnlinePurchase(ccnum,name,pr,prov,t,phoneN);
            idx++;
        } 

    }
    public String getWinner()
    {






        return "";
    }

    public String toString()
    {
        String output="";



        return output+"\n\n";
    }
}