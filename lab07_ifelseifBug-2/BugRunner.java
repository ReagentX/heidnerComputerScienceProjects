//? A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;

public class BugRunner
{
   public static void main(String[] args)
   {
		ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(1,5));
		//add in whichever type of bug you want to test
		world.add(new Location(0, 1), new SpinningActor());
		world.show();
		//add in obstacles
		//show the world
		
   }
}