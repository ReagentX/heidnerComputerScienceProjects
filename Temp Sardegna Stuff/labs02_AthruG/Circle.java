//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Circle implements TestableCircle
{
    private double radius;
    private double area;

    public void setRadius(double rad)
    {
        radius = rad;
    }

    public void calculateArea( )
    {
        area = Math.PI*radius*radius;
    }

    public void print( )
    {
        System.out.println(area);
    }
    
    public double getRadius(){
            return radius; 
       }
    
    public double getArea(){
        return area;
    }
}