//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;


//This class will not compile until all 
//abstract Locatable methods have been implemented
public class Block implements Locatable
{
	//instance variables
	private int xPos;
	private int yPos;

	private int width;
	private int height;

	private Color color;

	//constructors

   //set methods
   
   
   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   //get methods
   
   //toString
      
}