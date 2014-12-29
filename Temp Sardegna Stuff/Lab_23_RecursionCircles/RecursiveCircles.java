//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 2 May 2014
//Class - Period 5
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

public class RecursiveCircles extends JPanel
{
    public RecursiveCircles()
    {
        setSize(640,480);
        setBackground(Color.WHITE);
        setVisible(true);
    }

    public void paintComponent( Graphics window )
    {
        super.paintComponent(window);
        window.setColor(Color.ORANGE);
        window.setFont(new Font("TAHOMA",Font.BOLD,12));

        window.drawString("Lab21a",20,40);
        window.drawString("Drawing Circles Using Recursion ",20,80);
        drawCircles(window,10,10);
    }

    public void drawCircles(Graphics window, int x, int y)
    {
        if( x < 400 ){//base case
        
            window.setColor(Color.BLUE);

            window.drawOval(90+x, 90+y, 20+x, 20+x);

            drawCircles(window, x+10, y+10);
        }

    }
}