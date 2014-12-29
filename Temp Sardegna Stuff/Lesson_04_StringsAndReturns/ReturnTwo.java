//© A+ Computer Science
// www.apluscompsci.com

//return method example 2

import static java.lang.System.*;

public class ReturnTwo
{
	public int willReturnHere( int x )
	{
		return x*x*x;
	}

	//add in a new return method the returns type double
	//the new method should multiply double parameter y by 10





	public static void main(String[] args)
	{
		ReturnTwo demo = new ReturnTwo();

		//why does this statement generate no output
		demo.willReturnHere(3);

		//this is how you use a return method correctly
		//int answer = demo.willReturnHere(3);
		//out.println(answer);
	}
}