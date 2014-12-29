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
      ActorWorld worldZ = new ActorWorld();
        world.show();     
      worldZ.show();  
      
      
      Actor dude = new Actor();
      dude.setColor(Color.YELLOW);
      dude.setDirection(Location.SOUTH);
      Location loc = new Location(1,4);
      dude.putSelfInGrid(world.getGrid(),loc);
      dude.moveTo(worldZ);
      
      Actor bro = new Actor();
      bro.setColor(Color.GREEN);
      bro.setDirection(Location.SOUTH);
      Location loc2 = new Location(2,6);
      bro.putSelfInGrid(worldZ.getGrid(),loc2);
      dude.moveTo(world);
      
      //add more Actors to the world
      
      
  
   }
}