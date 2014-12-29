//© A+ Computer Science
// www.apluscompsci.com

import info.gridworld.grid.Location;

public class LocationOne
{
   public static void main(String[] args)
   {
        //Location locOne = new Location(); //default constructor does not exist
        //System.out.println(locOne);
        
        int theNumber = 78;
        char theLetter = 'c';
        boolean isOn = false;
        double theNumero = 45.32;
        float thePool = 45.3214f;
        String theRope = "Weave the string to make a story";
        
        Location locTwo = new Location(3,5);
        System.out.println(locTwo); 
        System.out.println(locTwo.getRow());    
        System.out.println(locTwo.getCol());                                

        Location locThree = new Location(2,9);
        System.out.println(locThree);       
        
        //instantiate and print a few more Location Objects
        
        Location locMain = new Location(1,5);
        System.out.println(locMain);    
        System.out.println(locMain.getRow());   
        System.out.println(locMain.getCol());       
        
        Location locMainTwo = new Location(5,4);
        System.out.println(locMainTwo); 
        System.out.println(locMainTwo.getRow());    
        System.out.println(locMainTwo.getCol());        
        
        Location locCows = new Location(0,6);
        System.out.println(locCows);    
        System.out.println(locCows.getRow());   
        System.out.println(locCows.getCol());       
        
   }
}