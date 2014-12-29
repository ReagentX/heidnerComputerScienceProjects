//© A+ Computer Science
// www.apluscompsci.com

//comparable sort example

import static java.lang.System.*;
import java.util.Arrays;

public class SortTwo
{
	public static void main ( String[] args )
	{
		Comparable[] list =  {3,8,7,6,5,4,9};
		
		Arrays.sort(list); //uses the compareTo() method of each object
		
		for(Comparable num : list)
		{
			out.println(num);
		}

		out.println("\n\n");

		list = new String[]{"a","x","e","w","q"};
		
		Arrays.sort(list);
		
		for(Comparable let : list)
		{
			out.println(let);
		}
  }
}