// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;

public class ArrayFunHouseRunner
{
	public static void main( String args[] )
	{
		int[] one = {4,10,0,1,7,6,5,3,2,9};
		ArrayFunHouse fun = new ArrayFunHouse();

		System.out.println(Arrays.toString(one));
		System.out.println("sum of spots 3-6  =  " + fun.getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + fun.getSum(one,2,9));
		System.out.println("# of 4s  =  " + fun.getCount(one,4));
		System.out.println("# of 9s  =  " + fun.getCount(one,9));
		
	
		System.out.println("This removes a 6" + Arrays.toString(fun.removeVal(one, 6)));
      
		
        int[] two = {4,2,3,4,6,7,8,9,0,10,0,1,7,6,5,3,2,9,9,8,7};

		//add test cases
      

	}
}