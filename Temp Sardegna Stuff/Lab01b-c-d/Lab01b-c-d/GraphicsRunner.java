

//Name - Chris Sardegna
//Date - 10/28/13
//Class - 5
//Lab  -

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Graphics Runner");

		setSize(WIDTH,HEIGHT);

		//getContentPane().add(new SmileyFace());

		//getContentPane().add(new BigHouse());

		//getContentPane().add(new Robot());
		
		this.getContentPane().add(new Logo());


		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}