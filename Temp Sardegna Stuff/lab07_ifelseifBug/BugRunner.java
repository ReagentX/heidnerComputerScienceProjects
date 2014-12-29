//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;

public class BugRunner
{
   public static void main(String[] args)
   {
		ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(20,20));
		//add in whichever type of bug you want to test
		Bug test0 = new StuckInARutBug(Color.BLUE,45);
		world.add(new Location(5, 5), test0);
		
		Bug test1 = new StuckInARutBug(Color.GREEN,45);
		world.add(new Location(8, 11), test1);
		
		Bug test2 = new StuckInARutBug(Color.ORANGE,135);
		world.add(new Location(19, 19), test2);
		
		Bug test3 = new StuckInARutBug(Color.GRAY,270);
		world.add(new Location(10, 1), test3);
		
		Bug test4 = new StuckInARutBug(Color.RED,180);
		world.add(new Location(10, 9), test4);
		
		Bug test5 = new StuckInARutBug(Color.YELLOW,180);
		world.add(new Location(6,8), test5);
		
		Bug test6 = new StuckInARutBug(Color.PINK,90);
		world.add(new Location(5, 4), test6);
		
		//world.add(new StuckInARutBug());
		//world.add(new StuckInARutBug(Color.BLUE,0));
		//add in obstacles
		
		//Rock rock1 = new StuckInARutBug();
		//world.add(new Location(3,4));

        world.add (new Location(2, 8), new Rock());
        world.add (new Location(9,10), new Rock());
        world.add (new Location(1,18), new Rock());
        world.add (new Location(10,13), new Rock());
        world.add (new Location(10,0), new Rock());
        world.add (new Location(9,1), new Rock());
        world.add (new Location(5,2), new Rock());
        world.add (new Location(5,16), new Rock());
		//world.add(new Rock(4,2));
		//show the world
		world.show();
   }
}