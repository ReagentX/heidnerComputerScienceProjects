//© A+ Computer Science
// www.apluscompsci.com

//Array instance variable example two

import java.util.Scanner;
import static java.lang.System.*;

public class ArrayInstanceVarsTwo_Sol
{
	private int[] nums;

   public ArrayInstanceVarsTwo_Sol(String list)
   {
   	//instantiate the array so that it can store 10 integers
   	nums = new int[10];
   	
   	//put the ten numbers from list into nums
   	setNums(list);
   }
   
   public void setNums(String list)
   {
   	//put the ten numbers from list into nums
   	int spot = 0;
   	Scanner chopper = new Scanner(list);
   	while(chopper.hasNextInt())
   	{
   		nums[spot++]=chopper.nextInt();
   	}
   }

	public String toString()
	{
		String output = "";
		for( int val : nums)
		{
			output = output + val + " ";
		}
		return output;
	}


	public static void main(String args[])
	{
		ArrayInstanceVarsTwo_Sol test = new ArrayInstanceVarsTwo_Sol("1 2 3 4 5 6 7 8 9 10");
		out.println(test);
		
		test.setNums("3 4 5 6 7 8 9 1 2 0");
		out.println(test);
	}
}
