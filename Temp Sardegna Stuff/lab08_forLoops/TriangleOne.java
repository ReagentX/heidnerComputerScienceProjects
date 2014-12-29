//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleOne
{
    private String word;

    public TriangleOne()
    {
        word="";
    }

    public TriangleOne(String s)
    {
        word = s;
           

    }


    public void setWord(String s)
    {
        word=s;

    }

    public void print( )
    {

        int len = word.length();
        for (int a = len; a!=0; a--){
            String newString = word.substring(0,a);
            System.out.println(newString);
        }
        System.out.println("\n");


    }
}