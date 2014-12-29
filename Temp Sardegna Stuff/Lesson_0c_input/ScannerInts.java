//© A+ Computer Science  -  www.apluscompsci.com

//scanner int example

import java.util.Scanner;

public class ScannerInts
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a short (-32768 to 32767) :: ");
		short shortOne = keyboard.nextShort();
		System.out.println(shortOne);

		System.out.print("Enter an int (-2billion to 2billion):: ");
		int intOne = keyboard.nextInt();
		System.out.println(intOne);
	}
}
