//© A+ Computer Science
// www.apluscompsci.com

//ArrayList set() example

import java.util.ArrayList;
import static java.lang.System.*;

public class Set
{
   public static void main(String args[])
	{
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>();
		ray.add(23);
		ray.add(11);
		ray.set(0,66);
		ray.add(53);
		ray.set(1,93);
		ray.add(22);
		//ray.set(7, 99);		//what does this do?
		out.println(ray);
	}
}