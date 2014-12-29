//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;

public class SpinningActorRunner
{
	public static void main(String[] args)
	{
	    ActorWorld world = new ActorWorld();
	    world.add(new Location(0, 0), new SpinningActor());
	    world.add(new Location(1, 1), new SpinningActor());
	    world.add(new Location(2, 2), new SpinningActor());
	    world.add(new Location(3, 3), new SpinningActor());
	    world.add(new Location(4, 4), new SpinningActor());
	    world.add(new Location(5, 5), new SpinningActor());
	    world.add(new Location(6, 6), new SpinningActor());
	    world.add(new Location(7, 7), new SpinningActor());
	    world.add(new Location(8, 8), new SpinningActor());
	    world.add(new Location(9, 9), new SpinningActor());
	    world.show();
	}
}