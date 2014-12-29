//© A+ Computer Science
// www.apluscompsci.com

//double buffering example

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.Canvas;

public class DoubleBuffer extends Canvas
{
	private BufferedImage back;
	
	public DoubleBuffer()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current Frame and same it as an image
		//that is the exact same width and height as the current Frame
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.RED);
		
		for (int count=50; count<getWidth()/2; count+=20)
		{
			graphToBack.fillRect(count, count, 15, count/2);
		}

		//load the background image as the forground image
		//loading all changes as one image reduces flicker
		twoDGraph.drawImage(back, null, 0, 0);
	}
}