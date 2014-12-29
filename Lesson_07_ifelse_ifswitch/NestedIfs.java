//© A+ Computer Science
// www.apluscompsci.com

//nested if example

import java.util.Scanner;

public class NestedIfs
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an integer :: ");
		int num = keyboard.nextInt();

		if(num>50)
		{
		   if(num>50&&num<100)
		   {
		   	if(num>50&&num<150)
		   	{
		   		System.out.println(">50 && <150");
		   	}
		   }
		}
		
		System.out.println("\n\n");

		if(num>50)
		   if(num>60)
		   	if(num>70)
		   		System.out.println(">70");
		   	else
		   		System.out.println(">60 and <70");
			else
		   	System.out.println(">50 and <60"); 		
		else
		   System.out.println("<50"); 			
	}
}
