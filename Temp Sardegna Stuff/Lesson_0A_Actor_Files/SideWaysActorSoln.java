//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class SideWaysActor extends Actor
{
	public void act()
	{
		Location loc = getLocation();
		//int row = loc.getRow();
		//int col = loc.getCol();
		//moveTo(new Location(row,col+1));
		
		//or
		//moveTo(loc.getAdjacentLocation(Location.EAST));
		
		
		//optional blow-up prevention
		Grid<Actor> grid = getGrid();
		Location newLoc = loc.getAdjacentLocation(Location.EAST);
		if(grid.isValid(newLoc))
		{
			moveTo(newLoc);
		}
		else
		{
			moveTo(new Location(loc.getRow(),0));
		}
	}
}