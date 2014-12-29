//© A+ Computer Science
// www.apluscompsci.com

//array loop access example

import static java.lang.System.*;

public class ArrayLoopTwo_SOL
{
	public static void main(String args[])
	{
		int[] nums = new int[6];

		for(int spot=0; spot<nums.length; spot++)
		{
		    nums[spot] = spot*4;
		}

		for( int item : nums )
		{
			System.out.print( item + " " );
		}
	}
}