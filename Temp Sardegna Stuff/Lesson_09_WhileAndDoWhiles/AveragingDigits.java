//© A+ Computer Science  -  www.apluscompsci.com

import java.util.*;

//this example demonstrates how to to use a
//while loop to average all of the digits of a number

public class AveragingDigits
{
    int number;
    int total;
    int i;
    //pre - num > 0
    //post - number of digits in num will be returned
    public int countDigits( int num )
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

    //pre - num > 0
    //post - sum of digits in num will be returned
    public double sumDigits( int num )
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

    //pre - none
    //post - average of digits in num will be returned
    //         unless num <= 0 then 0 is returned
    public double averageDigits( int num )
    {
        //System.out.println(this.sumDigits(num) + " " + this.countDigits(num));
        return this.sumDigits(num)/this.countDigits(num);
    }

   public static void main(String args[])
   {
        Scanner kb = new Scanner( System.in );
        AveragingDigits avg = new AveragingDigits();
        System.out.print( "Enter a number > 0 :: " );
        int num = kb.nextInt();
        System.out.println("The digit average is " + avg.averageDigits( num) );
    }
}
