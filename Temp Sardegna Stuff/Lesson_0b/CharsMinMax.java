//© A+ Computer Science  -  www.apluscompsci.com

//characters min and max example

public class CharsMinMax
{
	public static void main(String args[])
	{
		System.out.println((int)Character.MIN_VALUE);   //prints out 0
		System.out.println((int)Character.MAX_VALUE);	 //prints out 65535

		System.out.println(Character.MIN_VALUE);   //prints out a space
		System.out.println(Character.MAX_VALUE);	 //prints out a ?

		char let = Character.MAX_VALUE;
		System.out.println(let);
	}
}