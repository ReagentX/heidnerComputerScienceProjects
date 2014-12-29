//© A+ Computer Science
// www.apluscompsci.com

//Using printf with Integers and ints

import static java.lang.System.*;

public class IntFormatOne
{
	public static void main(String args[])
	{
		out.println("d is the printf/format symbol for integer\n\n");

		int num = 923;
		out.printf("%d\n",num);
		out.printf("%6d\n",num);
		out.printf("%-6d\n",num);
		out.printf("%06dx\n",num);
	}
}