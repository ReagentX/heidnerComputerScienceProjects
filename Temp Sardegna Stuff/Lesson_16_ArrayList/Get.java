//© A+ Computer Science
// www.apluscompsci.com

//ArrayList get() example

import java.util.ArrayList;
import static java.lang.System.*;

public class Get
{
   public static void main(String args[])
	{
		ArrayList<Integer> ray = new ArrayList<Integer>();

		ray.add(23);
		ray.add(11);
		ray.add(12);
		ray.add(65);

		for(int i=0; i<ray.size(); i++)
		{
		   out.println(ray.get(i));
		}
	}
}