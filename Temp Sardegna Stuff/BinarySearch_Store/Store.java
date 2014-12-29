import java.util.*;
import java.io.*;
import java.util.Scanner;

/**
 *  Store class solution.
 *
 * @author     G. Peck
 * @created    July 18, 2002
 *
 * modified by Jason Quesenberry and Nancy Quesenberry
 * February 6, 2006
 */
 
public class Store{
  private ArrayList <Item> myStore = new ArrayList <Item>();
  Scanner rdr;

  public Store(String fName){
    loadFile(fName);
  }

  public Store(){
    
  }

  /**
   *  Reads a file containing id/inv data pairs one pair per line. 
   *
   * @param  inFileName  name of file containing id/inv pairs of data
   */
  private void loadFile(String inFileName){
    
    int id,inv;
    
    //Write a Scanner input routine to add id/inv data pairs to the ArrayList
    

  }

  /**
   *  prints out all available Items contained in the Store
   */
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
  
  
  
  
  /**
   *  Searches the myStore ArrayList of Item Objects for the specified
   *  item object using a iterative binary search algorithm
   *
   * @param  idToSearch  Item object containing id value being searched for
   * @return             index of Item if found, -1 if not found
   */
   
  private int bsearchL(Item idToSearch){
    // your code here
    
    return -1;
  }

  
  
  
/**
   *  Searches the specified ArrayList of Item Objects for the specified
   *  id using a recursive binary search algorithm
   *
   * @param  idToSearch  Id value being search for
   * @param  first       Starting index of search range
   * @param  last        Ending index of search range
   * @return             index of Item if found, -1 if not found
   */
   
  private int bsearchR(Item idToSearch, int first, int last){
      //Your code here
      
      return -1;
  }

  public String toString(){
      return "" + myStore;
  }
  
 
  
   /**
   *  Interchanges two elements in the ArrayList
   *
   * @param  list  reference to an ArrayList of Items
   * @param  a     index of integer to be swapped
   * @param  b     index of integer to be swapped
   */
  private void swap(ArrayList <Item> list, int a, int b){
    Item c = list.get(a);
    list.set(a, list.get(b));
    list.set(b, c);
  }
}

