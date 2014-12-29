//© A+ Computer Science
// www.apluscompsci.com

//parameter example 1

import static java.lang.System.*;

public class ParametersOne
{
	public void times(int num1, int num2)
	{
	   out.println(num1*num2);
	}

   public static void main(String args[])
   {
		ParametersOne test = new ParametersOne();
		test.times(6,7);
   }
}
