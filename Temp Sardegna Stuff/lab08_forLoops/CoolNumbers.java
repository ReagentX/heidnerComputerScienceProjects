//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class CoolNumbers
{
    /*
     *method isCoolNumber will return true if
     *  num % 3-6 all have a remainder of 1
     *it will return false otherwize
     */
    public static boolean isCoolNumber( int num )
    {
     
        
        return (num%3==1 && num%4==1 && num%5==1 && num%6==1);
    }
    
        /*
     *method countCoolNumbers will return the count
     *of the coolNumbers between 6 and stop
     */
    public static int countCoolNumbers( int stop )
    {
        int count = 0;
        for (int loop = 6; loop <= stop; loop++){
            //determine if number is cool
            if (isCoolNumber(loop)){
                count++;
            }
            //if cool count it
            
        }
        
        
        return count;
    }
}