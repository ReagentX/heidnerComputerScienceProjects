/**
 * @author (Chris Sardegna) 
 * @version Period 5 9/25/13
 */
import info.gridworld.grid.Location;
public class SardegnaLocationStory
{
    public static void main (String[] args){
        //crate a few locatin variables
        Location locOne = new Location(9,1);
        Location locTwo = new Location(3,6);
        Location locThree = new Location(3,6);
        Location locFour = new Location(6,8);
        Location locFive = new Location(9,1);
        //Write a story of your own design which uses print lines 
        //and strings and all the location methods
        
        System.out.println("Once upon a time ther was a computer science student. he lived at the point " + locOne + " and his teacher lived at " + locTwo);
        System.out.println("His teacher's row was" + locTwo.getRow() + " and his column was " + locTwo.getCol()); 
        System.out.println("The student next to me is at " + locOne.getAdjacentLocation(Location.EAST)); 
        System.out.println("To talk to student next to me I need to face " + Location.WEST + " degrees");
        System.out.println("To get to my teacher, I need to walk facing " + locOne.getDirectionToward(locTwo) + " degrees");
        System.out.println("My teacher asked me what 2 - 1 is, I replied \"" + locOne.compareTo(locTwo) + "\", of course!");  
        
        
        if (locOne.equals(locFive)){
            System.out.println ("The End!");
            
        }
        else{
            System.out.println ("Nay:" + " Coordinate 1" + locOne + " Coordinate 2" + locTwo);        
        }
    }
 
}
