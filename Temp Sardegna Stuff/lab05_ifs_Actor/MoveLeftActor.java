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

public class MoveLeftActor extends Actor
{
    public void act(){
      Grid gr = getGrid();    // getting this actor's location
      Location loc = this.getLocation();
      Location orig = new Location(0,9);
      
      //locate location to the right
      
      Location loc2 = loc.getAdjacentLocation(Location.WEST);
      
      if (gr.isValid(loc2) == true){
          this.moveTo(loc2);
        }
      else if (gr.isValid(loc2) == false){
          this.moveTo(orig);
        }
    }
}