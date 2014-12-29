//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;

public class BlinkyActorRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		world.add(new Location(0, 1), new BlinkyActor());
		world.add(new Location(1, 1), new BlinkyActor());
		world.add(new Location(1, 2), new BlinkyActor());
		world.add(new Location(1, 3), new BlinkyActor());
		world.add(new Location(1, 4), new BlinkyActor());
		world.add(new Location(1, 5), new BlinkyActor());
		world.add(new Location(1, 6), new BlinkyActor());
		world.add(new Location(1, 7), new BlinkyActor());
		world.add(new Location(1, 8), new BlinkyActor());
		world.add(new Location(4, 2), new BlinkyActor(Color.ORANGE));
		world.add(new Location(6, 4), new BlinkyActor());
		world.add(new Location(2, 9), new BlinkyActor(Color.ORANGE));
		world.show(); 
	}
}