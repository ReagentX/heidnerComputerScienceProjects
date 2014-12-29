//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03b
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: 45 ");
		int dist = keyboard.nextInt();

 		out.print("Enter the hours :: 0 ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: 32 ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		//add more test cases
		
		
		
		
	}
}