import java.util.Scanner;

/**
 * Write a description of class Imports here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Imports
{
    public static void main(String[] args){
        Scanner keyboard1 = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);
        Scanner keyboard3 = new Scanner(System.in);
        Scanner keyboard4 = new Scanner(System.in);
        Scanner keyboard5 = new Scanner(System.in);
        Scanner keyboard6 = new Scanner(System.in);
        Scanner keyboard7 = new Scanner(System.in);
        Scanner keyboard8 = new Scanner(System.in);
              
        System.out.print("Enter an integer: "); 
        int num1 = keyboard1.nextInt();
        System.out.println(num1);
        
        System.out.print("Enter a double: "); 
        double num2 = keyboard2.nextDouble();
        System.out.println(num2);
        
        System.out.print("Enter a Float: "); 
        float num3 = keyboard3.nextFloat();
        System.out.println(num3);
        
        System.out.print("Enter a Long: "); 
        long num4 = keyboard4.nextInt();
        System.out.println(num4);
        
        System.out.print("Enter a Byte: "); 
        byte num5 = keyboard5.nextByte();
        System.out.println(num5);
        
        System.out.print("Enter a Short: "); 
        short num6 = keyboard6.nextShort();
        System.out.println(num6);
        
        System.out.print("Enter a single word String: "); 
        String string1 = keyboard7.next();
        System.out.println(string1);
        
        System.out.print("Enter a multi word String: "); 
        String string2 = keyboard8.nextLine();
        System.out.println(string2);
        
    }
}
