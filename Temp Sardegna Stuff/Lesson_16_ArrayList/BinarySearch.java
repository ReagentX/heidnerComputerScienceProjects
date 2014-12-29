//© A+ Computer Science
// www.apluscompsci.com

//ArrayList binarySearch() example

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class BinarySearch
{
	public static void main(String args[])
	{
		ArrayList<Integer> ray = new ArrayList<Integer>();

		ray.add(23);
		ray.add(11);
		ray.add(66);
		ray.add(53);

      Collections.sort(ray);

		System.out.println("\nSorted ArrayList");

		out.println(ray);

		out.println("\nSEARCHING FOR 677");
		out.println(Collections.binarySearch(ray,677));

		out.println("\nSEARCHING FOR 66");
		out.println(Collections.binarySearch(ray,66));
	}
}