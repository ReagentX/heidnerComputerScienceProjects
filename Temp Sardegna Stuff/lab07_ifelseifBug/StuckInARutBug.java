//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

public class StuckInARutBug extends Bug
{
    //make a constructor that takes in a Color and a direction
    public StuckInARutBug(){  
         this.setColor(Color.GREEN);
         this.setDirection(45);         
    }
    
    public StuckInARutBug(Color col, int dir){  
         this.setColor(col);
         this.setDirection(dir);
    }
    
   
    //override the turn method
    public void turn(){
        if(this.canMove()){
            this.move();
        }
        else{
            this.setDirection(this.getDirection()+180);
        }
    }
    
    public void act(){
        this.turn();
    }
}
