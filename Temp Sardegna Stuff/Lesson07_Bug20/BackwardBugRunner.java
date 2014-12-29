//© A+ Computer Science
// www.apluscompsci.com

import java.awt.Color;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class BackwardBugRunner
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      Bug dude = new BackwardBug(Color.YELLOW);
      dude.setDirection(90);
      world.add(new Location(5,5), new Rock());
      world.add(new Location(2,5), new Flower());
      world.add(new Location(2,7), dude);
      world.add(new Location(1,5), new Rock());
      world.add(new Location(0,5), new Rock());            
      world.show();       
   }
}