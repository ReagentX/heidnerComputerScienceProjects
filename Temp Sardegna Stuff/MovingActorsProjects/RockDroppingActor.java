//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 10/11/13
//Class - Period 5
//Lab  -

import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class RockDroppingActor extends Actor
{
    public void act()
    {
        Grid gr = this.getGrid();
        Location loc = this.getLocation();

      //add code here
      
      Location loc2 = loc.getAdjacentLocation(Location.NORTHEAST);
      Location loc3 = loc.getAdjacentLocation(Location.SOUTHWEST);      
      
      if( gr.isValid(loc2) == true ){
        this.moveTo(loc2);
        Rock rocky = new Rock ();
        rocky.setColor(Color.BLACK);
        rocky.putSelfInGrid(gr, loc);
        
        if ( gr.isValid(loc3) == true ){
        Rock rocky2 = new Rock ();
        rocky2.setColor(Color.RED);
        rocky2.putSelfInGrid(gr, loc3);
       }    
    }
    else if(gr.isValid(loc2) == false ){
        this.moveTo(loc3);
    }
      
      //move
      /*    try {
          this.moveTo(loc2);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage() );
        }
       */
    }
}