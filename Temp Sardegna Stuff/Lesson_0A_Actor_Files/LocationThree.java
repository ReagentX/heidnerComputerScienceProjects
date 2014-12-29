//© A+ Computer Science
// www.apluscompsci.com

import info.gridworld.grid.Location;

public class LocationThree
{
   public static void main(String[] args)
   {
		Location locOne = new Location(2,1);
		Location locTwo = new Location(1,3);
		Location locThree = new Location(4,5);
		Location locFour = new Location(7,7);

				
		
		System.out.println(locOne.getAdjacentLocation(Location.NORTH));	
		System.out.println(locOne.getAdjacentLocation(Location.NORTHEAST));	
		System.out.println(locOne.getAdjacentLocation(Location.SOUTH));	
		System.out.println(locOne.getAdjacentLocation(Location.SOUTHEAST));
		System.out.println(locOne.getAdjacentLocation(Location.EAST));
		System.out.println(locOne.getAdjacentLocation(Location.SOUTHWEST));
		System.out.println(locOne.getAdjacentLocation(Location.WEST));
		System.out.println(locOne.getAdjacentLocation(Location.NORTHWEST));
		
		System.out.println(locOne.getDirectionToward(locOne));
		System.out.println(locOne.getDirectionToward(locTwo));	
		System.out.println(locOne.getDirectionToward(locThree));	
		System.out.println(locOne.getDirectionToward(locFour));	
		
   }
}