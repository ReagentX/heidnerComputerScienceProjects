//© A+ Computer Science
// www.apluscompsci.com

//printf example for decimals

import static java.lang.System.*;

public class RealFormatOne
{
	public static void main(String args[])
	{
		out.printf("f is the printf/format symbol for float/real #s\n\n");

		double dec = 9.231482367;
		out.printf("dec == %.1f\n",dec);
		out.printf("dec == %.2f\n",dec);
		out.printf("dec == %.3f\n",dec);
		out.printf("dec == %.4f\n",dec);
		out.printf("dec == %.5f\n",dec);						
	}
}