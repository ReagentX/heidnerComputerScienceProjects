//© A+ Computer Science
// www.apluscompsci.com

//graphics example for arcs

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Arcs extends Canvas
{
	public Arcs()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.BLACK);
		window.drawString("Arcs ", 50, 50);

		window.setColor(Color.BLUE);

		//drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
		window.drawArc(500,300,40,40,90,90);

		window.setColor(Color.GREEN);
		window.drawArc(100,100,50,50,0,-180);

		window.setColor(Color.RED);
		window.drawArc(250,100,50,50,0,270);

		window.setColor(Color.ORANGE);
		window.drawArc(50,200,50,50,180,-180);
	}
}