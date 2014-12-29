//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;

public class BlockGame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public BlockGame()
	{
		super("Board");
		setSize(WIDTH,HEIGHT);
						
		getContentPane().add(new Board(500,500));
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		BlockGame run = new BlockGame();
	}
}