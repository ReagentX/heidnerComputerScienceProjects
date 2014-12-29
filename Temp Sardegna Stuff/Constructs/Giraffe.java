
/**
 * Write a description of class Giraffe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Giraffe
{
   private int height;
    private String name;
    private boolean real;
    private double weight;
    
    public Giraffe(){
        height = 20;
        name = "Johnny";
        real = true;
        weight = 152.23;
    }
    
    public Giraffe(int a){
        height = a;
        name = "Johnny";
        real = true;
        weight = 152.32;
    }
    
    public Giraffe(int b, String c){
        height = b;
        name = c;
        real = true;
        weight = 152.32;
    }
    
    public Giraffe(int d, String e, boolean f){
        height = d;
        name = e;
        real = f;
        weight = 152.32;
    }
    
    public Giraffe(int g, String h, boolean i, double j){
        height = g;
        name = h;
        real = i;
        weight = j;
    }
   
    public String toString(){
        String output = "";
        output += "Total height: " + height;
        output += "\nName: " + name;
        output += "\nIs real: " + real;      
        output += "\nTotal weight: " + weight;  
        return output;

    }
     
    public static void main(String[] args){
        Giraffe zero = new Giraffe();
        System.out.println(zero.toString());
        Giraffe one = new Giraffe(21);
        System.out.println(one.toString());
        Giraffe two = new Giraffe(19,"Chris");
        System.out.println(two.toString());
        Giraffe three = new Giraffe(32,"George",false);
        System.out.println(three.toString());
        Giraffe four = new Giraffe(12,"Goorav",true,235.12);
        System.out.println(four.toString());
    }
}
