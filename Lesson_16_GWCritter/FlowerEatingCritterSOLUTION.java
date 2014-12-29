//© A+ Computer Science
// www.apluscompsci.com

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class FlowerEatingCritterSOLUTION extends Critter
{
	public FlowerEatingCritterSOLUTION()
	{
		setColor(Color.RED);
	}
	
   public void processActors( ArrayList<Actor> actors)
   {
		for(Actor thing : actors)
		{
			if(thing instanceof Flower)
				thing.removeSelfFromGrid();
		}
   }
}