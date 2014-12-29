//? A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 10/28/13
//Class - 5
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      //call bigHouse
      bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);
      window.fillRect( 200, 200, 400, 400 );
      
      window.setColor(Color.BLACK);
      window.fillRect( 240, 250, 100, 150 );
      
      window.setColor(Color.BLACK);
      window.fillRect( 350, 250, 100, 150 );
      
      window.setColor(Color.BLACK);
      window.fillRect( 460, 250, 100, 150 );
      
      window.setColor(Color.RED);
      window.fillRect( 350, 430, 100, 150 );
      
      window.setColor(Color.YELLOW);
      window.fillOval( 420, 500, 15, 15 );

   }
}