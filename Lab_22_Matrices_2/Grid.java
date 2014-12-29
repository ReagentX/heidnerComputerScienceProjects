//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.Math;

public class Grid
{
   private String[][] grid;
   String [] values;
   
   
   //load vals into the rows x cols grid randomly
    public Grid(int rows, int cols, String[] vals)
    {
        grid = new String[rows][cols];
        for(rows = 0;  rows < grid.length; rows++)
        {
          for( cols = 0; cols < grid[rows].length; cols++)
              {
                  grid[rows][cols] = vals[(int)(Math.random()*5)];    
              }
       }
                   
     
        
    }

    //find out which of the vals occurs the most
    public String findMax(String[] vals)
    {
        return "dasf ";
            
        
    }

    //returns a count of how many times val occurs in the matrix
    private int countVals( String val )
    {
        return 0;
    }

    //display the grid
    public String toString()
    {
        String output="";
            for(int rows = 0; rows < grid.length; rows++)
        {
            for(int cols = 0; cols < grid[rows].length; cols++){    
                output += (grid[rows][cols] + "  "  ); 
                
            }
               output += "\n";
        }
        
        
        
        
        
        
        return output;
    }
}