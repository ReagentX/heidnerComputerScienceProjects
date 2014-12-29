//© A+ Computer Science
// www.apluscompsci.com

//nested if / dangling else statement example

import static java.lang.System.*;

public class DanglingElse
{
	public static void main(String args[])
	{
		int num=35;  	//change the value of num and rerun the program
		
		if(num>10){		//take the braces off and rerun the program
		   if(num<25)
		      out.println("jump");
		}else
		   out.println("run");
	}
}

