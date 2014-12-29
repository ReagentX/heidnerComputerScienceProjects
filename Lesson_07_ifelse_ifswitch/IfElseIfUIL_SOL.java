//© A+ Computer Science
// www.apluscompsci.com

//if else if statement

public class IfElseIfUIL_SOL
{
	public static String checkScore( int uilScore )
	{
		//option 1
		if(uilScore>220)
		{
		   return "state bound";
		}
		else if(uilScore>200)
		{
		   return "region bound";
		}
		else if(uilScore>180)
		{
		   return "district bound";
		}
		else
		{
		  return "take more tests";
		}
		
		//option 2
		/*
		if(uilScore>220)
		   return "state bound";
		if(uilScore>200)
		   return "region bound";
		if(uilScore>180)
		   return "district bound";
	  return "take more tests";
		*/
	}

	public static void main(String args[])
	{
		int score = 220;
		System.out.println( checkScore( score ) );			//outs region bound

		score = 240;
		System.out.println( checkScore( score ) );			//outs state bound

		score = 130;
		System.out.println( checkScore( score ) );			//outs take more tests

		score = 190;
		System.out.println( checkScore( score ) );			//outs district bound
	}
}