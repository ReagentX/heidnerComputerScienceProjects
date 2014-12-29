//© A+ Computer Science
// www.apluscompsci.com

//for loop totalling example

import static java.lang.System.*;

public class ForTotal
{
	public static void main(String args[])
	{
		int total = 0;
		for(int run=1; run<=5; run++)  //change the 5 stop value and rerun
		{
			total=total+run;
		}
		out.println(total);
	}
}
