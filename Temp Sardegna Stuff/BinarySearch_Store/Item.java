/**
 *  Encapsulates an Inventory Item
 *
 * @author     G. Peck
 * @created    July 18, 2002
 *
 * modified by Jason Quesenberry and Nancy Quesenberry
 * February 6, 2006
 */

//public class Item implements Comparable{
public class Item{
  private int myId;
  private int myInv;

  /**
   *  Constructor for the Item object
   *
   * @param  id   id value
   * @param  inv  inventory value
   */
   
  public Item(int id, int inv){
    myId = id;
    myInv = inv;
  }

  /**
   *  Gets the id attribute of the Item object
   *
   * @return    The id value
   */
   
  public int getId(){
    return myId;
  }

  /**
   *  Gets the inv attribute of the Item object
   *
   * @return    The inv value
   */
   
  public int getInv(){
    return myInv;
  }

  /**
   *  Compares two Item objects by their id (myId) fields
   *
   * @param  other  Item object to compare to
   * @return              positive int if myId > other.myId
   *                      0 if myId == other.myId
   *                      negative int if myId < other.myId
   */

  public int compareTo(Item other){
    return myId - other.myId;
  }

  /**
   *  Compares the Item to the specified object
   *
   * @param  otherObject  Item object to compare to
   * @return              true if equal, false otherwise
   */
   
  public boolean equals(Item other){
    return this.compareTo(other) == 0;
  }

  public String toString(){
    return "Id=" + myId + ",Inv=" + myInv;
  }
}

