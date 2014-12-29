//© A+ Computer Science
// www.apluscompsci.com

import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class ActorTwo
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      // specialist
      Actor dude = new Actor();
      dude.setColor(Color.GREEN);
      dude.setDirection(Location.SOUTH);      
      Location loc = new Location(2,2);
      world.add(loc, dude);
      
      //Stock Actor
      Actor bro = new Actor();     
      Location loc2 = new Location(5,5);
      world.add(loc2, bro);
      
      //add the new actors to the world
      Actor dude1 = new Actor();
      dude1.setColor(Color.ORANGE);
      dude1.setDirection(Location.SOUTHWEST);      
      Location loc3 = new Location(2,8);
      world.add(loc3, dude1);
      
      Actor dude3 = new Actor();
      dude3.setColor(Color.GRAY);
      dude3.setDirection(Location.NORTH);      
      Location loc4 = new Location(6,8);
      world.add(loc4, dude3);
      
      Actor dude4 = new Actor();
      dude4.setColor(Color.BLACK);
      dude4.setDirection(Location.SOUTH);      
      Location loc5 = new Location(0,0);
      world.add(loc5, dude4);
      
      Actor dude5 = new Actor();
      dude5.setColor(Color.YELLOW);
      dude5.setDirection(Location.SOUTH);      
      Location loc6 = new Location(7,3);
      world.add(loc6, dude5);
      
      world.show();       
   }
}