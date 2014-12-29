// A+ Computer Science
// www.apluscompsci.com

//graphics example for circles/ovals

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Circles extends Canvas
{
	public Circles()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.BLACK);
		window.drawString("Circles - Ovals", 50, 50);

		window.setColor(Color.BLUE);

		//drawOval(int x1, int y1, int width, int height)
		window.drawOval(500,300,40,40);

		window.setColor(Color.GREEN);
		window.drawOval(400,100,100,50);

		window.setColor(Color.YELLOW);
		window.fillOval(250,250,90,90);

		window.setColor(Color.RED);
		window.fillOval(50,150,50,50);

		window.setColor(Color.BLUE);
		window.fillOval(150,350,120,80);
	}
}