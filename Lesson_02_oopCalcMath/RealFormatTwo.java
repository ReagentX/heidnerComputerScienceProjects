//© A+ Computer Science
// www.apluscompsci.com

//printf and format example for decimals

import static java.lang.System.*;

public class RealFormatTwo
{
	public static void main(String args[])
	{
		out.printf("f is the printf/format symbol for float/real #s\n\n");

		double decOne = 9.23423, decTwo = 7.34243, decThree = 34.324532;
		out.printf("%.2f -- %.2f -- %.3f\n",decOne, decTwo, decThree);


		out.printf("\n\nString.format() returns a formatted string.\n\n");
		double dec = 5.3423;
		out.println(String.format("%.3f",dec));
		out.println(String.format("%12.3f",dec));
		out.println(String.format("%-7.3fx",dec));
	}
}