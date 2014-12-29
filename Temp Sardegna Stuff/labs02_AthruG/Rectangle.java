//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

public class Rectangle implements TestableRect
{
    private int length;
    private int width;
    private int per;
    public void setLengthWidth(int len, int wid )
    {
        length=len;
        width=wid;
    }

    public void calculatePerimeter( )
    {
        per = length + length + width + width;
    }

    public void print( )
    {
        System.out.println("Area: " + length*width);
        System.out.println("Perimeter: " + per);
    }
    
    public int getLength(){
       return length; 
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getPerimeter(){
        return per;
    }
}