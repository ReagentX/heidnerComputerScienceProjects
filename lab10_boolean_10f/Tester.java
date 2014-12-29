// A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 3/13/14
//Class - Period 5
//Lab  -

import javax.swing.JFrame;
import java.awt.Component;

public class Tester extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Tester()
	{
		super("BLOCK TESTER");
		setSize(WIDTH,HEIGHT);
		
		getContentPane().add(new BlockTestTwo());		
		
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		Tester run = new Tester();
	}
}