import java.awt.Color;
/**
 * Write a description of class Die here.
 * 
 * Chris Sardegna 
 * 10/22/13
 */
public class Die
{
    // Instance Variables/class variables/fields/characteristics
    //always at the top of the class
    Color col;
    String texture;
    int sides;
    boolean isSquishy;
    // Constructor - always stats with public followed by the exact name of the class
    // Executes when a 'new' object of this type is creeated
    public Die(){
        
        col = Color.pink;
        texture = "furry";
        sides = 6;
        isSquishy = true;
        
        System.out.println("Color: " + col + "\n" +
                             "Texture: " + texture + "\n" +
                             "Number of Sides: " + sides + "\n" +
                             "Is it squishy? " + isSquishy);
    }
}
