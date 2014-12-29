//© A+ Computer Science
// www.apluscompsci.com

//selection sort tester

import static java.lang.System.*;
import java.util.Arrays;

public class SelectionSortTester
{
   public static void main( String args[] )
   {
		int[] array = {39,6,11,23,18,3,20,5,57,15};

		out.println("before selection sort");
		out.println(Arrays.toString(array));

		SelectionSort.selectionSort(array);

		out.println("\n\nafter selection sort");
		out.println(Arrays.toString(array));
	}
}