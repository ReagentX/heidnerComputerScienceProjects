//© A+ Computer Science
// www.apluscompsci.com

//Animation / Timer  Example

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;

public class Animation extends Canvas
{
	private int x;
	private int y;
	private Timer timer;
	private static final int SLEEP = 70;  //how long to wait between actions

	public Animation()
	{
		setBackground(Color.BLACK);

		x = 0;
		y = 0;

		ActionListener paintCaller = new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				repaint();  //after SLEEP milliseconds have passed - paint is called
			}
		};
		          //how often to act - what to use when acting
		timer = new Timer(SLEEP		,		paintCaller);
		timer.start();
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.RED);	
		window.drawString("Animation Timer Example",200,50);

		window.setColor(Color.GREEN);
		window.drawOval(x,y,30,30);

		window.setColor(Color.BLUE);
		window.fillRect(x+50,y+50,40,40);

		x = x+45;
		y = y+50;

		if(x>400)
		{
			x = 0;
			y = 0;
		}
	}
}