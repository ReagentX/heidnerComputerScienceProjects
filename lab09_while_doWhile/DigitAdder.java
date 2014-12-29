//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 3/27/2014
//Class - Period 5
//Lab  -

import static java.lang.System.*;

public class DigitAdder
{
   public static int sumDigits( int number )
	{
		int total=0;
		int num = number;
        while( num > 0 )
        {
           //System.out.println( number % 10 );
           total += num%10;
           num = num / 10;
        }
        
        System.out.println(total + " is the total of the digits of " + number + "\n" );
        
        return total;
	}
}