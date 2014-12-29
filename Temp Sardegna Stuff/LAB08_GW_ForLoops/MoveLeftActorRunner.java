//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;

public class MoveLeftActorRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(11,11));
		Actor dude = new MoveLeftActor(Color.GREEN, Location.LEFT);
		world.add(new Location(7, 7), dude);
		world.add(new Location(7, 2), new Rock());
		world.add(new Location(7, 8), new Rock());		
		world.add(new Location(3,5), new MoveLeftActor(Color.RED, Location.LEFT));
		world.show(); 
	}
}