//© A+ Computer Science
// www.apluscompsci.com

//new for loop example 1

import java.util.ArrayList;
import static java.lang.System.*;

public class ForEachLoopOne
{
	public static void main(String args[])
	{
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>();

		ray.add(23);
		ray.add(11);
		ray.add(66);
		ray.add(53);

		for(int num : ray)  //auto unboxing taking place
		{
		   out.println(num);
		}
	}
}