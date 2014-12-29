//© A+ Computer Science
// www.apluscompsci.com

//ArrayList fill example

import java.util.ArrayList;
import static java.lang.System.*;
import java.util.Collections;

public class Fill
{
	public static void main(String args[])
	{
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>();
		ray.add(0);
		ray.add(0);
		ray.add(0);
		out.println(ray);		
		
		Collections.fill(ray,33);
		out.println(ray);
	}
}