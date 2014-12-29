//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 3/27/2014
//Class - Period 5
//Lab  -

import static java.lang.System.*;

public class DigitCounter
{
    int num;   
    public int countDigits( int number )
    {
        int sum=0;
        num = number;
        while( number > 0 )
        {
           //System.out.println( number % 10 );
           number = number / 10;
           sum++;
        }
        System.out.println(num + " contains " + sum + " digits.\n");
        return sum;
    }
}