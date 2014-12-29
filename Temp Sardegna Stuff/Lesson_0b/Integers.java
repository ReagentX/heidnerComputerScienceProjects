//© A+ Computer Science  -  www.apluscompsci.com

//integer example

public class Integers{

	public static void main(String args[])
	{
		int one = 120;  //legal assignment
		int two = 987123;
		int three = 999999999;
		byte bite = 99;
		long longInt = 99234423;


		System.out.println(one);
		System.out.println(two);
		System.out.println(bite);
		System.out.println(longInt);


		three = three * 3;   //creates an overflow error at runtime
		System.out.println(three);
	}
}
