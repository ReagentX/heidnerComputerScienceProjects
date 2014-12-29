//© A+ Computer Science
// www.apluscompsci.com

//methods example 1

import static java.lang.System.*;

public class Chicken
{
   public void speak()
   {
      out.println("cluck-cluck");
   }

   public static void main(String[] args)
   {
      Chicken red = new Chicken();
      red.speak();
      red.speak();
      red.speak();           
   }
}