//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
    public static void main( String[] args )
   {
        //add test cases
        Scanner keyboard = new Scanner(in);

		out.print("Enter A ::  ");
		int quadA= keyboard.nextInt();

 		out.print("Enter B :: ");
		int quadB = keyboard.nextInt();

		out.print("Enter C ::  ");
		int quadC = keyboard.nextInt();
		
		Quadratic test = new Quadratic(quadA, quadB, quadC);
		test.calcRoots();
		test.print();
    
        
        
    }
}