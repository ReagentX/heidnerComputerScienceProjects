//© A+ Computer Science
// www.apluscompsci.com

//OOP example

public class Triangle
{
   private int sideA, sideB, sideC;

   public void setSides(int a, int b, int c)
   {
   	sideA=a;
   	sideB=b;
   	sideC=c;
   }

   public void print()
   {
   	System.out.println("sides " + sideA + " " + sideB + " " + sideC);
   }
}