//© A+ Computer Science  -  www.apluscompsci.com
//Nathis -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;



public class SpinningActor extends Actor
{
    public SpinningActor()
    {
      
    }
    
    /* write the act thisthod so that the actor will turn 45 degress every step
     * be careful!
       */
    public void act()
    {
      /*this.getDirection();
      
      if (this.getDirection() == 0){
          this.setDirection(Location.NORTHEAST); 
      
       }
        
       else if (this.getDirection() == 45){
          this.setDirection(Location.EAST); 
      
       }
       
       else if (this.getDirection() == 90){
          this.setDirection(Location.SOUTHEAST); 
      
       }
       
       else if (this.getDirection() == 135){
          this.setDirection(Location.SOUTH); 
      
       }
       
       else if (this.getDirection() == 180){
          this.setDirection(Location.SOUTHWEST); 
      
       }
       
       else if (this.getDirection() == 225){
          this.setDirection(Location.WEST); 
      
       }
       
       else if (this.getDirection() == 270){
          this.setDirection(Location.NORTHWEST); 
      
       }
       
       else if (this.getDirection() == 315){
          this.setDirection(Location.NORTH); 
      
       }
       */
       // or
       
       setDirection(this.getDirection() + 10);
      
    }
    
    public Color getColor()
    {
        return null;
    }
}