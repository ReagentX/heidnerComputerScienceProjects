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
import info.gridworld.actor.Rock;

public class RockDroppingActorRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(20,20));
		Actor dude1 = new RockDroppingActor();
		Actor dude2 = new RockDroppingActor();
		Actor dude3 = new RockDroppingActor();
		Actor dude4 = new RockDroppingActor();
		Actor dude5 = new RockDroppingActor();
		
		dude1.setColor(Color.GREEN);
		dude2.setColor(Color.RED);
		dude3.setColor(Color.PINK);
		dude4.setColor(Color.BLACK);
		
		world.add(new Location(19, 0), dude1);
		world.add(new Location(18, 0), dude2);
		world.add(new Location(19, 1), dude3);
		world.add(new Location(19, 2), dude4);
		world.add(new Location(17, 0), dude5);
	
		world.show();
	}
}