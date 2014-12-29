//© A+ Computer Science
// www.apluscompsci.com

//scope and instance variable / instance field example

public class InstanceVars
{
   private int one = 8, two = 3;   	//instance variables / fields
   private int answer;	            //exist throughout the class

   public void add()
   {
      answer = one + two;
   }
   
   //add more methods for sub, mult, and div

   public void print()
   {
      System.out.println(answer);
   }

   public static void main(String args[])
   {
      InstanceVars test = new InstanceVars();
      test.add();
      test.print();
      
      //call the new methods
      //call print again and again
   }
}