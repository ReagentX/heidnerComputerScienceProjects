//© A+ Computer Science
// www.apluscompsci.com

//ArrayList clear() example

import java.util.ArrayList;
import static java.lang.System.*;

public class Clear
{
	public static void main(String args[])
	{
		ArrayList<String> ray;
		ray = new ArrayList<String>();

		ray.add("a");
		ray.add("x");
		ray.clear();
		ray.add("t");
		ray.add("w");

		out.println(ray);
	}
}