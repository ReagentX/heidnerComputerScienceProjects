//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line implements TestableLine
{
    private int xOne,yOne, xTwo, yTwo;
    private double slope;
    public Line(int x1, int y1, int x2, int y2)
    {
        xOne = x1;
        yOne = y1;
        xTwo = x2;
        yTwo = y2;
    }
    
    public void setCoordinates(int x1, int y1, int x2, int y2)
    {
        xOne = x1;
        yOne = y1;
        xTwo = x2;
        yTwo = y2;

    }
     
    public void calculateSlope( )
    {
        slope = ((double)(yTwo - yOne) / (xTwo - xOne));
    }

    public void print( )
    {
        System.out.println(slope);
    }
    
    public int getXOne(){
        return xOne;    
    }
    
    public int getYOne(){
        return yOne;
    }
      
   public int getXTwo(){
       return xTwo;
    }
   
   public int getYTwo(){
       return yTwo;
    }
   
    public double getSlope(){
        return slope;
    }
}