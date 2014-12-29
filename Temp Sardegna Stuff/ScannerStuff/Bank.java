import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

public class Bank
{
    Scanner reader;
    int[] myAcctNums;
    public Bank(){
 
    }
    
    public void loadArray(){
        try{
            reader = new Scanner(new File("bankaccts.dat"));
        }catch(FileNotFoundException e){
            System.out.println("Yo file ain't hurr");
        }
        int length = reader.nextInt();
        myAcctNums = new int[length];
        int spot = 0;
        while(reader.hasNextInt())
            myAcctNums[spot++]=reader.nextInt();
        while(reader.hasNext())
            myAcctNums[spot++]=reader.nextLine();
        while(reader.hasNext())
            myAcctNums[spot++]=reader.nextLine();    
        while(reader.hasNextDouble())
            myAcctNums[spot++]=reader.nextDouble();
    }
    
    public String toString(){
        return Arrays.toString(myAcctNums);
    }
}
