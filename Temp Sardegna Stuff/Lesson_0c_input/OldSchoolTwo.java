//© A+ Computer Science  -  www.apluscompsci.com

//bufferedreader example

import java.io.*;

public class OldSchoolTwo
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader keyboard = new BufferedReader ( new InputStreamReader( System.in ) );

		System.out.print("Enter an integer :: ");
		int one = Integer.parseInt(keyboard.readLine());

		System.out.print("Enter a double :: ");
		double two = Double.parseDouble(keyboard.readLine());

		System.out.println("Integer value :: " + one);    // output int
		System.out.println("Double value  :: " + two);    // output double
	}
}