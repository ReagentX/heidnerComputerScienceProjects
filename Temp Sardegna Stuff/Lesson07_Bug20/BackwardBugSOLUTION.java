//© A+ Computer Science
// www.apluscompsci.com

import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

public class BackwardBug extends Bug
{
	public BackwardBug(Color color)
	{
		super(color);
	}	
	
	public void act()
	{
		turnFour();
		if(canMove())
		{
			move();
		}
		else
		{
			turn();
		}
		turnFour();
		
		//or if you are ready for a more indepth discussion of super
		
		//turnFour();
		//super.act();
		//turnFour();
	}	
	
	public void turnFour()
	{
		turn();
		turn();
		turn();
		turn();
	}
}