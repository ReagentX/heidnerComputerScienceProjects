//© A+ Computer Science
// www.apluscompsci.com

//ArrayList remove() example

import java.util.ArrayList;
import static java.lang.System.*;

public class RemoveTwo
{
	public static void main(String args[])
	{
		ArrayList<String> ray;
		ray = new ArrayList<String>();

		ray.add("a");
		ray.add("b");
		ray.remove("a");
		ray.add("c");
		ray.add("d");
		ray.remove("d");

		out.println(ray);
	}
}