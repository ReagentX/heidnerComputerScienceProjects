//? A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 10/28/13
//Class - 5
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);       
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      //call other methods
      upperBody(window);
      lowerBody(window);
   }

   public void head( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.fillOval(250, 100, 300, 200);
      
      window.setColor(Color.RED);
      window.fillOval(310, 140, 50, 50);
      
      window.setColor(Color.RED);
      window.fillOval(430, 140, 50, 50);
      
      window.setColor(Color.GRAY);
      window.fillOval(385, 190, 20, 20);
      
      window.setColor(Color.BLACK);
      window.fillRect(310, 240, 190, 15 );


        //add more code here
                
   }

   public void upperBody( Graphics window )
   {
      window.setColor(Color.GREEN);
      window.fillOval(250, 300, 300, 250);
      
      window.setColor(Color.GRAY);
      window.fillRect(315, 340, 170, 170 );
      
      window.setColor(Color.RED);
      window.fillOval(51, 400, 200, 20);
      
      window.setColor(Color.RED);
      window.fillOval(549, 400, 200, 20);
           
      window.setColor(Color.BLACK);
      window.fillOval(390, 370, 20, 20);
      window.setColor(Color.BLACK);
      window.fillOval(390, 400, 20, 20);      
      window.setColor(Color.BLACK);
      window.fillOval(390, 430, 20, 20);
      window.setColor(Color.BLACK);
      window.fillOval(390, 460, 20, 20);
        //add more code here
   }

   public void lowerBody( Graphics window )
   {

      window.setColor(Color.PINK);
      window.fillOval(250, 500, 300, 300);
      
      window.setColor(Color.CYAN);
      window.fillRect(395, 530, 10, 250 );
      
      window.setColor(Color.ORANGE);
      window.fillOval(335, 780, 15, 150);
      
      window.setColor(Color.ORANGE);
      window.fillOval(460, 780, 15, 150);

   }
}