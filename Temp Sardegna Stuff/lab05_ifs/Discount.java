//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
    //instance variables and constructors could be used, but are not really needed
    double bill;
    public Discount(double amt){
        bill = amt;
        
         if (bill >= 2000){
            double add = bill*0.15;
            double newbill = bill - add;
            System.out.println(newbill); 
            
          }
        else if (bill <= 2000){
            System.out.println(bill);   
            
        }
   
    }
    //getDiscountedBill() will return final amount of the bill
    //          if the bill is >2000, the bill receives a 15% discount
    public double getDiscountedBill(double amt)
    {
       return bill;
    }
}