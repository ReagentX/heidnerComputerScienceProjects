//© A+ Computer Science
// www.apluscompsci.com

//modifier method example
//this class runs the Calc class

import static java.lang.System.*;

public class CalcRunner
{
   public static void main(String args[])
   {
   	//instantiate a Calc object
      Calc test = new Calc();

      //comment this line and rerun the program
      test.setNums(4,9);

      test.add();
      test.print();

      test.setNums(45,92);

      test.add();
      test.print();
      
      //call setNums again
      
   }
}