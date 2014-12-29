
/**
 * Write a description of class Wrappers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wrappers
{
    public static void main (String[] args){
        //NO AUTO BOXING!
        int lilWayne = 456;
        Integer intObj = new Integer (lilWayne);
        System.out.println( (int)intObj );
        
        double myDubs = 98.6;
        Double dubsObj = new Double (myDubs);
        System.out.println( (double)dubsObj );
        
        char eminem = 'e';
        Character charObj = new Character (eminem);
        System.out.println( (char)charObj);
        
        //BOXING AND AUTOBOXING
        int twoChains = 213;
        Integer intObjTwo = twoChains;
        System.out.println( (int)intObjTwo );
        
        double myDubs2 = 98.6;
        Double dubsObj2 = myDubs2;
        System.out.println( (double)dubsObj2 );
        
        char slimShady = '~';
        Character charObj2 = new Character (slimShady);
        System.out.println( (char)charObj2);
        
    }
}
