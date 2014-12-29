//© A+ Computer Science
// www.apluscompsci.com

//toString return method example

import static java.lang.System.*;

class Triangle
{
	private int sideA, sideB, sideC;

	public Triangle(int a, int b, int c)
	{
		sideA=a;
		sideB=b;
		sideC=c;
	}

	public String toString()
	{
		return sideA + " " + sideB + " " + sideC;
	}
}

public class ToString
{
	public static void main ( String[] args )
	{
		Triangle test = new Triangle(5,6,7);
		out.println(test);  						//how does this work??
		out.println(test.toString());  	//how does this work??

		test = new Triangle(7,8,9);
		out.println(test);  						
	}
}