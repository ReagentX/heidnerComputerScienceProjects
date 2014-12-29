//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 4/16/14
//Class - Period 5
//Lab  -

import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Bug;
import info.gridworld.actor.ActorWorld;
import java.awt.Color;

public class GrubRunner
{
    public static void main(String[] args){
        ActorWorld world = new ActorWorld();
        world.add(new Location(1, 1), new Grub());
        world.add(new Location(3, 1), new Rock());
        world.add(new Location(5, 2), new Actor());
        world.add(new Location(7, 6), new Flower());
        world.add(new Location(6, 6), new Actor());
        world.add(new Location(0, 5), new Actor());
        world.add(new Location(2, 6), new Bug(Color.GREEN));
		world.add(new Location(3, 5), new Actor());				
		world.show(); 
    }
}