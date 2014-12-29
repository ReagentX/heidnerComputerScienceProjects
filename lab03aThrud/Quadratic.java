//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic implements TestableQuadratic
{
    private int a, b, c;
    private double rootOne;
    private double rootTwo;

    public Quadratic()
    {
        setEquation(0,0,0);
    }

    public Quadratic(int quadA, int quadB, int quadC)
    {
        a = quadA;
        b = quadB;
        c = quadC;
    }

    public void setEquation(int quadA, int quadB, int quadC)
    {
        a = quadA;
        b = quadB;
        c = quadC;
    }

    public void calcRoots( )
    {
        rootOne = ((0-b) + (Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);        
        rootTwo = ((0-b) - (Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
    }

    public void print( )
    {

        System.out.println(rootOne + "\n" + rootTwo);
    }
    
    public int getA(){
        return a;
    }
    
    public int getB(){
        return b;
    }
    
    public int getC(){
        return c;
    }
    
    public double getRootOne(){
        return rootOne;
    }
    
    public double getRootTwo(){
        return rootTwo;
    }   
}