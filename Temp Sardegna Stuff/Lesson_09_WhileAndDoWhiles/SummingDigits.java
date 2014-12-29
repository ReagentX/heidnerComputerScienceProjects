//© A+ Computer Science  -  www.apluscompsci.com

//this example demonstrates how to to use a
//while loop to sum all of the digits of a number

public class SummingDigits
{
   public static void main(String args[])
   {
        int number = 9154;
        int total = 0;
        int i=0;
        while( number > 0 )
		{
		   System.out.println( number % 10 );
		   total += number%10;
		   number = number / 10;
		   i++;
		}
		
		System.out.println( total + " " + i );
        //while number is greater than 0
           //add the right most digit to the total
           //chop off the right most digit of number

        //print out the number
    }
}
