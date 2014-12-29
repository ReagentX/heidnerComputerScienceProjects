//© A+ Computer Science
// www.apluscompsci.com

//comparable example three

import static java.lang.System.*;

public class ComparableThree
{
	public static void main ( String[] args )
	{
		out.println("CompareTo() returns 0 for ==");
		out.println("CompareTo() returns <0 for <");
		out.println("CompareTo() returns >0 for >");
		out.println("\n\n");

		Creature beast = new Creature(34);
		Creature monster = new Creature(90);
		
		out.println(beast);
		out.println(monster);
		
		out.println(beast.compareTo(monster));
		out.println(monster.compareTo(beast));
		out.println(monster.equals(beast));	
		out.println(monster.equals(monster));				
  }
}