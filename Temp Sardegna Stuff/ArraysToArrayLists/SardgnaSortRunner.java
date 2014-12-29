//Name - Chris Sardegna
//Date - 7/5/2014
//Class - Period 5
//Lab  - Arrays to ArrayLists
import java.util.ArrayList;
public class SardgnaSortRunner
{
   public static void main (String[] args){
       SardgnaBubbleSort runner1 = new SardgnaBubbleSort();
       SardegnaSelectionSort runner2 = new SardegnaSelectionSort();
       
       ArrayList<Integer> arrayOne = new ArrayList<Integer>();
       arrayOne.add(21);
       arrayOne.add(7);
       arrayOne.add(87);
       arrayOne.add(12);
       arrayOne.add(73);
       arrayOne.add(37);
       arrayOne.add(14);
       arrayOne.add(2);
       arrayOne.add(65);
       arrayOne.add(19);
       arrayOne.add(84);
       arrayOne.add(35);
       arrayOne.add(32);
       
       ArrayList<Integer> arrayTwo = new ArrayList<Integer>();
       arrayTwo.add(21);
       arrayTwo.add(7);
       arrayTwo.add(87);
       arrayTwo.add(12);
       arrayTwo.add(73);
       arrayTwo.add(37);
       arrayTwo.add(14);
       arrayTwo.add(2);
       arrayTwo.add(65);
       arrayTwo.add(19);
       arrayTwo.add(84);
       arrayTwo.add(35);
       arrayTwo.add(32);
       
       
       System.out.println("Bubble - Unsorted: " + arrayOne);
       runner1.bubble(arrayOne);
       System.out.println();
       System.out.println("Bubble - Sorted: " + arrayOne);
       System.out.println();
       System.out.println("Selection - Unsorted: " + arrayTwo);
       runner2.selection(arrayTwo);
       System.out.println();
       System.out.println("Selection - Sorted: " + arrayTwo);
   }
}
