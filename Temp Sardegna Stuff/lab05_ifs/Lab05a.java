//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05a 
{
    public static void main( String args[] )
    {
        Scanner keyboard = new Scanner(System.in);
        
        out.print("Enter the original bill amount :: ");
        double amt = keyboard.nextDouble();
        
        Discount jay = new Discount(amt);
    }
}