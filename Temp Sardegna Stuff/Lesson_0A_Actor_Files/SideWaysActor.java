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
      // getting this actor's location
      Location loc = this.getLocation();

      
      //locate location to the right
      
      Location loc2 = loc.getAdjacentLocation(Location.EAST);
      
      //move
      
      this.moveTo(loc2);
      
      //error trap
      
      
        
    }
}