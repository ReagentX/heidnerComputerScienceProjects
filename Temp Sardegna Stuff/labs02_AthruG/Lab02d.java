//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02d
{
	public static void main( String[] args )
   {
		Cube test = new Cube();
	 	test.setSide(112);
	 	test.calculateSurfaceArea();
	 	test.print();

	 	//add more test cases
	 	test.setSide(4);
	 	test.calculateSurfaceArea();
	 	test.print();
	 	
	 	test.setSide(33);
	 	test.calculateSurfaceArea();
	 	test.print();
	 	
	 	test.setSide(50);
	 	test.calculateSurfaceArea();
	 	test.print();
	 	
	 	test.setSide(5);
	 	test.calculateSurfaceArea();
	 	test.print();
	 	
	 	test.setSide(19);
	 	test.calculateSurfaceArea();
	 	test.print();
	}
}