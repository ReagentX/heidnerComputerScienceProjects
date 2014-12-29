//A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna & Fabiola Lopez
//Date - 3/10/14
//Class - Period 5
//Lab  -

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Graphics Runner"); //page title
		setSize(WIDTH,HEIGHT); //references instance variables to create a screensize

		getContentPane().add(new Tree()); //creates a new tree object

		setVisible(true); //shows the object

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes window
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner(); //creates a new GraphicsRuner() object called run
	}
}