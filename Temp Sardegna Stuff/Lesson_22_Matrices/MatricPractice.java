public class MatricPractice
{
    String mat[][];    
    public static void main(String[] args){
        MatricPractice run = new MatricPractice();
        run.diagonal();
        System.out.println();
        System.out.println();
        run.words();
    }

    public void diagonal(){
        //Create a 5x5 aray of string characters; entire array is one char with a doagonal of another char
        String [][] mat = new String[10][10];
        for( int r = 0; r < mat.length; r++)
        {
            for( int c = 0; c < mat[r].length; c++)
            {
                mat[r][c] = "X";
                if (c==r)
                    mat[r][c] = "O";
            }

        }
        for (String[] row : mat) {
            for (String j : row) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void words(){
        String [][] mat = {{"A"," ","B","A"},{"L","L"," ","I"},{"S"," ","T","H"},{"R","O","W","N"}};        
        for (String[] row : mat) {
            for (String j : row) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
