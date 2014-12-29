import java.*;
/**
 * Write a description of class MathStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MathStuff
{
    // instance variables - replace the example below with your own
    private int x, y;
    private double d;
    
    /**
     * Constructor for objects of class MathStuff
     */
    public MathStuff()
    {
        // initialise instance variables
        x = 256;
        y = 5;
        d = 10.12;
    }

    public double sampleMethod(int y)
    {
        // put your code here
        d += y;
        return Math.sqrt(64) + y;
    }
    
    // to create a string of the instance variables 
    public String toString(){
        String output = "";
        output += "x: " + x +"\n";
        output += "y: " + y +"\n";
        output += "d: " + d;
        return output;
    }
    
    public static void main(String[] args){
        MathStuff myMath = new MathStuff();
        System.out.println(myMath.sampleMethod(100));
        System.out.println(myMath.toString());
    }
}
