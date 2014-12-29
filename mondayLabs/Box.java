import static java.lang.System.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Box
{
   //Make two constructors
  
    private String letter;
    private int sizeOfBox;
    public Box(){
        String letter = null;
        int sizeOfBox = 0;
    }
    
    public Box(String letter,int sizeOfBox){
        letter = letter;
        sizeOfBox = sizeOfBox; 
    }
    
    public String toString(){
            String output = "\nLetter :: " + letter;
            output += "\nNumber :: " + sizeOfBox;
            return output;
        }
        }