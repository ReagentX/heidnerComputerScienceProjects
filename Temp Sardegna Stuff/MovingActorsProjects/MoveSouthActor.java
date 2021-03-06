//� A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 10/11/13
//Class - Period 5
//Lab  -

import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class MoveSouthActor extends Actor
{
    public void act()
    {
              Location loc = this.getLocation();

      
      //locate location to the right
      
      Location loc2 = loc.getAdjacentLocation(Location.SOUTH);
      
      try {
          this.moveTo(loc2);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage() );
        }
        
      //move
      
      this.moveTo(loc2);
    }
}