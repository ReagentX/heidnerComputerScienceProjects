//© A+ Computer Science
// www.apluscompsci.com

//printf example

import static java.lang.System.*;

public class StringFormatOne
{
	public static void main(String args[])
	{
		String s = "compsci";
		out.printf("%s\n", "compsci");
		out.printf("%40s\n", s + " is a ton of fun!");		//right aligned
		out.printf("%-20s\n", "compsci");		//left aligned
	}
}