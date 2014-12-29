//Name - Chris Sardegna
//Date - 7/5/2014
//Class - Period 5
//Lab  - Arrays to ArrayLists
import java.util.ArrayList;
public class SardegnaSelectionSort
{
    public void selection(ArrayList<Integer> list){
         int largest;
         for (int i=0; i < list.size () - 1; i++){
             largest = 0;
              for (int j=largest + 1; j < list.size () - i; j++){
                  if((list.get(largest)).compareTo(list.get (j))< 0){
                     largest = j;
                 }
             } 
             int temp = list.get(list.size () - 1 - i);
             list.set (list.size () - 1 - i, list.get (largest));
             list.set (largest, temp);
         }
    }
    
}
