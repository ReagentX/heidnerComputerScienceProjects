//© A+ Computer Science
// www.apluscompsci.com

//ArrayList user defined classes example one

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;

public class UserClassesTwo
{
	public static void main ( String[] args )
	{
		ArrayList<Creature> creatureList = new ArrayList<Creature>();
		creatureList.add(new Creature(22));
		creatureList.add(new Creature(11));
		//add 3 more creatures to creatureList





		Collections.sort(creatureList);  		//will throw an exception until
																		//creatures are added to the array


		for(Creature it : creatureList)
		{
			out.println(it);
		}


		creatureList.get(0).setSize(41);
		out.println(creatureList.get(0).toString());		//toString called automatically
																						//but,this makes a good demo


		Creature dude = new Creature(41);
		out.println(creatureList.indexOf(dude));
		out.println(creatureList.contains(dude));
		out.println(creatureList.isEmpty());
  }
}