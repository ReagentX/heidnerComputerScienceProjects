//© A+ Computer Science
// www.apluscompsci.com

//autobox and autounbox example

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.*;

public class AutoBoxUnbox
{
   public static void main(String args[])
	{
		Double dub = 9.3;
		double prim = dub;
		out.println(prim);

		int num = 12;
		Integer big = num;
		out.println(big.compareTo(12));
		out.println(big.compareTo(17));
		out.println(big.compareTo(10));
	}
}