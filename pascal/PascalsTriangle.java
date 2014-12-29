// A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 4/3/14
//Class - Period 5
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangle
{
    private int[][] mat;
    int ROW,max;

    public PascalsTriangle(){
        ROW=0;
        //this.createTriangle();
    }

    public PascalsTriangle(int size){
        ROW=size;
        this.createTriangle();
    }

    public void createTriangle(){
        int[][] pascal  = new int[ROW +1][];
        pascal[1] = new int[1 + 2];
        pascal[1][1] = 1;
        for (int i = 2; i <= ROW; i++) {
            pascal[i] = new int[i + 2];
            for (int j = 1; j < pascal[i].length - 1; j++) {
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                String str = Integer.toString(pascal[i][j]);
                int len = str.length();
                if (len > max)
                    max = len;
            }
        }
        for (int i = 1; i <= ROW; i++) {                
            for (int k = ROW; k > i; k--)
                System.out.format("%-" + max + "s", " ");
            for (int j = 1; j < pascal[i].length - 1; j++)                      
                System.out.format("%-" + (max + max) + "s",  pascal[i][j]);
            System.out.println();
        }
        mat=pascal;
    }

    public String toString(){
        return mat.toString();
    }
}