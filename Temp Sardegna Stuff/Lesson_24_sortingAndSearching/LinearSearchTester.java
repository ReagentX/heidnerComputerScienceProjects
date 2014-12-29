//© A+ Computer Science
// www.apluscompsci.com

//linear search tester

import static java.lang.System.*;
import java.util.Arrays;

public class LinearSearchTester
{
   public static void main( String args[] )
   {
		int[] array = {39,6,11,23,18,3,20,5,57,15};

		out.println("before calling linear search");
		out.println(Arrays.toString(array));

		out.println("looking for 8 :: "+	LinearSearch.linearSearch(array,8));
		out.println("looking for 39 :: "+	LinearSearch.linearSearch(array,39));
		out.println("looking for 15 :: "+	LinearSearch.linearSearch(array,15));
		out.println("looking for 5 :: "+	LinearSearch.linearSearch(array,5));				
	}
}