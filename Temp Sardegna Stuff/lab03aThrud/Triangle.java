//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.lang.Math.*;

public class Triangle implements TestableTriangle
{
    private int sideA, sideB, sideC;
    private double perimeter;
    private double theArea;
    private double s;

    public Triangle()
    {
       setSides(0,0,0);
       perimeter=0;
       theArea=0;
    }

    public Triangle(int a, int b, int c)
    {
        sideA = a;
        sideB = b;
        sideC = c;

    }


    public void setSides(int a, int b, int c)
    {
      sideA = a;
      sideB = b;
      sideC = c;

    }

    public void calcPerimeter( )
    {
        perimeter = (double)sideA + (double)sideB + (double)sideC;
        

    }

    public void calcArea( )
    {
        s = 0.0;
        s = perimeter/2; 
        theArea = Math.sqrt(s*(s - sideA)*(s - sideB)*(s - sideC));

    }

    public void print( )
    {


        System.out.println("\n\n");
    }
    
     public int getSideA()
     {
      return sideA;   
     }
    
     public int getSideB()
     {
      return sideB;   
     }
     
    public int getSideC()
    {
      return sideC;
    }
    
    public double getPerimeter()
    {
      return perimeter;
    } 
    
    public double getTheArea()
    {
      return theArea;
    }
}