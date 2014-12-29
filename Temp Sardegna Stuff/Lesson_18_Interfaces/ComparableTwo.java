//© A+ Computer Science
// www.apluscompsci.com

//comparable example two

import static java.lang.System.*;

public class ComparableTwo
{
	public static void main ( String[] args )
	{
		out.println("CompareTo() returns 0 for ==");
		out.println("CompareTo() returns <0 for <");
		out.println("CompareTo() returns >0 for >");
		out.println("\n\n");

		Comparable x = 15;
		Comparable y = new Integer("123");
		out.println("Integer " + x + " compareTo( ) " + y + " == " + x.compareTo(y));
		out.println();

		x = new String("81");
		y = "709";
		out.println("String " + x + " compareTo( ) " + y + " == " + x.compareTo(y));
		out.println();

		x = new Double("1.34");
		y = 21.54;
		out.println("Double " + x + " compareTo( ) " + y + " == " + x.compareTo(y));
		out.println();


		//Class Cast Exception thrown
		try{
			x = new Double("1.34");
			y = new String("1.2342");
			out.println("Double " + x + " compareTo( ) " + y + " == " + x.compareTo(y));
			out.println();
		}
		catch( ClassCastException  e){
			out.println("THIS demo caused an exception to be thrown!!!");
			out.println("You cannot compare a DOUBLE to a STRING!!\n\n\n");
		}
		catch( Exception  e){
			out.println("THIS demo caused an exception to be thrown!!!");
			out.println("This catches general exceptions!!\n\n\n");
		}
		finally
		{
			out.println("Please visit THIS demo again!!!");
		}
  }
}