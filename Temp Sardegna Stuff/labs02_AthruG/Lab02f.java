//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02f
{
    public static void main( String[] args )
   {
       Line test = new Line(1,9,14,2);
       test.calculateSlope();
       test.print();
       
       test.setCoordinates(1,7,18,3);
       test.calculateSlope();
       test.print();
       
        test.setCoordinates(6,4,2,2);
        test.calculateSlope();
        test.print();
        
        test.setCoordinates(4,4,5,3);
        test.calculateSlope();
        test.print();
        
        test.setCoordinates(1,1,2,9);
        test.calculateSlope();
        test.print();
        
        
        
    }
}