//© A+ Computer Science
// www.apluscompsci.com

//new for loop example 2

import java.util.ArrayList;
import static java.lang.System.*;

public class ForEachLoopTwo
{
	public static void main(String args[])
	{
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>();

		ray.add(23);
		ray.add(11);
		ray.add(66);
		ray.add(53);

		int total = 0;
		for(Integer num : ray)
		{
			//this line shows the AP preferred way
   		//it shows the manual retrieval of the primitive
		   total = total + num.intValue();
		   
		   //the line below accomplishes the same as the line above
		   //but, it uses autounboxing to get the primitive value
		   //total = total + num;
		}
		out.println(total);
	}
}