//© A+ Computer Science
// www.apluscompsci.com

//binary search tester

import static java.lang.System.*;
import java.util.Arrays;

public class BinarySearchTester
{
    public static void main( String args[] )
    {
        int[] array = {39,6,11,23,18,3,20,5,57,15};
        BinarySearch runner = new BinarySearch();

        out.println("before calling binarySearch");
        InsertionSort.insertionSort(array);
        out.println(Arrays.toString(array));

        out.println("\n\nCalling Loop BinarySearch\n");
        out.println("looking for 8 :: "+    runner.binarySearchL(array,8));
        out.println("looking for 39 :: "+   runner.binarySearchL(array,39));
        out.println("looking for 15 :: "+   runner.binarySearchL(array,15));
        out.println("looking for 5 :: "+    runner.binarySearchL(array,5));

        out.println("\n\nCalling Recursive BinarySearch\n");
        out.println("looking for 8 :: "+runner.binarySearchR(array,8,0,array.length-1));
        out.println("looking for 39 :: "+runner.binarySearchR(array,39,0,array.length-1));
        out.println("looking for 15 :: "+runner.binarySearchR(array,15,0,array.length-1));
        out.println("looking for 5 :: "+runner.binarySearchR(array,5,0,array.length-1)); 
    }
}