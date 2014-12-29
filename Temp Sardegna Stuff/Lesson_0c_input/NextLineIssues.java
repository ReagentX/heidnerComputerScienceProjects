//© A+ Computer Science  -  www.apluscompsci.com

//scanner string example

import java.util.Scanner;
import static java.lang.System.*;

public class NextLineIssues
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);

		out.print("Enter an integer :: ");
		int num = keyboard.nextInt();
		
		//uncomment the line below to fix the input issue 
		//keyboard.nextLine();		//picks up whitespace
		
		out.print("Enter a sentence :: ");
		String sentence = keyboard.nextLine();
		out.println(num + " "+sentence);
	}
}
