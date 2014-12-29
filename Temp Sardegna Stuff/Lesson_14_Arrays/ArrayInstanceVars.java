//© A+ Computer Science
// www.apluscompsci.com

//Array instance variable example

import java.util.Scanner;
import static java.lang.System.*;

public class ArrayInstanceVars
{
	private int[] nums;

   public ArrayInstanceVars()
   {
   	//instantiate the array so that it can store 10 integers
   }

	public void work()
	{
	   for(int i=0; i<nums.length;i++)
	   {
	      nums[i] = i*3+4*2;
	   }
	}

	public String toString()
	{
		//you must write this method
			//use the for each loop
		return "";
	}


	public static void main(String args[])
	{
		ArrayInstanceVars test = new ArrayInstanceVars();
		test.work();
		out.println(test);
		
		//output
		/*
			8 11 14 17 20 23 26 29 32 35
		*/
	}
}
