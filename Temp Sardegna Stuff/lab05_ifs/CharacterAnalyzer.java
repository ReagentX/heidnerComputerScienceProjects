//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
    private char theChar;
    String result;

    public CharacterAnalyzer()
    {
        theChar = 'a';

    }

    public CharacterAnalyzer(char c)
    {
        theChar = c;

    }

    public void setChar(char c)
    {
        theChar = c;

    }

    public char getChar()
    {
        return theChar;
    }

    public boolean isUpper( )
    {
        int a = theChar;
       if (a >= 65 && a <= 90){
            return true;
       }
       else{
            return false;
       }
    }

    public boolean isLower( )
    {
        int a = theChar;
        if (a >= 97 && a <= 122){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isNumber( )
    {
        int a = theChar;
        if (a >= 48 && a <= 57){
            return true;
        }
        else{
            return false;
        }
    }   

    public int getASCII( )
    {
        int a = theChar;
        
        if (a >= 65 && a <= 90){
            result = theChar + " is an uppercase char. ASCII == " + a;
            System.out.println(theChar + " is an uppercase char. ASCII == " + a);
        }
        else if (a >= 97 && a <= 122){
            result = theChar + " is an lowercase char. ASCII == " + a;
            System.out.println(theChar + " is an lowercase char. ASCII == " + a);
        }
        else if (a >= 48 && a <= 57){
            result = theChar + " is a number. ASCII == " + a;
            System.out.println(theChar + " is a number. ASCII == " + a);
        }
       
        return a;
    }

    public String toString()
    {
        int a = theChar;
        
        if (a >= 65 && a <= 90){
            result = theChar + " is an uppercase char. ASCII == " + a;
        }
        else if (a >= 97 && a <= 122){
            result = theChar + " is an lowercase char. ASCII == " + a;
        }
        else if (a >= 48 && a <= 57){
            result = theChar + " is a number. ASCII == " + a;
        }
        
        return result;     
    }
}