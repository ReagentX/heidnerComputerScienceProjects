//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;

public class BlinkyActor extends Actor
{
    public Color newColor, col1;   
    //make a default constructor that sets the color to a random color
    public BlinkyActor(){
        this.setColor(Color.GREEN);
    }

    //make an initialization constructor that receives a color parameter

    public BlinkyActor(Color col){
        this.setColor(col);
    }

    //make a private method that returns a random color
    private Color getRandomColor()
    {
        int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		newColor = new Color(red, green, blue);
        return newColor;
    }
    
    //act will change the color of this actor to a random color
    public void act()
    {    
       this.setColor(getRandomColor());
    }
}