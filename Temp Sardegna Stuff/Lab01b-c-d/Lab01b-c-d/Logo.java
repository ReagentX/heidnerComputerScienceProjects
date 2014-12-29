//? A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna & Austin Kang
//Date - 10/28/13
//Class - 5
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Font;
class Logo extends Canvas{
   public Logo()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);       
      setVisible(true);
   }
   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("Wasian Logo ", 35, 35 );
      redCircle(window);
      yellowCircle(window);
      greenCircle(window);
      logoText(window);
   }
   public void redCircle( Graphics window )
   {
      window.setColor(Color.RED);
      window.fillOval(100, 100, 100, 100);                
   }
   public void yellowCircle( Graphics window )
   {
      window.setColor(Color.YELLOW);
      window.fillOval(210, 100, 100, 100);
   }
   public void greenCircle( Graphics window )
   {
      window.setColor(Color.GREEN);
      window.fillOval(320, 100, 100, 100);
   }   
   public void logoText( Graphics window )
   {
      window.setColor(Color.BLACK);
	  window.setFont(new Font("chiller",Font.BOLD,70));
	  window.drawString("WASIAN", 152, 250 );
   }
}