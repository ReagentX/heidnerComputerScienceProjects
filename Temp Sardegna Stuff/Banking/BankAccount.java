public class BankAccount {
    int acctNum;
    String ownerName; double balance; String ownerSSN; String type;
    public BankAccount(){ 
        acctNum = 00000; ownerName = "";
        balance = 00.0;
        ownerSSN = "000-00-000"; type = "empty";
    }

    public BankAccount(int num, String owner, double bal, String ssn, String t){
        acctNum = num;
        ownerName = owner;
        balance = bal;
        ownerSSN = ssn;
        type = t;
    }
       
    public void deposit(){ }
    
    public void withdraw(){ }

    public String toString(){
        String output = "\nAcctNum: " + acctNum; output += "\nName: " + ownerName; output += "\nBalance: " + balance;
        output += "\nSSN: " + ownerSSN;
        output += "\nType: " + type;
        return output;
    } 
}