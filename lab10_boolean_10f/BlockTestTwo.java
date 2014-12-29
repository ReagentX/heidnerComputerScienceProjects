// A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 3/13/14
//Class - Period 5
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class BlockTestTwo extends JPanel
{
	public BlockTestTwo()
	{
		setBackground(Color.white);
	}

	public void paintComponent(Graphics window)
	{
		super.paintComponent(window);
		Block one = new Block();
		one.draw(window);

		Block two = new Block(50,50,30,30);
		two.draw(window);

		Block three = new Block(350,350,15,15,Color.red);
		three.draw(window);

		Block four = new Block(450,50,20,60, Color.green);
		four.draw(window);
		
		//add more test cases			
	}
}