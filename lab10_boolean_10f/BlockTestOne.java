// A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 3/13/14
//Class - Period 5
//Lab  -

import static java.lang.System.*;
import java.awt.Color;

class BlockTestOne
{
	public static void main( String args[] )
	{
		Block one = new Block();
		out.println(one.getX() + " " + one.getY() + " " + one.getWidth() + " " + one.getHeight() + " " + one.getColor());

		Block two = new Block(50,50,30,30);
		out.println(two.getX() + " " + two.getY() + " " + two.getWidth() + " " + two.getHeight() + " " + two.getColor());

		Block three = new Block(350,350,15,15,Color.red);
		out.println(three.getX() + " " + three.getY() + " " + three.getWidth() + " " + three.getHeight() + " " + three.getColor());

		Block four = new Block(450,50,20,60, Color.green);
		out.println(four.getX() + " " + four.getY() + " " + four.getWidth() + " " + four.getHeight() + " " + four.getColor());
	}
}