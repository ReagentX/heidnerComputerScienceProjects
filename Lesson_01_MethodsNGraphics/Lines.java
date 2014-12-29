//© A+ Computer Science
// www.apluscompsci.com

//graphics example for lines


import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Lines extends Canvas
{
	public Lines()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.BLACK);
		window.drawString("Points - Lines", 25, 50);

		window.setColor(Color.YELLOW);
		//drawLine(int x1, int y1, int x2, int y2)
		window.drawLine(300,300,400,400);

		window.setColor(Color.RED);
		window.drawLine(50,100,50,300);

		window.setColor(Color.BLUE);
		window.drawLine(100,100,100,400);

		window.setColor(Color.ORANGE);
		window.drawLine(400,200,400,201);

		window.setColor(Color.GREEN);
		window.drawLine(50,400,500,400);
	}
}