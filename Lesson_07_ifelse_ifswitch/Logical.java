//© A+ Computer Science
// www.apluscompsci.com

//logical operator example

public class Logical
{
	public static void main(String args[])
	{
		int height=6;
		int weight = 150;

		if(height>6||weight>150)
		{
		   System.out.println("big un");
		}
		else if(height<=6&&weight<=150)
		{
		   System.out.println("little un");
		}
	}
}
