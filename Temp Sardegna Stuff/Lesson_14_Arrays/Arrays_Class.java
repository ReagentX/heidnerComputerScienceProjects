//© A+ Computer Science
// www.apluscompsci.com

//array sort example

import java.util.Arrays;
import static java.lang.System.*;

public class Arrays_Class
{
	public static void main(String args[])
	{
		int nums[] = {45,78,90,66,11};
		
		Arrays.sort(nums);
		
		for(int item : nums)
			out.println(item);
		
		out.println( Arrays.toString( nums ) );
	}
}