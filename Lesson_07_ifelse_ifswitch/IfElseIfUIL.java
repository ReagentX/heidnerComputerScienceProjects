//© A+ Computer Science
// www.apluscompsci.com

//if else if statement

public class IfElseIfUIL
{
	//pre - uilScore >=0 && uilScore <=240
	//post - String values returned
	public static String checkScore( int uilScore )
	{
		return "";
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