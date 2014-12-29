import java.util.*;
import java.io.*;
import java.util.Scanner;
//Name - 
//Date -
//Class - 
public class Store{
    private ArrayList <Item> myStore = new ArrayList <Item>();
    Scanner rdr;
    public Store(String fName) throws FileNotFoundException {
        loadFile(fName);
    }

    public Store(){ 
    }

    /** Reads a file containing id/inv data pairs one pair per line.
     * @param  inFileName  name of file containing id/inv pairs of data*/
    private void loadFile(String inFileName) throws FileNotFoundException {
        int id,inv;
        rdr = new Scanner(new File(inFileName));
        while(rdr.hasNext()){
            id = rdr.nextInt();
            inv = rdr.nextInt();
            Item thing = new Item(id,inv);
            myStore.add(thing);
        }
    }

    /**prints out all available Items contained in the Store*/
    public void displayStore(){
        int lineNum = 1;
        Iterator <Item> itr = myStore.iterator();
        Item tempItem;
        System.out.printf("%12s%10s", "Id", "Inv");
        System.out.println();
        System.out.println();
        while(itr.hasNext()){
            tempItem = itr.next();    
            System.out.printf("%2d%10d%10d",lineNum++,tempItem.getId(),tempItem.getInv());
            System.out.println();
            if ((lineNum - 1) % 10 == 0){
                System.out.println();
            }
        }
    }

    /**  Searches the myStore ArrayList of Item Objects for the specified
     *  item object using a iterative binary search algorithm
     * @param  idToSearch  Item object containing id value being searched for
     * @return             index of Item if found, -1 if not found*/
    public int bsearchL(Item idToSearch){
        return -1;
    }

    /**Searches the specified ArrayList of Item Objects for the specified
     *  id using a recursive binary search algorithm
     * @param  idToSearch  Id value being search for
     * @param  first       Starting index of search range
     * @param  last        Ending index of search range
     * @return             index of Item if found, -1 if not found*/
    public int bsearchR(Item idToSearch, int first, int last){
        first= 0;
        last = myStore.size()-1;
        while(first<=last){
            int middle = (first + last) / 2;
            if (myStore.get(middle).getId() == idToSearch.getId()) return middle;
            else if (myStore.get(middle).getId() > idToSearch.getId())
                last = middle-1;
            else
                first = middle+1;
        }
        return -1;
    }

    public String toString(){
        return "" + myStore;
    }

    public ArrayList myStore(){
        return myStore;
    }

    /**Interchanges two elements in the ArrayList
     * @param  list  reference to an ArrayList of Items
     * @param  a     index of integer to be swapped
     * @param  b     index of integer to be swapped*/
    private void swap(ArrayList <Item> list, int a, int b){
        Item c = list.get(a);
        list.set(a, list.get(b));
        list.set(b, c);
    }
}