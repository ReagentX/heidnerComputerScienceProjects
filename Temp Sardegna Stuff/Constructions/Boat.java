import java.awt.Color;
/**
 * Write a description of class Boat here.
 * 
 * Chris Sardegna 
 * 10/22/13
 */
public class Boat
{
    Color col;
    String make;
    int props;
    boolean isWet;
    
    public Boat(){
        
        col = Color.white;
        make = "Gulfstream";
        props = 4;
        isWet = true;
        
        System.out.println("Color: " + col + "\n" +
                             "Metal: " + make + "\n" +
                             "Number of Props: " + props + "\n" +
                             "Is it wet? " + isWet);
    }
}
