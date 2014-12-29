//© A+ Computer Science
// www.apluscompsci.com

//ArrayList search example

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Search
{
	public static void main(String args[])
	{
		ArrayList<Integer> ray = new ArrayList<Integer>();

		ray.add(23);
		ray.add(11);
		ray.add(66);
		ray.add(53);

		out.println(ray);
		out.println(ray.indexOf(21));
		out.println(ray.indexOf(66));
		out.println(ray);
		out.println(ray.contains(21));
		out.println(ray.contains(66));
	}
}
