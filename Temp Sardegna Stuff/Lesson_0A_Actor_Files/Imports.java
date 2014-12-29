import java.util.Scanner;
/**
 * Write a description of class Imports here.
 * 
 * Chris Sardegna
 * Period 5
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
        Scanner keyboard9 = new Scanner(System.in);
        Scanner keyboard10 = new Scanner(System.in);
        
        /*
        System.out.print("Enter an integer: ");
        int num1 = keyboard1.nextInt();
        System.out.println(num1);
        
        System.out.print("Enter a double: ");
        double num2 = keyboard2.nextDouble();
        System.out.println(num2);
        
        System.out.print("Enter a float: ");
        float num3 = keyboard3.nextFloat();
        System.out.println(num3);
        
        System.out.print("Enter a long: ");
        long num4 = keyboard4.nextLong();
        System.out.println(num4);
        
        System.out.print("Enter a byte: ");
        byte num5 = keyboard5.nextByte();
        System.out.println(num5);
        
        System.out.print("Enter a short: ");
        short num6 = keyboard1.nextShort();
        System.out.println(num6);
        
        System.out.print("Enter a word: ");
        String num7 = keyboard7.next();
        System.out.println(num7);
        
        System.out.print("Enter a string: ");
        String num8 = keyboard8.nextLine();
        System.out.println(num8);
        */
        System.out.print("Enter an integer to add: ");
        int num9 = keyboard9.nextInt();
        System.out.print("Enter another integer to add: ");
        int num10 = keyboard10.nextInt();
        int num11 = num9 + num10;
        System.out.println(num9 + "+" + num10 + "=" + (num11));
    }
}
