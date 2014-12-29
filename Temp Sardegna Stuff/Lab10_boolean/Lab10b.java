//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab10b
{
    public static void main(String[] args)
    {
        BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
        //System.out.println(run);
        System.out.println("biggest = " + run.getBiggest() + "\n");

        //add more test cases
        
        BiggestDouble asdf = new BiggestDouble(14.51,6.17,71.8,1.0);
        //System.out.println(asdf);
        System.out.println("biggest = " + asdf.getBiggest() + "\n");
        
        BiggestDouble dasf = new BiggestDouble(41.15,816.7,17.8,19.0);
        //System.out.println(asdf);
        System.out.println("biggest = " + dasf.getBiggest() + "\n");
        
        BiggestDouble gfd = new BiggestDouble(884.5,16.7,7.8,9.0);
        //System.out.println(asdf);
        System.out.println("biggest = " + gfd.getBiggest() + "\n");
        
        BiggestDouble gfddf = new BiggestDouble(4.5,-456.7, 677.8, 9.0);
        //System.out.println(asdf);
        System.out.println("biggest = " + gfddf.getBiggest() + "\n");
        
        BiggestDouble sdef = new BiggestDouble(4.5, 16.7, -7.8, -9.0);
        //System.out.println(asdf);
        System.out.println("biggest = " + sdef.getBiggest() + "\n");

		
		
		
		
	}
}