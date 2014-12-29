//© A+ Computer Science  -  www.apluscompsci.com

//strong typed language example

public class MixingData
{
	public static void main(String args[])
	{
		int one = 90;
		double dec = 234;
		char letter = 'A';

		System.out.println( one );

		one = letter;  //char to int
		System.out.println( one );

		one = 'A';  //char to int
		System.out.println( one );

		System.out.println( dec );
      dec = one;  //int to double
		System.out.println( dec );

		System.out.println( letter );

		//letter = dec;  //double to int - not legal
		//System.out.println( letter );
	}
}