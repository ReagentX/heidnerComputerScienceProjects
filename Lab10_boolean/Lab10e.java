// A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 11 March 2014
//Class - Period 5
import java.util.Scanner;
import static java.lang.System.*;
public class Lab10e
{
    public static void main(String args[])
    {
        int low,up;
        Scanner k = new Scanner(System.in);
        out.print("Welcome! Please enter the lower bound: ");
        low = k.nextInt();
        out.println("You selected " + low );
        out.print("Please enter the upper bound: ");
        up = k.nextInt();
        out.println("You selected " + up);
        GuessingGame game = new GuessingGame(low,up);
        out.print("Would you like to play? [y, n] :: ");
        char res = k.next().charAt(0);
        while(res=='y'){
            String play;
            out.print("Welcome! Please enter the lower bound: ");
            low = k.nextInt();
            out.println("You selected " + low );
            out.print("Please enter the upper bound: ");
            up = k.nextInt();
            out.println("You selected " + up);
            GuessingGame game2 = new GuessingGame(low,up);
            out.print("Would you like to play? [y, n] :: ");
            res = k.next().charAt(0);
        }
        out.print("G O O D B Y E");
    }
}