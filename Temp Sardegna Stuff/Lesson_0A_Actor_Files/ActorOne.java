//© A+ Computer Science
// www.apluscompsci.com

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class ActorOne
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      Actor dudeeeeeeeeeeeeeeeeeeeee = new Actor();
      world.add(new Location(0,0), dudeeeeeeeeeeeeeeeeeeeee);
      Actor bigManOnCampus = new Actor();
      world.add(new Location(5,4), bigManOnCampus);
      Actor breh = new Actor();
      world.add(new Location(4,8), breh);
      Actor she = new Actor();
      world.add(new Location(7,2), she);
      Actor me = new Actor();
      world.add(new Location(1,6), me);
      world.show();       
   }
}