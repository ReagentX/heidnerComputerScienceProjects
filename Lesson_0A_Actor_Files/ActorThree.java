//© A+ Computer Science
// www.apluscompsci.com

import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class ActorThree
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      Actor dude = new Actor();
      dude.setColor(Color.ORANGE);
      dude.setDirection(Location.WEST);
      world.add(new Location(1,2), dude);
      dude.moveTo(new Location(6,7));
      dude.moveTo(new Location(8,7));
		world.show();       
   }
}