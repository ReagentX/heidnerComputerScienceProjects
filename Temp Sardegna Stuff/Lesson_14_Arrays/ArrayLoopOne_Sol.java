//© A+ Computer Science
// www.apluscompsci.com

//array loop access example 1

import static java.lang.System.*;

public class ArrayLoopOne_Sol
{
	public static void main(String args[])
	{
		int[] nums = {1,2,3,4,5,6,7};
		for(int spot=0; spot<nums.length; spot++)
		{
			out.println(nums[spot]);
		}

		out.println("\n\n");

		//another bug to fix - what is the problem?
		int[] intList = {5,5,6,1,8,5,4,3,9,4,2,4};
		for(int val : intList)
		{
		  out.println(val);
		}
	}
}