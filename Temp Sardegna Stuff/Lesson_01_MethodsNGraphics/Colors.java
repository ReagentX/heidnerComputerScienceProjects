//© A+ Computer Science
// www.apluscompsci.com

//graphics example for colors

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Colors extends Canvas
{
	public Colors()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.BLACK);
		window.drawString("Colors ", 50, 50);

								//Color( int red, int green, int blue )
		Color newColor = new Color(40,60,80);
		window.setColor(newColor);
		window.drawArc(100,100,50,50,0,-180);
		
		
		//the simple approach
		int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		newColor = new Color(red, green, blue);		
		window.setColor(newColor);
		window.fillRect(250,300,50,50);

		//the not so simple approach
		newColor = new Color(((int)(Math.random()*256)),((int)(Math.random()*256)),((int)(Math.random()*256)));
		window.setColor(newColor);
		window.fillOval(150,200,50,50);

		newColor = new Color(((int)(Math.random()*256)),((int)(Math.random()*256)),((int)(Math.random()*256)));
		window.setColor(newColor);
		window.fillOval(550,100,10,50);

		red = (int)(Math.random()*256);
		green = (int)(Math.random()*256);
		blue = (int)(Math.random()*256);
		newColor = new Color(red, green, blue);
		window.setColor(newColor);
		window.fillRect(450,200,50,50);
	}
}