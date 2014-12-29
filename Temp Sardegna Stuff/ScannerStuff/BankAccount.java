import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

public class BankAccount
{
    int acctNum;
    String acctName;
    String acctSSN;
    double acctBal;
    public BankAccount()
    {
        acctNum=00000;  
        acctName = "";
        acctSSN = "000-00-0000";
        acctBal = 00.0;
    }

    public BankAccount(int aNum, String aName, String ssn, double bal){
        acctNum=aNum;  
        acctName = aName;
        acctSSN = ssn;
        acctBal = bal;
    }

    public void deposit(){

    }

    public void withdraw(){

    }
    
    public String toString(){
        String output = "\nName: " + acctName;
        output += "\nNumber: " + acctNum;
        output += "\nSSN: " + acctSSN;
        output += "\nBalance: " + acctBal;
        
        return output;
    }
}
