import java.util.Scanner;
/**
 * Write a description of class IndexRuner here.
 * 
 * @author Chris Sardegna 
 * @version 12/11/13
 */
public class IndexRunner
{
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        String s = new String("456-4526-33345-6236");
        //String s = keyboard.nextLine();
        Index sad = new Index(s);
    }
}
