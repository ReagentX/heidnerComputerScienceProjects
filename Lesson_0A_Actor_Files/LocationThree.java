//© A+ Computer Science
// www.apluscompsci.com

import info.gridworld.grid.Location;

public class LocationThree
{
   public static void main(String[] args)
   {
		Location locOne = new Location(2,1);
		Location locTwo = new Location(1,3);
				
		System.out.println(locOne.getAdjacentLocation(Location.NORTH));	
		System.out.println(locOne.getAdjacentLocation(Location.SOUTH));	
		System.out.println(locOne.getAdjacentLocation(Location.EAST));	
		System.out.println(locOne.getAdjacentLocation(Location.WEST));
		
		System.out.println(locOne.getDirectionToward(locTwo));		
   }
}