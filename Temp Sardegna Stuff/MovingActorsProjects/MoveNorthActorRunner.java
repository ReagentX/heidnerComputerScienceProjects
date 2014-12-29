//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;

public class MoveNorthActorRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
		world.add(new Location(9, 9), new MoveNorthActor());
		world.show();
    }
}