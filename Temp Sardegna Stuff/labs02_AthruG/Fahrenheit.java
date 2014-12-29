//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit implements TestableF 
{
    private double fahrenheit;

    public void setFahrenheit(double fahren)
    {
        fahrenheit = fahren;
    }

    public double getCelsius()
    {
        double celsius;
        celsius = (fahrenheit-32)*5/9;
        //add code to convert fahrenheit to celsius
        return celsius;
    }

    public void print()
    {
        //this is part of the solution
        System.out.println(getCelsius());
    }
    
    public double getfahrenheit(){
        return fahrenheit;
    }
}