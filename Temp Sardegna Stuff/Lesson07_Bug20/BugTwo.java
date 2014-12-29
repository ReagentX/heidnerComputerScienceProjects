//© A+ Computer Science
// www.apluscompsci.com

import java.awt.Color;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class BugTwo
{
   public static void main(String[] args)
   {
		ActorWorld world = new ActorWorld();
		Bug dude = new Bug(Color.GREEN);
		dude.setDirection(Location.NORTHWEST);

		Location loc = new Location(5,5);
		world.add(loc , new Rock());

		loc = new Location(2,5);
		world.add(loc, new Flower());

		loc = new Location(2,7);
		world.add(loc, dude);

		world.show();       
   }
}