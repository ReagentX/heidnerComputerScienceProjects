//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;


public class CritterTriangle
{
    public static void main(String[] args)
    {
      ActorWorld world = new ActorWorld();
      world.show();
        //world?
        
      Critter dude1 = new Critter();
      dude1.setColor(Color.ORANGE);
      dude1.setDirection(Location.SOUTHWEST);      
      Location loc3 = new Location(0,4);
      world.add(loc3, dude1);
      
      Critter dude3 = new Critter();
      dude3.setColor(Color.GRAY);
      dude3.setDirection(Location.NORTH);      
      Location loc4 = new Location(1,3);
      world.add(loc4, dude3);
      
      Critter dude4 = new Critter();
      dude4.setColor(Color.BLACK);
      dude4.setDirection(Location.SOUTH);      
      Location loc5 = new Location(5,1);
      world.add(loc5, dude4);
      
      Critter dude5 = new Critter();
      dude5.setColor(Color.YELLOW);
      dude5.setDirection(Location.SOUTH);      
      Location loc6 = new Location(2,2);
      world.add(loc6, dude5);
        
      Critter dude6 = new Critter();
      dude6.setColor(Color.ORANGE);
      dude6.setDirection(Location.SOUTHWEST);      
      Location loc7 = new Location(2,6);
      world.add(loc7, dude6);
      
      Critter dude7 = new Critter();
      dude7.setColor(Color.GRAY);
      dude7.setDirection(Location.NORTH);      
      Location loc8 = new Location(3,1);
      world.add(loc8, dude7);
      
      Critter dude8 = new Critter();
      dude8.setColor(Color.BLACK);
      dude8.setDirection(Location.SOUTH);      
      Location loc9 = new Location(3,7);
      world.add(loc9, dude8);
      
      Critter dude9 = new Critter();
      dude9.setColor(Color.YELLOW);
      dude9.setDirection(Location.SOUTH);      
      Location loc10 = new Location(4,0);
      world.add(loc10, dude9);
      
      Critter dude10 = new Critter();
      dude10.setColor(Color.ORANGE);
      dude10.setDirection(Location.SOUTHWEST);      
      Location loc11 = new Location(4,1);
      world.add(loc11, dude10);
      
      Critter dude11 = new Critter();
      dude11.setColor(Color.GRAY);
      dude11.setDirection(Location.NORTH);      
      Location loc12 = new Location(4,2);
      world.add(loc12, dude11);
      
      Critter dude12 = new Critter();
      dude12.setColor(Color.BLACK);
      dude12.setDirection(Location.SOUTH);      
      Location loc13 = new Location(4,3);
      world.add(loc13, dude12);
      
      Critter dude14 = new Critter();
      dude14.setColor(Color.YELLOW);
      dude14.setDirection(Location.SOUTH);      
      Location loc15 = new Location(4,4);
      world.add(loc15, dude14);
      
      Critter dude15 = new Critter();
      dude15.setColor(Color.ORANGE);
      dude15.setDirection(Location.SOUTHWEST);      
      Location loc16 = new Location(4,5);
      world.add(loc16, dude15);
      
      Critter dude13 = new Critter();
      dude13.setColor(Color.GRAY);
      dude13.setDirection(Location.NORTH);      
      Location loc14 = new Location(4,6);
      world.add(loc14, dude13);
      
      Critter dude16 = new Critter();
      dude16.setColor(Color.BLACK);
      dude16.setDirection(Location.SOUTH);      
      Location loc17 = new Location(4,7);
      world.add(loc17, dude16);
      
      Critter dude17 = new Critter();
      dude17.setColor(Color.YELLOW);
      dude17.setDirection(Location.SOUTH);      
      Location loc18 = new Location(4,8);
      world.add(loc18, dude17);
      
      Critter dude19 = new Critter();
      dude19.setColor(Color.ORANGE);
      dude19.setDirection(Location.SOUTHWEST);      
      Location loc20 = new Location(5,1);
      world.add(loc20, dude19);
      
      Critter dude20 = new Critter();
      dude20.setColor(Color.GRAY);
      dude20.setDirection(Location.NORTH);      
      Location loc21 = new Location(5,4);
      world.add(loc21, dude20);
      
      Critter dude21 = new Critter();
      dude21.setColor(Color.BLACK);
      dude21.setDirection(Location.SOUTH);      
      Location loc22 = new Location(5,7);
      world.add(loc22, dude21);
      
      Critter dude22 = new Critter();
      dude22.setColor(Color.YELLOW);
      dude22.setDirection(Location.SOUTH);      
      Location loc23 = new Location(6,2);
      world.add(loc23, dude22);
      
      Critter dude23 = new Critter();
      dude23.setColor(Color.ORANGE);
      dude23.setDirection(Location.SOUTHWEST);      
      Location loc24 = new Location(6,4);
      world.add(loc24, dude23);
      
      Critter dude24 = new Critter();
      dude24.setColor(Color.GRAY);
      dude24.setDirection(Location.NORTH);      
      Location loc25 = new Location(6,6);
      world.add(loc25, dude24);
      
      Critter dude25 = new Critter();
      dude25.setColor(Color.BLACK);
      dude25.setDirection(Location.SOUTH);      
      Location loc26 = new Location(7,3);
      world.add(loc26, dude25);
      
      Critter dude26 = new Critter();
      dude26.setColor(Color.YELLOW);
      dude26.setDirection(Location.SOUTH);      
      Location loc27 = new Location(7,4);
      world.add(loc27, dude26);
      
      Critter dude27 = new Critter();
      dude27.setColor(Color.ORANGE);
      dude27.setDirection(Location.SOUTHWEST);      
      Location loc28 = new Location(7,5);
      world.add(loc28, dude27);
      
      Critter dude28 = new Critter();
      dude28.setColor(Color.GRAY);
      dude28.setDirection(Location.NORTH);      
      Location loc29 = new Location(8,4);
      world.add(loc29, dude28);
      
      Critter dude30 = new Critter();
      dude30.setColor(Color.BLACK);
      dude30.setDirection(Location.SOUTH);      
      Location loc31 = new Location(1,5);
      world.add(loc31, dude30);
      
      Critter dude31 = new Critter();
      dude31.setColor(Color.BLACK);
      dude31.setDirection(Location.SOUTH);      
      Location loc32 = new Location(1,4);
      world.add(loc32, dude31);
      
      
      Critter dude32 = new Critter();
      dude32.setColor(Color.BLACK);
      dude32.setDirection(Location.SOUTH);      
      Location loc33 = new Location(2,4);
      world.add(loc33, dude32);
      
      
      Critter dude33 = new Critter();
      dude33.setColor(Color.BLACK);
      dude33.setDirection(Location.SOUTH);      
      Location loc34 = new Location(3,4);
      world.add(loc34, dude33);
      
      
      Critter dude34 = new Critter();
      dude34.setColor(Color.BLACK);
      dude34.setDirection(Location.SOUTH);      
      Location loc35 = new Location(4,4);
      world.add(loc35, dude34);
      
      Critter alice = new Critter();
      alice.setColor(Color.GREEN);
      world.add(new Location (8,8), alice);
      
            Critter joe = new Critter();
      joe.setColor(Color.GREEN);
      world.add(new Location (4,4), joe);
      
            Critter john = new Critter();
      john.setColor(Color.GREEN);
      world.add(new Location (2,2), john);
      
            Critter jack = new Critter();
      jack.setColor(Color.GREEN);
      world.add(new Location (6,6), jack);
      
      
    }
}