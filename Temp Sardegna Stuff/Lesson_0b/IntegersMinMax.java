//© A+ Computer Science  -  www.apluscompsci.com

//integer min and max example

public class IntegersMinMax
{
	public static void main(String args[])
	{
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);  //really really big number

		int num = Integer.MAX_VALUE;
		num=num+1;
		System.out.println(num);
		num=num-1;
		System.out.println(num);
	}
}