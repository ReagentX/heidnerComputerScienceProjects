//© A+ Computer Science  -  www.apluscompsci.com

//bufferedreader example

import java.io.*;

public class OldSchoolOne
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader keyboard = new BufferedReader(new  InputStreamReader(System.in));

		System.out.print("Enter a word :: ");
		String s = keyboard.readLine();

		System.out.println("You typed in " + s + '\n' );
	}
}