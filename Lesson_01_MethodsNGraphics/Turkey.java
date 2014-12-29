import java.util.Scanner;
//? A+ Computer Science
// www.apluscompsci.com

//methods example 2 and 3

// Chris Sardegna Period 5

import static java.lang.System.*;

public class Turkey
{
   public void speak()
   {
      out.println("gobble-gobble");
   }

   public void sayName()
   {
      out.println("big bird");
      
      
   }   
   
   public void openBeak()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("What should the chicken do with its beak? : "); 
      String string1 = keyboard.next();
      if (string1 == "open"){
          System.out.println("Beak is open");
        }
      else if (string1 != ("open")) {
          System.out.println("Beak is closed.");  
        }
      
   } 
   
   public void turnAround()
   {
      out.println("Ashes, ashes, we all fall down!");
      
      
   } 
   
   public void addNumber()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter an integer: "); 
      int num1 = keyboard.nextInt();
      System.out.print("Enter an integer: "); 
      int num2 = keyboard.nextInt();
      System.out.println(num1+num2);
      
   } 
}