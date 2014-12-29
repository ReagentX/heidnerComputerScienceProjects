//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class UpAndOverActorRunner
{
    public static void main(String[] args)
    {   
        ActorWorld world = new ActorWorld();
		world.add(new Location(9, 0), new UpAndOverActor());
		world.show();
    }
}