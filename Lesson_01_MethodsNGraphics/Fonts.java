//© A+ Computer Science
// www.apluscompsci.com

//graphics example for changing fonts


import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class Fonts extends Canvas
{
	public Fonts()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.BLACK);
		window.drawString("Fonts", 50, 50);

		window.setColor(Color.BLUE);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		window.drawString("Here is the new Tahoma Font!", 100, 100 );

		window.setColor(Color.GREEN);
		window.setFont(new Font("ARIAL",Font.BOLD,24));
		window.drawString("Here is the new Arial Font!", 200, 200 );
	}
}