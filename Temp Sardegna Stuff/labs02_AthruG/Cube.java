//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Cube implements TestableCube
{
    private int side;
    private int surfaceArea;

    public void setSide(int s)
    {
        side = s;
    }

    public void calculateSurfaceArea( )
    {
        surfaceArea = 6*(int)Math.pow(side,2);
    }

    public void print( )
    {
        System.out.println(surfaceArea);
    }
    public int getSide(){
            return side;
       }
    
    public int getSurfaceArea(){
        return surfaceArea;
    }
}