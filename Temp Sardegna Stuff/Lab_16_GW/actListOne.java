//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 3/24/14
//Class - Period 5
//Lab  -

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;
import java.util.ArrayList;
import java.awt.Color;

public class actListOne
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(10,10));
        
        ArrayList<Actor> actList = new ArrayList<Actor>();
        
        //add in least three actor references to actList
        actList.add(new Actor());
        actList.add(new Actor());
        actList.add(new Actor());
       
        //set each actor to a different color (GREEN, YELLOW, RED)  

        actList.get(0).setColor(Color.GREEN);
        actList.get(1).setColor(Color.YELLOW);
        actList.get(2).setColor(Color.RED);
           
        //use a loop to add all actor references to the world at different locations
        int[] locations = { 
                5, 4, 3,
                9, 1, 2, 
                4, 8, 8, 9
            };
        for(int i=0; i<3; i++){
            Location loc = new Location(locations[i],locations[i]);
            world.add(loc, actList.get(i));
        }

            
        world.show();
    }
}