//© A+ Computer Science
// www.apluscompsci.com

//graphics example for rectangles

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Rectangles extends Canvas
{
	public Rectangles()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.BLACK);
		window.drawString("Squares - Rectangles", 25, 50);

		window.setColor(Color.BLUE);
		//fillRect(int x1, int y1, int width, int height)
		window.fillRect(150, 300, 100, 20 );

		window.setColor(Color.GRAY);
		window.drawRect(200,80,50,50);

		window.setColor(Color.RED);
		window.fillRect(320,370,40,40);

		window.setColor(Color.BLUE);
		window.drawRect(100,180,50,50);

		window.setColor(Color.ORANGE);
		window.fillRect(520,250,90,20);
	}
}