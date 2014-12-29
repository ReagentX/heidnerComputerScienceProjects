//© A+ Computer Science
// www.apluscompsci.com

//ArrayList generics

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.*;

public class Generics
{
   public static void main(String args[])
	{
		List<String> ray;
		ray = new ArrayList<String>();
		ray.add("hello");
		ray.add("whoot");
		ray.add("contests");
		out.println(ray.get(0).charAt(0));
		out.println(ray.get(2).charAt(0));
		out.println(ray);

		out.println("\n\n");

		ArrayList<Long> bigList = new ArrayList<Long>();
		bigList.add(new Long(2));
		bigList.add(7L);
		bigList.add(65537765987l);
		out.println(bigList);
	}
}