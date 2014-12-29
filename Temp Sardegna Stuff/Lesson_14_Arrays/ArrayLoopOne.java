//© A+ Computer Science
// www.apluscompsci.com

//array loop access example 1

import static java.lang.System.*;

public class ArrayLoopOne
{
    public static void main(String args[])
    {
        int[] nums = {1,2,3,4,5,6,7};

        //add in a traditional for loop to print out nums
        for (int item : nums){
            out.println(item);
        }



        out.println("\n\n");

        //another bug to fix - what is the problem?
        int[] intList = {45,12,78,36,584,7};

        //add in a for each loop print out intList - use the for each loop
        for (int joe : intList){
            out.println(joe);
        }


    }
}