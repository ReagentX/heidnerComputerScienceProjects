//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 3/27/2014
//Class - Period 5
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class WhileLoopCircles extends Canvas
{
    public WhileLoopCircles()
    {
        setBackground(Color.WHITE);
    }
    
    public void paint( Graphics window )
    {
        window.setColor(Color.white);
        window.fillRect(0,0,640,480);
        
        window.setColor(Color.red);
        window.setFont(new Font("TAHOMA",Font.BOLD,12));
        
        window.drawString("Lab 9A", 20, 40 );
        window.drawString("Drawing Circles Using a while loop ", 20, 80 );
        drawCircles(window);
    }
    
    public void drawCircles(Graphics window)
    {
        //int x = 95;
        // int y = 95;                                                                             ;

        //add in a while loop
        for (int x = 95; x<400; x=x+30){
            window.setColor(Color.BLUE);
            //drawOval(int x1, it y1, int width, int height)
            double y = Math.random()*600;
            double z = Math.random()*600;
            window.drawOval( (int)y, (int)z, 60, 60 );
        }
            //window.setColor(Color.blue);
            //drawOval(int x1, it y1, int width, int height)
           // window.drawOval( x, y, x/2, y/2 );

    }   
}