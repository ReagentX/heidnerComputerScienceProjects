//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class ForLoopDemo
{
    //instance variables and constructors could be used, but are not really needed
    
    //runForLoop() will run a for loop from start to stop going up by increment
    public static void runForLoop(int start, int stop, int increment )
    {
        System.out.println("start " + start + " : stop " + stop + " : increment " + increment);
        for (int a = start; a <= stop; a = a + increment){
            System.out.print(a + " ");            
        }
        System.out.println("\n"); 
    }
}