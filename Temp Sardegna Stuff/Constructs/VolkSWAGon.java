import java.awt.Color;
/**
 * Write a description of class Constructor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VolkSWAGon
{
    private int cylinders;
    private boolean isComfortable;
    private Color col;
   
    public VolkSWAGon(){
        cylinders = 4;
        isComfortable = false;
        col = new Color(255,255,255);
        System.out.println("SWAG HAS BEEN EXECUTED");
        
    }
    
    public VolkSWAGon(Color c, boolean b, int a){
        cylinders = a;
        isComfortable = b;
        col = c;
        System.out.println("SWAG 2 HAS BEEN EXECUTED");
    }
    
    public VolkSWAGon(Color d, boolean e){
        cylinders = 4;
        isComfortable = e;
        col = d;
        System.out.println("SWAG 2 HAS BEEN EXECUTED");
    }
    
    public String toString(){
        String output = "";
        output += "The number of cylinders: " + cylinders;
        output += "\nIs comfortable: " + isComfortable;
        output += "\nWhat color: " + col;        
        return output;

    }
    
    public static void main(String[] args){
        VolkSWAGon swag = new VolkSWAGon(); 
        System.out.println(swag.toString());
        
        VolkSWAGon swag2 = new VolkSWAGon(new Color (45,45,45),true,12); 
        System.out.println(swag2.toString());
        
        VolkSWAGon swag3 = new VolkSWAGon(new Color (21,45,76),true); 
        System.out.println(swag3.toString());
    }
}
