//? A+ Computer Science
// www.apluscompsci.com

//switch case example

//Christopher Sardegna, P. 5

import static java.lang.System.*;
import java.util.Scanner;


public class SwitchCaseThree
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter your age");
        int user = keyboard.nextInt();
        int jo = user - 21;
        
        
        
        switch (user)
        {
           case 0: case 1: case 2: case 3: case 4: case 5: out.println("You are aged between 0 and 5"); break;
           case 6: case 7: case 8: case 9: case 10: case 11: out.println("You are aged between 6 and 11"); break;
           case 12: case 13: case 14: case 15: case 16: case 17: out.println("You are aged between 12 and 16"); break;
           case 18: case 19: case 20: case 21: case 22: case 23: out.println("You are aged between 18 and 23"); break;
           default :  out.println("does not equal");
        }
        if (jo >= 0){
            out.println("You can drink alcohol.");
          }
        if (18 - user <=0){
            out.println("You can drive with passangers.");
          }
        
    }
}
