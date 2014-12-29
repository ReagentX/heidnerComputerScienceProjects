//© A+ Computer Science
// www.apluscompsci.com

//ArrayList Objects example

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.*;

public class Objects
{
    public static void main(String args[])
    {
        ArrayList<String> ray = new ArrayList<String>();
        ray.add("hello");
        ray.add("whoot");
        ray.add("contests");
        out.println((ray.get(0)));
        out.println((ray.get(2)));

        ArrayList<Integer> ray2 = new ArrayList<Integer>();
        ray2.add(new Integer(456));
        ray2.add(new Integer(12));
        ray2.add(new Integer(7));
        ray2.add(new Integer(564));
        ray2.add(new Integer(986));
        for (int i=0; i<ray2.size(); i++){
            out.println((ray2.get(i)));
        }
        out.print("[\t");
        for(Integer temp : ray2){
            out.print(temp + "\t");
        }
        out.print("]");
    }
}