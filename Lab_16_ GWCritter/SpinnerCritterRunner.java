//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;

public class SpinnerCritterRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(8,8));
		world.add(new Location(1, 1), new SpinnerCritter());
		Actor dude = new Actor();
		dude.setColor(Color.RED);
		world.add(new Location(0,1), dude);
		dude = new Actor();
		dude.setColor(Color.GREEN);
		world.add(new Location(1,2), dude);
		dude = new Actor();
		dude.setColor(Color.YELLOW);		
		world.add(new Location(2,1), dude);
		dude = new Actor();
		dude.setColor(Color.BLACK);
		world.add(new Location(1,0), dude);			
		world.add(new Location(3, 1), new Rock());		
		world.show(); 
	}
}