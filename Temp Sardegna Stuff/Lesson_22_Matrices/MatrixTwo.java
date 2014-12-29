//© A+ Computer Science
// www.apluscompsci.com

//Matrix instantiation example

import static java.lang.System.*;

public class MatrixTwo
{
    public static void main(String args[])
    {
        int[][] mat = {{5,7,9,2,1,9},
                {5,3,4},
                {3,7,0,8,9}};

        //         out.println(mat[2][1]);
        //         out.println(mat[1][2]);
        //         out.println(mat[0][3]);
        //         out.println(mat[2][4]);
        //         out.println(mat[7/4][0]);
        //         out.println(mat[1*2][2]);
        //         out.println(mat[0].length);

        //create a 2d array of type boolean

        boolean[][] bools = new boolean [3][3];
        //         out.println(bools[2][1]);
        //         out.println(bools[1][2]);
        //         out.println(bools[0][2]);
        //         out.println(bools[2][2]);
        //         out.println(bools[4/4][0]);
        //         out.println(bools[1*2][2]);
        //         out.println(bools[0].length);
        //controls which row for inner loop
        for(int row = 0; row < mat.length; row++){
            //prints all items in one row!
            for (int col = 0; col < mat[row].length; col++){
                out.print(mat[row][col] + "\t");
            }
            out.println();
        }
        
        for(int row = 0; row < mat.length; row++){
            //prints all items in one row!
            for (int col = 0; col < mat[row].length; col++){
                mat[row][col] = 100*3/5;
            }
            out.println();
        }
        
        
    }
}
