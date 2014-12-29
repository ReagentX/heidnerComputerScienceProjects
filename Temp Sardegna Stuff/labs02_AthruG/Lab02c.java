//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02c
{
    public static void main( String[] args )
    {
       Average test = new Average(); 
       
       test.setNums(5,5);
       test.average();
       test.print();
       
       test.setNums(90,100.0);
       test.average();
       test.print();
       
       test.setNums(100,85.8);
       test.average();
       test.print();
       
       test.setNums(-100,55);
       test.average();
       test.print();
       
       test.setNums(15236,5642);
       test.average();
       test.print();
       
       test.setNums(1000,555);
       test.average();
       test.print();
    }
}