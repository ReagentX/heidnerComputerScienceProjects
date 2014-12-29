import java.awt.Color;
/**
 * Write a description of class Plane here.
 * 
 * Chris Sardegna 
 * 10/22/13
 */
public class Plane
{
    Color col;
    String model;
    int engines;
    boolean isJet;
    
    public Plane(){
        
        col = Color.black;
        model = "Lear";
        engines = 8;
        isJet = true;
        
        System.out.println("Color: " + col + "\n" +
                             "Metal: " + model + "\n" +
                             "Number of Props: " + engines + "\n" +
                             "Is it a Jet? " + isJet);
    }
}
