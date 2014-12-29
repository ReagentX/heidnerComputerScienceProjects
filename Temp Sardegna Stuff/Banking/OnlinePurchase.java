public class OnlinePurchase {
    String customerName; 
    double price; 
    String ccNum, provider, type, phoneNum; 
    
    public OnlinePurchase(){ 
        ccNum = "00000000000000"; 
        customerName = "";
        price = 00.0;
        phoneNum = "000-000-000"; 
        type = "empty";
        provider = "";
    }

    public OnlinePurchase(String ccnum, String name, double pr, String prov, String t, String phoneN){
        ccNum = ccnum; 
        customerName = name;
        price = pr;
        phoneNum = phoneN; 
        type = t;
        provider = prov;
    }
       
    public void deposit(){ }
    
    public void withdraw(){ }

    public String toString(){
        String output = "\nCustomer Name: " + customerName; 
        output += "\nCC Number: " + ccNum; 
        output += "\nTotal: $" + price;
        output += "\nCard Type: " + type;
        output += "\nCard Provider: " + provider;
        output += "\nCustomer Phone: " + phoneNum;
        return output;
    } 
}