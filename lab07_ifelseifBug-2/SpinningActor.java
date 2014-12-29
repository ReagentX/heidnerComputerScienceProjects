
/**
 * Write a description of class SpinningActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
public class SpinningActor extends Actor
{
    public SpinningActor(){
        
    }
    
    public void act(){
        this.setDirection(this.getDirection()+Location.HALF_RIGHT);
    }
    
    public Color getColor(){
        return null;
    }
}
