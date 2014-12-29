import javax.swing.JOptionPane;

/**
 * Write a description of class Calculator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calc
{
   float one, two, total;
   char operation;
   public void asmd(){
       
       one = Float.parseFloat(JOptionPane.showInputDialog("Enter a number :: "));
       two = Float.parseFloat(JOptionPane.showInputDialog("Enter a number :: "));
       operation = (JOptionPane.showInputDialog("Enter an operation :: ")).charAt(0);
       if (operation == '+'){
           total = one+two;
        }
    
       JOptionPane.showMessageDialog(null,"Total ::" + total);
    
       //System.out.println(total);
   }
}