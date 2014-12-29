//© A+ Computer Science
// www.apluscompsci.com

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class ActorFive
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      
      Actor dude = new Actor();
      world.add(new Location(1,2), dude);
      
      System.out.println("num cols = " + dude.getGrid().getNumCols());
      System.out.println("num rows = " + dude.getGrid().getNumRows()); 
      	
      System.out.println("loc check = " + dude.getGrid().isValid(new Location(11,8))); 
      	    
      
      //world.show();       
   }
}