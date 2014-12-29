//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 3/27/2014
//Class - Period 5
//Lab  -

import static java.lang.System.*;

public class ReverseNumber
{
   private int number,remainder,reverse;
   private String reversed;

    //add constructors
    public ReverseNumber(){
         number = 0;
    }
    
    //add a set method
    public ReverseNumber(int num){
        number = num;
        this.getReverse(number);
    }

    public int getReverse(int num)
    {
        int rev=0;
        number = num;
        while (number>0){
            remainder = number%10;
            reverse = reverse*10 + remainder;
            number = number/10;

            
            //number = number / 10;
            //System.out.println(number);
        }
        reversed = number+""+reversed;
        System.out.println(num + " reversed is " + reverse);
        return rev;
    }

    //add  a toString
     public String toString(){
         return number+"";
     }
    
}