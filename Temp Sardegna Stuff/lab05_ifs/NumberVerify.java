//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class NumberVerify
{
    public NumberVerify(int number){
        int num = number;
       
        
        if(number%2 == 0){
            this.isEven(num);
        }
        else if (number%2 == 1){
            this.isOdd(num);
        }
    }

    public static boolean isOdd(int num)
    {
        
        System.out.println(num + " is odd :: true" );
        System.out.println(num + " is even :: false" );
        System.out.println("");
        return true;
    }
    public static boolean isEven(int num)
    {
        
        System.out.println(num + " is odd :: false" );
        System.out.println(num + " is even :: true" );
        System.out.println("");
        return true;
    }   
}