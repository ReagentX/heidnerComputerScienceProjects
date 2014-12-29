//© A+ Computer Science  -  www.apluscompsci.com

//scanner real example

import java.util.Scanner;

public class ScannerReals
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a float :: ");
		float flote = keyboard.nextFloat();
		System.out.println(flote);

		System.out.print("Enter a double :: ");
		double dec = keyboard.nextDouble();
		System.out.println(dec);
	}
}
