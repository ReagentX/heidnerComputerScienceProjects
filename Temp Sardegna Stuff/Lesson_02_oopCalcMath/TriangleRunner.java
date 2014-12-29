//© A+ Computer Science
// www.apluscompsci.com

//OOP example

public class TriangleRunner
{
  public static void main ( String[] args )
  {
    Triangle test = new Triangle();
    test.setSides(5,6,7);
    test.print();

    test.setSides(4,4,4);
    test.print();

    test.setSides(1,56,22);
    test.print();
  }
}