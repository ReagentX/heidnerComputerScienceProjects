//© A+ Computer Science
// www.apluscompsci.com

import java.awt.Color;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class FlowerEatingCritterRunner
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      Critter thang = new FlowerEatingCritter();
      Location loc = new Location(2,2);
      world.add(loc, thang);
      world.add(new Location(5,5), new Flower());
      world.add(new Location(2,5), new Flower());
      world.add(new Location(1,1), new Bug(Color.YELLOW));
      world.show();       
   }
}