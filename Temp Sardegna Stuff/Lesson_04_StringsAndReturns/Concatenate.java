//© A+ Computer Science
// www.apluscompsci.com

//String concatenation example

import static java.lang.System.*;

public class Concatenate
{
   public static void main( String args[] )
   {
		String one = "comp";
		String two = "-sci";
					
		String s = one.substring(0,4) + two;  //adding strings together
		out.println(s);
		out.println(s.length());

		String what = s.concat(two);		//adding strings together
		out.println(what);
		out.println(what.length());
	}
}