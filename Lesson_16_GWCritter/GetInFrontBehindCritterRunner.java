//© A+ Computer Science
// www.apluscompsci.com

import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class GetInFrontBehindCritterRunner
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      Critter thang = new GetInFrontBehindCritter();
      Location loc = new Location(4,4);
      world.add(loc, thang);
      world.add(new Location(3,4), new Actor());
      world.add(new Location(5,4), new Actor());     
      world.add(new Location(4,3), new Actor());         	 
     	world.add(new Location(4,5), new Actor());   
      world.add(new Location(2,5), new Flower());
      world.add(new Location(1,1), new Bug(Color.YELLOW));
      world.show();       
   }
}