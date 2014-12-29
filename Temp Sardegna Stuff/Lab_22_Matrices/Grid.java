//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Grid
{
   private String[][] grid;
   String[] values;
   int row;
   int col;

   //load vals into the rows x cols grid randomly
    public Grid(int rows, int cols, String[] vals)
    {
        row = rows;
        col = cols;
        values = vals; 
        grid[row][col];
       
    }

    //find out which of the vals occurs the most
    public String findMax(String[] vals)
    {
        return "nothing yet";
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
        return output;
    }
}