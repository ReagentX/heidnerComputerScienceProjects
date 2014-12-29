//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
    private int x1,y1,x2,y2;

    public Distance()
    {
        x1=0;
        y1=0;
        x2=0;
        y2=0;
        
    }

    public Distance(int xOne, int yOne, int xTwo, int yTwo)
    {
        x1=xOne;
        y1=yOne;
        x2=xTwo;
        y2=yTwo;
    }

    public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
    {
        x1=xOne;
        y1=yOne;
        x2=xTwo;
        y2=yTwo;
    }

    public String determineClosest( )
    {
        double distanceA =(Math.random()*9), distanceB = 0.0;
        String result="";

      
        distanceB = Math.sqrt((Math.pow((x1-x2),2)+(Math.pow((y2-y1),2))));

        if(distanceB<distanceA){
            System.out.println("B is closer to (0,0)");
            //String result="B is closer to (0,0)";
        }
        else{
            System.out.println("A is closer to (0,0)");
            //String result="B is closer to (0,0)";
        }

        return result;
    }
    
    public String toString()
    {
        return "";
    }
}