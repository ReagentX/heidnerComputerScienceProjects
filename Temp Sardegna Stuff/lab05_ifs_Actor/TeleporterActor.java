//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;

import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class TeleporterActor extends Actor{
Grid gr;  
public Color newColor, col1;
int randomX,randomY;
    //make a default constructor that sets the direction to WEST

    public TeleporterActor(){
        this.setDirection(Location.WEST);
        this.setColor(Color.GREEN);
    }

    
    //make an intialization constructor that receives a direction

    public TeleporterActor(int e, Color col){
        this.setDirection(e);
        this.setColor(col);
    }     
    //the act method will move this actor to a random location
    //as long as that location is valid and empty   
    
    public Color getRandomColor()
    {
        int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		newColor = new Color(red, green, blue);
        return newColor;
    }
    
    public void act()
    {
        Grid gr = this.getGrid();
        randomX = (int)(Math.random()*gr.getNumRows());
        randomY = (int)(Math.random()*gr.getNumCols());
        Location loc2 = new Location(randomX,randomY);
        
         if (gr.get(loc2) == null){
          this.moveTo(loc2);
          this.setColor(getRandomColor());
        }
         
        
    }
    
    public Color getColor()
    {
        return null;
    }
}
