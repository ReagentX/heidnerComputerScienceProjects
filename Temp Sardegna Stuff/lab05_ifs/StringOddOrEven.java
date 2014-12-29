//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
    private String word;

    public StringOddOrEven()
    {
        word = "Test";
    }

    public StringOddOrEven(String s)
    {
        word = s;
        //System.out.println("''"+word + "''" + " is even.");
    }

    public void setString(String s)
    {
        word = s;
        //System.out.println("''"+word + "''" + " is even.");
    }

    public boolean isEven()
    {
        int as = word.length();
        if (as%2==0){
            System.out.println(word + " is even.");
            return true;
        }
        else if (as%2==1){
            System.out.println(word + " is odd.");
            return false;
        }
        return false;
    }

    public String toString()
    {
        String output="";

        return output;
    }
}