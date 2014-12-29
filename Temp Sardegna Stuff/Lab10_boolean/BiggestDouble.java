//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;

public class BiggestDouble
{
    private double one,two,three,four;

    public BiggestDouble()
    {
        this(0,0,0,0);
    }

    public BiggestDouble(double a, double b, double c, double d)
    {
        one=a;
        two=b;
        three=c;
        four=d;
    }

    public void setDoubles(double a, double b, double c, double d)
    {
        one=a;
        two=b;
        three=c;
        four=d;
    }

    public double getBiggest()
    {
        System.out.println(one +" "+ two +" "+ three +" " + four);
        if(one>two && one>three && one>four){
            //System.out.println(one);
            return one;}
        if(two>one && two>three && two>four){
            //System.out.println(four);
            return two;
        }
        if(three>one && three>two && three>four){
            //System.out.println(four);
            return three;
        }
        else{
            //System.out.println(four);
            return four;
        }
    }   

    public String toString()
    {
        //System.out.println("biggest " + this.getBiggest());
        return ""+this.getBiggest();
       
    }
}