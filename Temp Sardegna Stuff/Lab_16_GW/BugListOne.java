//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 3/24/14
//Class - Period 5
//Lab  -

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;
import java.util.ArrayList;
import java.awt.Color;
import java.lang.Math;

public class BugListOne
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(10,10));
        world.show();
        //define and instantiate and ArrayList that can store Bug references
        ArrayList<Bug> bugList = new ArrayList<Bug>();    
        //add in three Bug references to bugList
        bugList.add(new Bug());
        bugList.add(new Bug());
        bugList.add(new Bug());
        //set each Bug to a different color (GREEN, YELLOW, RED)    
        bugList.get(0).setColor(Color.GREEN);
        bugList.get(1).setColor(Color.YELLOW);
        bugList.get(2).setColor(Color.RED);
        //set each Bug to a unique direction (SOUTH, EAST, WEST, etc)   
        bugList.get(0).setDirection(Location.SOUTH);
        bugList.get(0).setDirection(Location.EAST);
        bugList.get(0).setDirection(Location.WEST);
        //use a loop to add all actor references to the world at different locations
        int[] locations = { 5, 4, 3, 9, 1, 2, 4, 8, 8, 9 };
        for(int i=0; i<3; i++){
            Location loc = new Location(locations[i],locations[i]);
            world.add(loc, bugList.get(i));
        }
    }
}