//© A+ Computer Science
// www.apluscompsci.com

import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class ActorThree
{
   public static void main(String[] args)
   {
      int i = 0;

      Location loc = new Location (0,0);
      
      //Location loc = getLocation();

      
      ActorWorld grid = new ActorWorld();
      Actor dude = new Actor();
      dude.setColor(Color.ORANGE);
      dude.setDirection(Location.WEST);
      grid.add(new Location(1,2), dude);
      grid.show(); 
      
         try {
          Thread.sleep(1000);
         } catch(Exception e) {}
      

      int actRow = loc.getRow();
      int actCol = loc.getCol();
      
      if (grid.isValid(loc)){
           moveTo(new Location(row+1,col+1));
        }
        else{
           moveTo(new Location(row-1,col1)); 
        }

 
        }


   }
