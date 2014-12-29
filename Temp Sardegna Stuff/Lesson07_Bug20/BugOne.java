//© A+ Computer Science
// www.apluscompsci.com

import java.awt.Color;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class BugOne
{
   public static void main(String[] args)
   {
		ActorWorld world = new ActorWorld();
		Bug dude = new Bug();
		world.add(new Location(3,3), dude);
		Bug sally = new Bug(Color.GREEN);
		sally.setDirection(Location.SOUTHEAST);
		world.add(new Location(2,2), sally);
		Bug ali = new Bug(Color.ORANGE);
		ali.setDirection(Location.NORTHEAST);
		world.add(new Location(1,1), ali);
		world.show();      
   }
}