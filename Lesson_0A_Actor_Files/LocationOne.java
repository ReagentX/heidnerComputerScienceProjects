//? A+ Computer Science
// www.apluscompsci.com

import info.gridworld.grid.Location;

public class LocationOne
{
   public static void main(String[] args)
   {
		//Location locOne = new Location();	//default constructor does not exist
		//System.out.println(locOne);
		
		Location locTwo = new Location(3,5);
		System.out.println(locTwo);	
		System.out.println(locTwo.getRow());	
		System.out.println(locTwo.getCol());		q
		
		Location locOne = new Location(9,2);
		int dir = locOne.getDirectionToward(new Location(6,5));
		System.out.println(dir);

		Location locThree = new Location(2,9);
		Location locFour = new Location(4,4);
		System.out.println(locThree);
		System.out.println(locFour);		
		
		//instantiate and print a few more Location Objects
		
		
		
   }
}