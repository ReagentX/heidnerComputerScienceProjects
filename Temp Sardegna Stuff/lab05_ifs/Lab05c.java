//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05c
{
	public static void main ( String[] args )
	{
	    Scanner keyboard = new Scanner( System.in );

		out.print("Enter a string :: ");
		String sas = keyboard.next();
	    
	    StringOddOrEven tom = new StringOddOrEven(sas);
	    tom.isEven();
	    tom.toString();
	}
}