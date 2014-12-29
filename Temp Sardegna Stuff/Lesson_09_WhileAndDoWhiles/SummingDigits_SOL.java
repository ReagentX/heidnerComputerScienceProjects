//© A+ Computer Science  -  www.apluscompsci.com

//this example demonstrates how to to use a
//while loop to sum all of the digits of a number

public class SummingDigits_SOL
{
   public static void main(String args[])
   {
		int number = 9154;
		int total = 0;
		while( number > 0 )
		{
		   total = total + number % 10;
		   number = number / 10;
		}
		System.out.println( total );
	}
}
