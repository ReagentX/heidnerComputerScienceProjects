//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class SardegnaStringChecker implements TestableStringChecker
{
    private String word, asdf;
    private char char1;

    public SardegnaStringChecker()
    {
        setString("");

    }

    public SardegnaStringChecker(String s)
    {
        word = s;

    }

    public void setString(String s)
    {
        word = s;
    }

    public boolean findLetter(char c)
    {
        char1 = c;
        int ind1 = word.indexOf(char1);
        
        if (ind1 == -1){
            return false;
        }
        else{
            return true;
        }
        
        
    }

    public boolean findSubString(String s)
    {
        asdf = s;
        int ind1 = word.indexOf(asdf);
        
        if (ind1 == -1){
            return false;
        }
        else{
            return true;
        }
    }

    public String toString()
    {
        return word;
    }
    
    public String getWord(){
        return word;
    }
}