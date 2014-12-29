//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class SardegnaName implements TestableName
{
    private String name;

    public SardegnaName()
    {
        setName("");

    }

    public SardegnaName(String s)
    {
        name = s;

    }

   public void setName(String s)
   {
       name = s;

   }

    public String getFirst()
    {
       int ind1 = name.indexOf(" ");
       String first = name.substring(0,ind1);
       return first;
    }

    public String getLast()
    {
       int ind2 = name.indexOf(" ");
       int ind3 = ind2+1;
       String last = name.substring(ind3);
       return last;
    }

    public String toString()
    {
        return name;
    }
    
    public String getName(){
        return name;
    }
}