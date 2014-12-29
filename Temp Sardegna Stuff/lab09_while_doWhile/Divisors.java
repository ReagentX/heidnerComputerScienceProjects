//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Divisors
{
    public static String getDivisors( int number )
    {
        //String divisors=number + " has divisors ";
        int count = 0;
        String divisors=number + " has divisors: ";
        double num = number;
        double divisor=1;
        while(divisor <= num )
        {
           //System.out.println((num/divisor)%2);
           double q = num/divisor;
           String s="";
           //System.out.println(q);
           
           if ((num/divisor)%1 == 0){
               s = (int)divisor + " ";
               count++;
           }
           //System.out.println( number % 10 );
            //String divisors=number + " has " + count + " divisors: ";
            divisors += s;
            divisor++;
        }
        
        //System.out.println( total );
        System.out.println(divisors + " (" + count + ") ");
        return divisors;
    }
}