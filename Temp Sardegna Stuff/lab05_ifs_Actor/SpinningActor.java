//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class SpinningActor extends Actor
{
    public SpinningActor()
    {
    }
    
    public void act()
    {
        setDirection(this.getDirection() + 10);

    }
    
    public Color getColor()
    {
        return null;
    }
}