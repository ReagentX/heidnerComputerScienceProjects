//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Sum implements TestableSum
{
    //instance variables
    private double one, two, sum;

    public void setNums(double num1, double num2)
    {
        one = num1;
        two = num2;
    }

    public void sum( )
    {
        sum = one+two;
    }

    public void print( )
    {
        System.out.println(sum);
    }
    
    public double getOne(){
            return one;
       }
    
    public double getTwo(){
            return two;
       }
    
    public double getSum(){
            return sum;
       }
    
}