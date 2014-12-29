//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Collections;
import java.util.ArrayList;
import static java.lang.System.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class InsertionSortRunner
{
    String name; 	
    Scanner reader;
    public static void main(String args[])
    {
        ArrayList<String> result = new ArrayList<String>();
        Scanner reader = new Scanner();
        try{
            Scanner reader = new Scanner(new File("cc.dat") );
        }catch(FileNotFoundException e){ System.out.println("Sorry, Can't Find the File");}

        while(reader.hasNext()){
            name = reader.nextLine();
            list.add(name);
        } 
    }
}