//© A+ Computer Science
// www.apluscompsci.com

//comparable sort example

import static java.lang.System.*;
import java.util.Arrays;

public class SortThree
{
									//you can pass in any array that contains 
									//Objects that implement Comparable
	public static void sort(Comparable[] stuff)
	{
	    for(int i=0;i<stuff.length-1;i++)
	    {
	      int spot=i; 
	      for(int j=i;j<stuff.length;j++){
	        if(stuff[j].compareTo(stuff[spot])<0)  //flip the < to >
	          spot=j;
	      }
	      Comparable save=stuff[i];
	      stuff[i]=stuff[spot];
	      stuff[spot]=save;
	    } 
	}
	
	public static void main ( String[] args )
	{
		Comparable[] list =  {3,8,7,6,5,4,9};

		sort(list);

		for(Comparable num : list)
		{
			out.print(num + " ");
		}

		out.println("\n\n");

		list = new String[]{"a","x","e","w","q"};

		sort(list);

		for(Comparable let : list)
		{
			out.print(let + " ");
		}
		
		out.println("\n\n");		
	}
}