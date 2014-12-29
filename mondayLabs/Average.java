// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import static java.lang.System.*;

public class Average
{
    private String[] line;
    private String list;
    private int[] nums;
    private int number, average, newAverage;
    Scanner reader;

    //write two constructors
    public Average(){
        line = null;
        nums = null;
    }

    public Average(String l, int[] n){

    }

    //write a setLine method

    public void loadArray(){
        
        try{
            reader = new Scanner(new File("data.dat") );
        }catch(FileNotFoundException e){ System.out.println("Sorry, Can't Find the File");}

        int length = reader.nextInt();
        line = new String[length];
        int idx = 0;
        //System.out.println("test");
        reader.nextLine();
        while(reader.hasNext()){
            list = reader.nextLine();
            //System.out.println(Arrays.toString(line));
            line[idx] = list;
            idx++;
        } 
        //System.out.println(Arrays.toString(line));
        for(int i=0;i<line.length;i++){  
            System.out.println("string " + line[i]);
            String temp = line[i];

            String[] splittedPath = temp.split(" ");
            int[] nums = new int[splittedPath.length];
            for (int c = 0; c < nums.length; c++) {
                nums[c] = Integer.valueOf(splittedPath[c]);
            }
            average = 0;
            newAverage=0;
            //System.out.println("array " + Arrays.toString(nums));
            for(int spot = 0; spot < nums.length-1; spot++){
                average += nums[spot];
                newAverage = average/nums.length;
            }
            System.out.println(newAverage);
        }

    }

    private int getLowest(int min)
    {
        System.out.println("min " + min);
        return min;
    }

    public double getAverage()
    {
        double average=0.0;

        return average;
    }

    //write a getLine method

    //write a toString method

}