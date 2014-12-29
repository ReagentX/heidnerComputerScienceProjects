//© A+ Computer Science
// www.apluscompsci.com

import info.gridworld.grid.Location;

public class LocationFour
{
   public static void main(String[] args)
   {
		Location locOne = new Location(9,1);
		Location locTwo = new Location(3,6);
				
		System.out.println(locOne.equals(locTwo));	
		System.out.println(locOne.compareTo(locTwo));	
		System.out.println(locTwo.compareTo(locOne));								
   }
}