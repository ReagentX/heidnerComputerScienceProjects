//© A+ Computer Science  -  www.apluscompsci.com

//scanner string example

import java.util.Scanner;

public class ScannerStrings
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a multi-word sentence :: ");
		String sentence = keyboard.nextLine();
		System.out.println(sentence);

		System.out.print("Enter a one word string :: ");
		String s = keyboard.next();
		System.out.println(s);
	}
}
