//© A+ Computer Science
// www.apluscompsci.com
//parameter example 2

import static java.lang.System.*;

public class ParametersTwo
{
	public static void times(int one, int two)
	{
	   out.println(one*two);
	}

   public static void main(String args[])
   {
		ParametersTwo.times(6,7);
		//or
		times(3,4);		//only works if the main is the same class
   }
}
