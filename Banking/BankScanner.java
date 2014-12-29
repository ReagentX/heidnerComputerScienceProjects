import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 * Write a description of class BankScanner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankScanner
{
    OnlinePurchase[] bank;
    Scanner reader;
    public void loadArray(){
        
        
        String name; 
        String t; 
        String prov; 
        String ccnum;  
        String phoneN;
        double pr;        

        try{
            reader = new Scanner(new File("cc.dat") );
        }catch(FileNotFoundException e){ System.out.println("Sorry, Can't Find the File");}

        int length = reader.nextInt();
        bank = new OnlinePurchase[length];
        int idx = 0; 
        while(reader.hasNext()){
            reader.nextLine();
            name = reader.nextLine();
            t = reader.nextLine();
            prov = reader.nextLine();
            ccnum = reader.nextLine();
            phoneN = reader.nextLine();
            pr = reader.nextDouble();
            bank[idx] = new OnlinePurchase(ccnum,name,pr,prov,t,phoneN);
            idx++;
        } 
    }

    public String toString(){
        String output = Arrays.toString(bank);
        return output;
    } 
}

