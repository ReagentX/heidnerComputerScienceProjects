//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 10/25/13
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
       System.out.println("********************");
   }

   public void printTwentyDashes()
   {
       System.out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
       System.out.println("\n\n");
   }
   
   public void printASmallBox()
   {
       this.printTwentyDashes();
       this.printTwentyStars();
       this.printTwentyDashes();
       this.printTwentyStars();
       this.printTwentyDashes();
       this.printTwentyStars();
       this.printTwoBlankLines();
   }
 
   public void printABigBox()
   {
       this.printTwentyDashes();
       this.printTwentyStars();
       this.printTwentyDashes();
       this.printTwentyStars();
       this.printTwentyDashes();
       this.printTwentyStars();
       this.printTwentyDashes();
       this.printTwentyStars();
       this.printTwentyDashes();
       this.printTwentyStars();
       this.printTwentyDashes();
       this.printTwentyStars();
   }   
}