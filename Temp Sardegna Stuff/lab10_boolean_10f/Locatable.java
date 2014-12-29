// A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 3/13/14
//Class - Period 5
//Lab  -

import java.awt.Color;

public interface Locatable
{
    //set
    public void setPos( int x, int y);
    public void setX( int x );
    public void setY( int y );
    public void setColor(Color c);
    //get
    public int getX();
    public int getY();
    public int getWidth();
    public int getHeight();
    public Color getColor();
}