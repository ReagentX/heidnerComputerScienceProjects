import java.lang.Math;
/**
 * Write a description of class MatrixPractice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MatrixPractice

{ 

    String mat[][];

    public static void main (String [] arg)
    {
        MatrixPractice fun = new MatrixPractice();
        fun.diagonal();
        fun.words();
    }

    public void diagonal()
    {

        String [][] mat = new String[7][7]; 

        for( int r = 0; r < mat.length; r++)
        {
            for( int c = 0; c < mat[r].length; c++)
            {
                mat[r][c] = "X";
                if(c == r)
                    mat[r][c] = "O";
            }
        }

        for(String[] row : mat){
            for( String s : row) {
                System.out.print(s + " ");
            }
            System.out.println();  

        }
    }

    public void words()
    {
        String [][] mat = {{"A", " ", "B", " ", "A"}, {"L","L", " " , "I"}, {"S", " ", "T", "H"},{"R", "O", "W", "N"}}; 
        
           for(String[] row : mat){
            for( String s : row) {
                System.out.print(s + " ");
            }
            System.out.println();  

        }
        
    }    

}
