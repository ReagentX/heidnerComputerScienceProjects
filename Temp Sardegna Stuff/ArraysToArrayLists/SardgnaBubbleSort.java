//Name - Chris Sardegna
//Date - 7/5/2014
//Class - Period 5
//Lab  - Arrays to ArrayLists
import java.util.ArrayList;
public class SardgnaBubbleSort
{
    public void bubble(ArrayList<Integer> list){
        for(Integer out = list.size()-1; out>1; out--){
            for (Integer i = 0; i< out; i++){
                int n = i+1;
                if(list.get(i) > list.get(n)){
                    Integer temp = list.get(i);
                    list.set(i, list.get(n));
                    list.set(n, temp);
                }
            }
        }
    }
}
