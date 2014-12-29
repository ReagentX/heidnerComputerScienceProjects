//© A+ Computer Science  -  www.apluscompsci.com

//gui example

import javax.swing.JOptionPane;

public class GuiHelp
{
    public static void main(String args[])
    {
        int one, two, total;
        String three;
        one = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer :: "));
        two = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer :: "));
        three = JOptionPane.showInputDialog("Enter your name tho");

        total = one + two;

        JOptionPane.showMessageDialog(null,"my name is " + three + " and I am " + total + " years old.");

        System.out.println(total);
    }
}