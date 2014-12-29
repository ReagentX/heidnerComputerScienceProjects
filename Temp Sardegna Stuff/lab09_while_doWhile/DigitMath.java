//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;


public class DigitMath
{
    int number;
    int total;
    int i;   
    private double countDigits( int num )
    {
        number = num;
        
        while( number > 0 )
        {
           //System.out.println( number % 10 );
           number = number / 10;
           i++;
        }
        
        return i;
    }

    private double sumDigits( int num )
    {
         number = num;
        while( number > 0 )
        {
           //System.out.println( number % 10 );
           total += number%10;
           number = number / 10;
        }
        
        //System.out.println( total );
        
        return total;
    }

    public double averageDigits( int num )
    {
        System.out.println(num + " has a digit average of " + this.sumDigits(num)/this.countDigits(num)+"\n");
        return this.sumDigits(num)/this.countDigits(num);
    }
}