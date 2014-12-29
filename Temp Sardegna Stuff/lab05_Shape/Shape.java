//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;
    private int xSpeed;
    private int ySpeed;

   /*
    *The constructor is used to initialize all instance variables.
    *The constructor makes the object.
    */
   public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
        xPos = x;
        yPos = y;
        width = wid;
        height = ht;
        color = col;
        xSpeed = xSpd;
        ySpeed = ySpd;
   }
   
      /*
    *The draw method draws the shape on the screen.
    */
   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);
      
      //draw whatever you want
      window.setColor(Color.BLUE);
      window.fillOval(xPos+250, yPos+100, 300, 200);
      
      window.setColor(Color.RED);
      window.fillOval(xPos+310, yPos+140, 50, 50);
      
      window.setColor(Color.RED);
      window.fillOval(xPos+430, yPos+140, 50, 50);
      
      window.setColor(Color.GRAY);
      window.fillOval(xPos+385, yPos+190, 20, 20);
      
      window.setColor(Color.BLACK);
      window.fillRect(xPos+310, yPos+240, 190, 15 );
   }

   /*
    *This draw method will be used to erase the shape.
    */
   public void draw(Graphics window, Color col)
   {
      window.setColor(col);
      window.fillRect(xPos, yPos, width, height);
      draw(window);
   }
   
   public void moveAndDraw(Graphics window)
   {
        xPos = xPos+xSpeed;
        yPos = yPos+xSpeed;
        
        System.out.println(xPos);
        //                 while(xPos>=0){               
        //             xPos = xPos+2;    
        //             if(xPos>600){
        //                xPos = xPos-2;
        //             }
        //         }
        //         xPos = xPos+2;
        //         while(xPos<=600)        
        //         {
        //             xPos = xPos-2;
        //         }
        //         
        //         
        //         //add code to handle the top and bottom walls
        //         while(yPos>=100 && yPos<=500)
        //         {
        //             yPos = 0-yPos;
        //         }
   }
   
   public void moveAndDrawTwo(Graphics window)
   {
        xPos = xPos+xSpeed;
        yPos = yPos+ySpeed;
   }
   
   public void moveAndDrawThree(Graphics window)
   {
        xPos = xPos+xSpeed;
        yPos = yPos+ySpeed;
   }
   //add in set and get methods for xPos, yPos, xSpeed, and ySpeed
   

   public void setX( int x )
   {
     xPos = x;
        
   }
   public int getX()
   {
       return xPos;
   }
   public int getY()
   {
     return yPos;
   }

   public void setY( int y )
   {
     yPos = y;
   }
   
   public int getXSpeed()
   {
     return xSpeed;
   }

   public void setXSpeed( int xSpd )
   {
      xSpeed = xSpd;
        
   }
   public int getWidth()
   {
     return width;
   }

   public void setWidth( int wid )
   {
      width = wid;
        
   }
   public int getYSpeed()
   {
     return ySpeed;
   }

   public void setYSpeed( int ySpd )
   {
     ySpeed = ySpd;
   }
   
   public String toString()
   {
    return xPos+" "+yPos+" "+width+" "+height+" "+color+" "+xSpeed+" "+ySpeed;
   }
}