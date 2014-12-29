//© A+ Computer Science
// www.apluscompsci.com

//ArrayList rotate example

import java.util.ArrayList;
import static java.lang.System.*;
import static java.util.Collections.*;

public class Rotate
{
	public static void main(String args[])
	{
		ArrayList<Integer> ray = new ArrayList<Integer>();

		ray.add(23);
		ray.add(11);
	   ray.add(53);

		out.println(ray);

      out.println("\nrotate 2");
      rotate(ray,2);
		out.println(ray);

		out.println("\nrotate 2 and reverse");
		rotate(ray,2);
      reverse(ray);
		out.println(ray);
	}
}