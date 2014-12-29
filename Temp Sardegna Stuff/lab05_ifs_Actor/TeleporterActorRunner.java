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

public class TeleporterActorRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(8,8));
		world.add(new Location(1, 1), new TeleporterActor());
		world.add(new Location(3, 3), new TeleporterActor(Location.EAST,Color.ORANGE));
		world.add(new Location(4, 7), new TeleporterActor(Location.NORTHWEST,Color.ORANGE));
		world.add(new Location(6, 6), new TeleporterActor());
		world.add(new Location(4, 4), new TeleporterActor());
		world.show(); 
	}
}