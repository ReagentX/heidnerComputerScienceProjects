//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance implements TestableDistance
{
    private int xOne,yOne,xTwo,yTwo;
    private double distance;

    public Distance()
    {
        setCoordinates(0,0,0,0);
    }

    public Distance(int x1, int y1, int x2, int y2)
    {

        xOne = x1;
        yOne = y1;
        xTwo = x2;
        yTwo = y2;

    }

    public void setCoordinates(int x1, int y1, int x2, int y2)
    {

        xOne = x1;
        yOne = y1;
        xTwo = x2;
        yTwo = y2;

    }

    public void calcDistance()
    {

        distance = Math.sqrt((Math.pow((xTwo-xOne),2)+(Math.pow((yTwo-yOne),2))));

    }

    public void print( )
    {

        System.out.println(distance);

    }
    
    public int getXone(){
        return xOne;
    }
    
    public int getXtwo(){
        return xTwo;
    }
    
    public int getYone(){
        return yOne;
    }
    
    public int getYtwo(){
        return yTwo;
    }
    
    public double getDistance(){
        return distance;
    }
}