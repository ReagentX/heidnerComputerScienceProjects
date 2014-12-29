//? A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;

public class ArrayFunHouse
{
	//instance variables and constructors could be used, but are not really needed

	//getSum() will return the sum of the numbers from start to stop, not including stop
	public  int getSum(int[] numArray, int start, int stop)
	{
	    int sum = 0;
	    for(int idx = start; idx < stop; idx++)
	    {
	      sum = sum + numArray[idx];
	    }
	       
		return sum;
    }

	//getCount() will return number of times val is present
	public  int getCount(int[] numArray, int val)
	{
	    int count = 0;
	    for(int idx = 0; idx < numArray.length; idx++) 
	    {
	        if (numArray[idx] == val)
	            count++;
	     }    
		return count;
      
	}

	public  int[] removeVal(int[] numArray, int val)
	{
	    int[]shorter = new int[numArray.length - this.getCount(numArray, val)];
	    int spot = 0;
		  for(int idx = 0; idx < numArray.length; idx++) 
	     {
	       if(numArray[idx] != val)
	       {
	         shorter[spot++] = numArray[idx];
	        
	       }  
	     }    
	    
	    
	    return shorter;
	}
}