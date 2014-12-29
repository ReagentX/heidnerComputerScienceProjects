//© A+ Computer Science
// www.apluscompsci.com

//switch case example

import static java.lang.System.*;

public class SwitchCaseOne
{
	public static void main(String args[])
	{
		int num = 30;
		switch (num)
		{
		   case 11 :  out.println("num == 11"); break;
		   case 22 :  out.println("num == 22"); break;
		   case 30 :  out.println("num == 30"); break;
		   case 40 :  out.println("num == 40"); break;
		   default :  out.println("does not equal");
		}
	}
}
