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

public class MoveSouthActorRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(20,20));
		Actor dude = new MoveSouthActor();
		dude.setColor(Color.GREEN);
		world.add(new Location(7, 7), dude);
		world.show(); 
	}
}