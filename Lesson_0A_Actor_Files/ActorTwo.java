//© A+ Computer Science
// www.apluscompsci.com

import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class ActorTwo
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      
      Actor dude = new Actor();
      dude.setColor(Color.GREEN);
      dude.setDirection(Location.SOUTH);      
      Location loc = new Location(2,2);
      world.add(loc, dude);
      
      //create more actors
      
      //add the new actors to the world
      
      world.show();       
   }
}