//© A+ Computer Science
// www.apluscompsci.com

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class ActorOne
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      Actor dude = new Actor();
      world.add(new Location(0,0), dude);
      world.show();       
   }
}