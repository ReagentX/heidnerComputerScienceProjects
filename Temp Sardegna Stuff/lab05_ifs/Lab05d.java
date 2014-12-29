//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		test.isUpper();
		test.isLower();
		out.println(test);   //A

		//add more test cases
		
		
		
		
		
		
		
		

	}
}