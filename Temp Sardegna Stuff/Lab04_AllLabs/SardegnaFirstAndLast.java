//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class SardegnaFirstAndLast implements TestableFirstAndLast
{
    private String str;
    private char firstLetter;
    private char lastLetter;

    public SardegnaFirstAndLast()
    {
        setString("");
    }

    public SardegnaFirstAndLast(String s)
    {
        str = s;
    }

    public void setString(String s)
    {
        str = s;
    }

    public void findFirstLastLetters()
    {
        firstLetter = str.charAt(0);
        int len = str.length();
        int j = len - 1;
        lastLetter = str.charAt(j);
    }

    public String toString()
    {
        String output="a";




        return output;
    }
    
    public String getWord(){
        return str;
    }
    
    public char getFirstLetter(){
        return firstLetter;
    }
    
    public char getLastLetter(){
        return lastLetter;
    }
}