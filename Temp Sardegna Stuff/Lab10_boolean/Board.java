//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Board extends JPanel implements MouseListener
{
	//instance variables
	private int width;
	private int height;
	private Block topLeft;
	private Block topRight;
	private Block botLeft;
	private Block botRight;

	public Board()  //constructor
	{
		width = 200;
		height = 200;
		topLeft=new Block(0,0,width/2-10,height/2-10,Color.RED);
		topRight=new Block(width/2,0,width/2-10,height/2-10,Color.GREEN);
		botLeft=new Block(0,height/2,width/2-10,height/2-10,Color.BLUE);
		botRight=new Block(width/2,height/2,width/2-10,height/2-10,Color.YELLOW);
		setBackground(Color.WHITE);
		setVisible(true);
		//start trapping for mouse clicks
		addMouseListener(this);
	}
	
   //initialization constructor
   



	public void update(Graphics window)
	{
		paint(window);
	}

   public void paintComponent(Graphics window)
   {
   	super.paintComponent(window);





   }
   
   public void swapTopRowColors()
   {
   	Color temp = topLeft.getColor();


   	repaint();
   }

   public void swapBottomRowColors()
   {



   }
   
   public void swapLeftColumnColors()
   {



   }
   
   public void swapRightColumnColors()
   {



   }

	public void mouseClicked(MouseEvent e)
	{
		int mouseX=e.getX();
		int mouseY=e.getY();
		int mouseButton = e.getButton();

		if(mouseButton==MouseEvent.BUTTON1)		//left mouse button pressed
		{










		}
		//right mouse button pressed
		
		
		
		
		
		
		
		
		
		
	}

	public void mouseEntered(MouseEvent e) { }
	public void mouseExited(MouseEvent e) { }
	public void mousePressed(MouseEvent e) { }
	public void mouseReleased(MouseEvent e) { }

   //toString
}