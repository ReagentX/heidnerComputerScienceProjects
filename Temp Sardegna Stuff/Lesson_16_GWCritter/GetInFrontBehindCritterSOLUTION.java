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
import info.gridworld.grid.Grid;

public class GetInFrontBehindCritterSOLUTION extends Critter
{
	public GetInFrontBehindCritterSOLUTION()
	{
		setColor(Color.MAGENTA);
	}
	
   public ArrayList<Actor> getActors()
   {
   	ArrayList<Actor> actors = new ArrayList<Actor>();
   	Grid<Actor> grid = getGrid();
   	Location inFront = getLocation().getAdjacentLocation(getDirection());
   	Location behind = getLocation().getAdjacentLocation(getDirection()+180);
   	if(grid.isValid(inFront)&&grid.get(inFront)!=null)
   		actors.add(grid.get(inFront));
   	if(grid.isValid(behind)&&grid.get(behind)!=null)
   		actors.add(grid.get(behind)); 
   	return actors;  	
   }
}