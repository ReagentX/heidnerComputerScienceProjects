//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class SardegnaStringRipper implements TestableStringRipper
{
    private String word;
    
    public SardegnaStringRipper()
    {
        setString("");
    }

    public SardegnaStringRipper(String s)
    {
        word = s;
    }
    
   public void setString(String s)
   {
       word = s;
   }    

    public String ripString(int x, int y)
    {
        String a = word.substring(x,y);
        return a;
    }

    public String toString()
    {
        return word;
    }
    
    public String getWord(){
          return word;
    }
}