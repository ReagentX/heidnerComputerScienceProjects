//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Box
{
    private String word;

    public Box()
    {
        word = "";
        
    }

    public Box(String s)
    {
        word = s;
        int len = word.length();   

    }

    public void setWord(String s)
    {
        word=s;
    }

    public void print( )
    {
        System.out.println(Math.pow(3.2,4.2));
        
        for (int a = 0; a < word.length(); a++){
            System.out.println(word);
        }
        System.out.println("\n");
    }
}