//© A+ Computer Science  -  www.apluscompsci.com

//ArrayList remove() example

import java.util.ArrayList;
import static java.lang.System.*;

public class RemoveAll
{
	public static void main(String args[])
	{
		ArrayList<String> ray;
		ray = new ArrayList<String>();

		ray.add("all");
		ray.add("all");
		ray.add("fun");
		ray.add("dog");
		ray.add("bat");
		ray.add("cat");
		ray.add("all");
		ray.add("dog");
		ray.add("all");
		ray.add("all");
		out.println(ray);
		out.println(ray.size());		

		//add in a loop to remove all occurrences of all


	}
}