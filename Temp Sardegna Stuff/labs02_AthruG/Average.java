//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Average implements TestableAverage
{
    //instance variables
    private double one, two, average;

    public void setNums(double num1, double num2)
    {
        one = num1;
        two = num2;
    }

    public void average( )
    {
        double sum=0;
        average = ((double)one+(double)two)/2;

    }
    public void print( )
    {
        System.out.println(average);
    }
    
    public double getOne(){
        return one;
    }
    
    public double getTwo(){
        return two;
    }
    
    public double getAverage(){
        return average;
    }
}