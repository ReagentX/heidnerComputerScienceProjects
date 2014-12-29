//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics2D;

public class MovingShapePanel extends JPanel implements Runnable
{
    private Shape sh;
    private Shape gh;
    private Shape fh;

   public MovingShapePanel()
   {
        setBackground(Color.WHITE);
        setVisible(true);

        //refer sh to a new Shape
        sh = new Shape(50,50,50,50,Color.GREEN,2,2);
        gh = new Shape(75,52,50,50,Color.BLUE,3,1);
        fh = new Shape(75,52,50,50,Color.RED,1,3);
        
        
        new Thread(this).start();
   }

   public void update(Graphics window)
   {
         paint(window);
   }

   public void paint(Graphics window)
   {
        window.setColor(Color.WHITE);
        window.fillRect(0,0,getWidth(), getHeight());
        window.setColor(Color.BLUE);
        window.drawRect(20,20,getWidth()-40,getHeight()-40);
        window.setFont(new Font("TAHOMA",Font.BOLD,18)  );
        window.drawString("MY SHAPE!",40,40);

        //tell sh to move and draw
        sh.draw(window);
        //sh.draw(window, Color.WHITE);
        sh.moveAndDraw(window);
        //sh.setX(sh.getX() + sh.getXSpeed());
        
        gh.draw(window);
        //gh.draw(window, Color.WHITE);
        gh.moveAndDrawTwo(window);
        
        fh.draw(window);
        // fh.draw(window, Color.WHITE);
        fh.moveAndDrawThree(window);
        //this code handles the left and right walls
        
        
        if(!(sh.getX()>=40 && sh.getX()<=500))
        {
            sh.setXSpeed(-sh.getXSpeed());
        }
        
        
        //add code to handle the top and bottom walls
        if(!(sh.getY()>=0 && sh.getY()<=500))
        {
            sh.setYSpeed(-sh.getYSpeed());
        }
        
        if(!(gh.getX()>=40 && gh.getX()<=500))
        {
            gh.setXSpeed(-gh.getXSpeed());
        }

        //add code to handle the top and bottom walls
        if(!(gh.getY()>=0 && gh.getY()<=500))
        {
            gh.setYSpeed(-gh.getYSpeed());
        }
        
        if(!(fh.getX()>=40 && fh.getX()<=500))
        {
            fh.setXSpeed(-fh.getXSpeed());
        }

        //add code to handle the top and bottom walls
        if(!(fh.getY()>=0 && fh.getY()<=500))
        {
            fh.setYSpeed(-fh.getYSpeed());
        }
    }

   public void run()
   {
     try{
        while(true)
        {
           Thread.currentThread().sleep(1);
            repaint();
         }
      }catch(Exception e)
      {
      }
   }
}