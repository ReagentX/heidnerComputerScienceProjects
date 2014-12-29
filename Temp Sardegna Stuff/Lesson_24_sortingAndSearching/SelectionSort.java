//© A+ Computer Science
// www.apluscompsci.com

//selection sort example

import static java.lang.System.*;

public class SelectionSort
{
	public static void selectionSort(int[] ray)
	{
		for(int i=0; i< ray.length-1; i++)
		{
			int min = i;
			for(int j = i+1; j< ray.length; j++)
			{
			   if(ray[j] < ray[min])  //flip the symbol - what happens??
					min = j;    //find location of smallest
			}
			if( min != i)	{
				int temp = ray[min];
				ray[min] = ray[i];
				ray[i] = temp;   //put smallest in pos i
			}
		}
	}
}