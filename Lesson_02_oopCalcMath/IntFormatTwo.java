//© A+ Computer Science
// www.apluscompsci.com

//Using printf with Integers and ints

import static java.lang.System.*;

public class IntFormatTwo
{
	public static void main(String args[])
	{
		out.println("\n\nString.format() returns a formatted string.\n\n");

		num = 567;
		out.println(String.format("%d",num));
		out.println(String.format("%6d",num));
		out.println(String.format("%-6dx",num));
		out.println(String.format("%06dx",num));
	}
}