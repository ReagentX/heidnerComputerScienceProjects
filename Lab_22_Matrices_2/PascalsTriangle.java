
//© A+ Computer Science  -  www.apluscompsci.com
//Name -Gaurav Singh
//Date -4/3/14
//Class - Period 5
//Lab  -
import java.util.Scanner;

import static java.lang.System.*;
public class PascalsTriangle
{
    private int[][] mat;
    int full,fill;
    public PascalsTriangle()
    {
        full = 0;
    }

    public PascalsTriangle(int size)
    {
        full = size;
        this.createTriangle();
    }

    public void createTriangle()
    {
        int [][] math = new int [full +1][];
        math[1] = new int[1+2];
        math[1][1] = 1;
        
        for( int x = 2; x <= full; x++)
        {
            math [x] = new int[x+2];
            for (int y = 1; y < math[x].length - 1; y++)
            {
                math[x][y] = math[x-1][y-1] + math[x-1][y];
                String yarn = Integer.toString(math[x][y]);
                int bell = yarn.length();
                if(bell > fill)
                {
                    fill = bell;
                }
            }
        }

        for(int x = 1; x <=full; x++){

            for(int z = full; z > x; z--)
                out.format("%-" + fill + "s", " ");
            for(int y = 1; y < math[x].length-1; y++){
                out.format("%-" + (fill + fill) + "s", math[x][y]);}
            out.println();
        }
        mat = math;
    }

    public String toString() 
    {
        return toString();
    }

}