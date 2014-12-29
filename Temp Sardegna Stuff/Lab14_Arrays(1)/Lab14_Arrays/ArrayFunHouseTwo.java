// A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Arrays;

public class ArrayFunHouseTwo
{
    //goingUp() will return true if all numbers
    //in numArray are in increasing order
    //[1,2,6,9,23] returns true
    //[9, 11, 13, 8]  returns false
    public static boolean goingUp(int[] numArray)
    {
        int count = 0;
        for(int idx = 0; idx < numArray.length-1; idx++) 
        {
            //System.out.print(numArray[idx] + " < " + numArray[idx++]);
            if (numArray[idx] < numArray[idx+1]){
                //System.out.println(numArray[idx] + " < " + numArray[idx+1]);
                count++;
            }
            //System.out.println(count + " " + numArray.length);
        }    
        if (count == numArray.length-1){
                System.out.println(Arrays.toString(numArray)+ " true ");
                return true;
            }
        else{ 
                System.out.println(Arrays.toString(numArray)+ " false ");    
                return false;
            }
    }

    //goingDown() will return true if all numbers
    //in numArray are in decreasing order
    //[31,12,6,2,1] returns true
    //[31, 20, 10, 15, 9] returns false
    public static boolean goingDown(int[] numArray)
    {
        int count = 0;
        for(int idx = 0; idx < numArray.length-1; idx++) 
        {
            //System.out.print(numArray[idx] + " < " + numArray[idx++]);
            if (numArray[idx] > numArray[idx+1]){
                //System.out.println(numArray[idx] + " < " + numArray[idx+1]);
                count++;
            }
            //System.out.println(count + " " + numArray.length);
        }    
        if (count == numArray.length-1){
                System.out.println(Arrays.toString(numArray)+ " true ");
                return true;
            }
        else{ 
                System.out.println(Arrays.toString(numArray)+ " false ");    
                return false;
            }
    }

    //getValuesBiggerThanX will return an array that contains
    //count number of values that are larter than parameter x
    //[1,2,3,4,5,6,7,8,9,10,11,6],3,5  would return [6,7,8]
    public static int[] getCountValuesBiggerThanX(int[] numArray, int count, int x)
    {
        int[]shorter = new int[count];
	    int spot = 0;
	    int g = 0;
		  for(int idx = 0; idx < numArray.length-1; idx++) 
	     {
	       
	         if(numArray[idx] > x && g<7)
	       {
	         g++;
	         shorter[spot++] = numArray[idx];	        
	       } 
	     
	   }
	    System.out.println("first " + count + " values greater than " + x + " " +Arrays.toString(shorter));
	    return shorter;
    }
}