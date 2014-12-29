// A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 3/13/14
//Class - Period 5
//Lab  -

import java.awt.Canvas;
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
   
   public Board(int h, int w)  
    {
        width = h;
        height = w;
        topLeft=new Block(0,0,width/2-10,height/2-10,Color.RED);
        topRight=new Block(width/2,0,width/2-10,height/2-10,Color.GREEN);
        botLeft=new Block(0,height/2,width/2-10,height/2-10,Color.BLUE);
        botRight=new Block(width/2,height/2,width/2-10,height/2-10,Color.YELLOW);
        setBackground(Color.WHITE);
        setVisible(true);
        //start trapping for mouse clicks
        addMouseListener(this);
    }


    public void update(Graphics window)
    {
        paint(window);
    }

   public void paintComponent(Graphics window)
   {
        super.paintComponent(window);
        topRight.draw(window);
        topLeft.draw(window);
        botRight.draw(window);
        botLeft.draw(window);
   }

   public void swapTopRowColors()
   {
        Color temp = topLeft.getColor();
        Color temp2 = topRight.getColor();
        topRight.setColor(temp);
        topLeft.setColor(temp2);
        repaint();
   }

   public void swapBottomRowColors()
   {
       Color temp = botLeft.getColor();
       Color temp2 = botRight.getColor();
       botLeft.setColor(temp2);
       botRight.setColor(temp);
       repaint();
   }
   
   public void swapLeftColumnColors()
   {
       Color temp = botLeft.getColor();
       Color temp2 = topLeft.getColor();
       botLeft.setColor(temp2);
       topLeft.setColor(temp);
       repaint();
   }
   
   public void swapRightColumnColors()
   {
       Color temp = botRight.getColor();
       Color temp2 = topRight.getColor();
       botRight.setColor(temp2);
       topRight.setColor(temp);
       repaint();
   }

    public void mouseClicked(MouseEvent e)
    {
        int mouseX=e.getX();
        int mouseY=e.getY();
        int mouseButton = e.getButton();
        if(mouseButton==MouseEvent.BUTTON1){     //left mouse button pressed
            if(((mouseX>= 0 && mouseX <= topLeft.getWidth()-1) && (mouseY>= 0 && mouseY <= (topLeft.getHeight()-1))) || ((mouseX>= topRight.getX() && mouseX <= (topRight.getX()+topRight.getWidth())-1) && (mouseY>= 0 && mouseY <= (topRight.getY()+topRight.getHeight()-1)))){
                this.swapTopRowColors();
            }
            else{
                this.swapBottomRowColors();
            }
        }
        else{//right mouse button pressed
            if(((mouseX>= 0 && mouseX <= topLeft.getWidth()-1) && (mouseY>=0 && mouseY <=  (topLeft.getHeight()-1))) || ((mouseX>= botLeft.getX() && mouseX <= (botLeft.getX()+botLeft.getWidth())-1) && (mouseY>= 0 && mouseY <= (botLeft.getY()+(botLeft.getHeight()-1))))){
                this.swapLeftColumnColors();
            }
            else{
                this.swapRightColumnColors();
            }
        }
    }

    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
    public void mousePressed(MouseEvent e) { }
    public void mouseReleased(MouseEvent e) { }
}