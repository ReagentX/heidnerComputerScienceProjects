//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.lang.Math.*;

public class Lab03a  //this class is used to test Triangle
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		//ask for user input
		System.out.print("Enter side A ::  ");
		int a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		int b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		int c = keyboard.nextInt();


		Triangle test = new Triangle(a, b, c);
		test.calcPerimeter();
		test.calcArea();
		test.print();


		//ask for user input
		System.out.print("Enter side A :: 7 ");
		a = keyboard.nextInt();

		System.out.print("Enter side B :: 8 ");
		b = keyboard.nextInt();

		System.out.print("Enter side C :: 9 ");
		c = keyboard.nextInt();


		test.setSides(a,b,c);
		test.calcPerimeter();
		test.calcArea();
		test.print();


		//add one more input section
        System.out.print("Enter side A :: 10 ");
		a = keyboard.nextInt();

		System.out.print("Enter side B :: 9 ");
		b = keyboard.nextInt();

		System.out.print("Enter side C :: 11 ");
		c = keyboard.nextInt();


		test.setSides(a,b,c);
		test.calcPerimeter();
		test.calcArea();
		test.print();



	}
}