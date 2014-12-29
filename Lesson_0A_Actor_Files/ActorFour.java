//© A+ Computer Science
// www.apluscompsci.com

import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class ActorFour
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      Actor dude = new Actor();
      dude.setColor(Color.YELLOW);
      dude.setDirection(Location.SOUTH);
      Location loc = new Location(1,4);
      dude.putSelfInGrid(world.getGrid(),loc);
      
      //add more Actors to the world
      
      
      world.show();       
   }
}