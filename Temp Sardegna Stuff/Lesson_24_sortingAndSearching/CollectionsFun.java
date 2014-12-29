//© A+ Computer Science
// www.apluscompsci.com

//ArrayList rotate example

import java.util.ArrayList;
import static java.lang.System.*;
import java.util.Collections;

public class CollectionsFun
{
	public static void main(String args[])
	{
		ArrayList<Integer> ray = new ArrayList<Integer>();

		ray.add(23);
		ray.add(11);
	   ray.add(53);
	   Collections.sort( ray );

		out.println(ray);

      out.println("\nrotate 2");
      Collections.rotate(ray,2);
		out.println(ray);

		out.println("\nrotate 2 and reverse");
		Collections.rotate(ray,2);
      Collections.reverse(ray);
		out.println(ray);
	}
}