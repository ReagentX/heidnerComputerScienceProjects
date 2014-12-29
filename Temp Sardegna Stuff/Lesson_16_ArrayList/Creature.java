//© A+ Computer Science
// www.apluscompsci.com

//ArrayList of User-defined Classes

import static java.lang.System.*;

public class Creature implements Comparable
{
	private int size;

	public Creature(int girth) {
		size=girth;
	}

	public void setSize(int girth)
	{
		size=girth;
	}

	/*
	 * method isBig should return true if size > 75
	 * method isBig should return false if size <= 75
	*/
	public boolean isBig()
	{
		//change the return to match the comments above
		return true;
	}

	public boolean equals(Object obj)
	{
		Creature other = (Creature)obj;
		if(size==other.size)
			return true;
		return false;
	}

	public int compareTo(Object obj)
	{
		Creature other = (Creature)obj;
		if(size>other.size)
			return 1;
		else if(size<other.size)
			return -1;
		return 0;
	}

	public String toString() {
		return "" + size;
	}
}