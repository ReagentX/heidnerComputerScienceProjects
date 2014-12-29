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

public class UpAndOverActor extends Actor
{
	public void act()
	{
	  Grid gr = getGrid();
	    Location loc = this.getLocation();
	    Location orig = new Location(8,0);

      
      //locate location to the right
      
      Location loc2 = loc.getAdjacentLocation(Location.NORTHEAST);
      
      if (gr.isValid(loc2) == true){
          this.moveTo(loc2);
        }
      else if (gr.isValid(loc2) == false){
          this.moveTo(orig);
        }
	}
}