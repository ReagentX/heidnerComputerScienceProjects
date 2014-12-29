//© A+ Computer Science
// www.apluscompsci.com

import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class CritterOne
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      Critter thang = new Critter();
      world.add(new Location(1,1), thang);
      world.show();       
   }
}