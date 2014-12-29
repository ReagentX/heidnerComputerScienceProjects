//© A+ Computer Science
// www.apluscompsci.com

//linear search example

import static java.lang.System.*;

public class LinearSearch
{
	public static int linearSearch(int[] ray, int item)
	{
	   for(int i= 0; i < ray.length; i++)
	   {
	      if(ray[i]==item)
		   	return i;
	   }
	   return -1;   //returns -1 if not found
	}
}