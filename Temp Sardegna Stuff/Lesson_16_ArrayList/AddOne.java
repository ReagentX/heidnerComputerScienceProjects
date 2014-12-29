//© A+ Computer Science
// www.apluscompsci.com

//ArrayList add() example

import java.util.ArrayList;
import static java.lang.System.*;

public class AddOne
{
   public static void main(String args[])
	{
		ArrayList<String> words;
		words = new ArrayList<String>();

		words.add("it");
		words.add("is");
		words.add(0, "a");
		words.add(1, "lie");
		out.println(words);
	}
}