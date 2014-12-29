//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import javax.swing.JOptionPane;

public class Lab0b
{
    public static void main ( String[] args )
    {
        //define 1 variable of each of the
        //following data types
        //byte      short       int         long
        //float     double
        //char      boolean     String

        //integer variables
        byte byteOne = 120;
        short shortOne = 245;
        int intOne = 57;
        int one, two, total;
        long longOne = 45868;

        //decimal variables
        float floatOne = 456.32f;
        double doubleOne = 58.32;

        //other integer types
        char charOne = 'a';

        //other types
        boolean boolOne = true;
        String stringOne = "hello world";

        //output your information here
        System.out.println("/////////////////////////////////");
        System.out.println("*Chris Sardegna         09/20/13*");
        System.out.println("*                               *");
        System.out.println("*        integer types          *");
        System.out.println("*                               *");
        System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
        System.out.println("*16 bit - shortOne = "+shortOne+"\t*");
        System.out.println("*32 bit - intOne = "+intOne+"\t\t*");
        System.out.println("*64 bit - longOne = "+longOne+"\t*");
        System.out.println("*                               *");
        System.out.println("*        decimal types          *");
        System.out.println("*                               *");
        System.out.println("*32 bit - floatOne = "+floatOne+"\t*");
        System.out.println("*64 bit - doubleOne = "+doubleOne+"\t*");
        System.out.println("*                               *");
        System.out.println("*     other intiger types       *");
        System.out.println("*                               *");;
        System.out.println("*16 bit - charOne = "+charOne+"\t\t*");
        
            if(byteOne > 5){
                System.out.println("*boolean = " + boolOne + "\t\t\t*");
                System.out.print("*string = " + stringOne + "\t\t*\n");
                System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
                
            }

        one = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer :: "));
        two = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer :: "));

		total = one * two;

		JOptionPane.showMessageDialog(null,"Total ::" + total);

		System.out.println(total);
    }
}