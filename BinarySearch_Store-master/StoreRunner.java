import java.util.*;
import java.io.*;
//Name - 
//Date - 
//Class -
/**
 * Write a description of class StoreRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoreRunner
{
    public static void main(String[] arg) throws FileNotFoundException{
        String file = "file50_Sorted.dat";
        Store run = new Store(file);
        ArrayList <Item> myStore = run.myStore();
        Item thing;
        int idToFind;
        int invReturn;
        int index;
        Scanner in = new Scanner(System.in);
        System.out.println("Testing search algorithm\n");
        do{
            System.out.println();
            System.out.print("Enter Id value to search for (-1 to quit) ---> ");
            idToFind = in.nextInt();
            //index = bsearchL(new Item(idToFind));
            //recursive version call
            thing = new Item(idToFind,0);
            index = run.bsearchR(thing, 0, myStore.size()-1);
            System.out.print("Id # " + idToFind);
            if (index == -1){
                System.out.println(" No such part in stock");
            }
            else{
                System.out.println(" Inventory = " + myStore.get(index).getInv());
            }
        } while (idToFind >= 0);
    }
}