import java.awt.Color;
/**
 * Write a description of class Car here.
 * 
 * Chris Sardegna 
 * 10/22/13
 */
public class Car
{

    Color col;
    String metal;
    int wheels;
    boolean isFast;
    
    public Car(){
        
        col = Color.green;
        metal = "aluminum";
        wheels = 6;
        isFast = true;
        
        System.out.println("Color: " + col + "\n" +
                             "Metal: " + metal + "\n" +
                             "Number of Wheels: " + wheels + "\n" +
                             "Is it fast? " + isFast);
    }
}
