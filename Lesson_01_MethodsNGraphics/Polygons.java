//© A+ Computer Science
// www.apluscompsci.com

//graphics example for polygons

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Canvas;

public class Polygons extends Canvas
{
	public Polygons()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.BLACK);
		window.drawString("Polygons ", 50, 50);
		
		int[] xPoints = {400,200,600};
		int[] yPoints = {100,500,500};
		int nPoints = 3;
		Polygon triangle = new Polygon(xPoints,yPoints,nPoints);

		window.setColor(Color.RED);
		window.fillPolygon(triangle);
	}
}