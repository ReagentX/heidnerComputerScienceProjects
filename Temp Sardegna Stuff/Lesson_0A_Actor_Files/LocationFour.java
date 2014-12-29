//© A+ Computer Science
// www.apluscompsci.com

import info.gridworld.grid.Location;

public class LocationFour
{
   public static void main(String[] args)
   {
        Location locOne = new Location(9,1);
        Location locTwo = new Location(3,6);
        Location locThree = new Location(3,6);
        Location locFour = new Location(6,8);
        Location locFive = new Location(6,8);
        
                
        System.out.println(locOne.equals(locTwo));  
        System.out.println(locOne.compareTo(locTwo));   
        System.out.println(locTwo.compareTo(locOne));   
        System.out.println(locFour.compareTo(locFive));
        
        if (locOne.equals(locTwo)){
        System.out.println ("Yay");
        }
        else{
        System.out.println ("Nay:" + " Coordinate 1" + locOne + " Coordinate 2" + locTwo);        
   }
  
   if (locFour.equals(locFive)){
        System.out.println ("Yay!");
        }
        else{
        System.out.println ("Nay:" + " Coordinate 4" + locFour + " Coordinate 2" + locFive);        
   }
}
}