//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - March 6 2014
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class DoWhileLoopCircles extends Canvas
{
	public DoWhileLoopCircles()
	{
		setBackground(Color.WHITE);
	}
	
	public void paint( Graphics window )
	{
 		window.setColor(Color.WHITE);
 		window.fillRect(0,0,640,480);
 		
		window.setColor(Color.red);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		
		window.drawString("Lab 9B", 20, 40 );
	  	window.drawString("Drawing Circles Using a do while loop ", 20, 80 );
	  	drawCircles(window);
	}
	
	public void drawCircles(Graphics window)
	{
		int x =500;
		int y =95;   
		int z =40;
		int q = 0;
		
		do{
		   window.setColor(Color.BLUE);
		   x-=20;
		   y+=15;
		   z+=15;
		   q++;
		   window.drawOval( x, y, z, y/2 );
		  } while (q<=20);
		
		//add in a do
			//window.setColor(Color.BLUE);
			//drawOval(int x1, it y1, int width, int height)
			//window.drawOval( x, y, z, y/2 );
			
			//move the numbers around
		
		//add in while condition
	}	
}