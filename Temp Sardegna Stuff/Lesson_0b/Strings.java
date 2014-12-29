//© A+ Computer Science  -  www.apluscompsci.com

//String example

public class Strings
{
	public static void main(String args[])
	{
		String dude = "hello world";
		String buddy = "whoot - \\\\\\\\\\\\";
		String guarav = "I love school";
		String tesoroIsAPoorlyDesignedSchool = "This is a long identivier, man";
		// Add 2 more buddies with their own string
		System.out.println(dude + "\n" + buddy);
		System.out.println("buddy = \\\\\\\\\\" + buddy);
		// print out all buddies each on your own line using one print statement, tho
		System.out.println(dude + "\n" + buddy + "\n" + guarav + "\n" + tesoroIsAPoorlyDesignedSchool);
	}
}
