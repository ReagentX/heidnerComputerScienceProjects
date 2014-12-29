//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class RayCritter extends Critter
{
	//rayCritter will pick a random neighbor and eat it
	public void processActors(ArrayList<Actor> dudes)
	{
	}

	//gets a list of all vacant diagonals
	public ArrayList<Location> getMoveLocations()
	{		
		return null;
	}
	
	//if the ray is trapped(all diagonals occupied), he will teleport to any empty location in the grid
	//if the ray is not trapped, he will move to the new location
	public void makeMove(Location loc)
	{
	}
	
	public Color getColor()
	{
		return null;
	}  
}