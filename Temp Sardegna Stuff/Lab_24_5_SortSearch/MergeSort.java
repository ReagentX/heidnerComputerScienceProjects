//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 5/9/14
//Class - Period 5
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays; 

public class MergeSort
{
    private static int passcat;
    private static int count;
    public static void mergeSort(Comparable[] list)
    {
        count = 0;
        passcat=0;
        mergeSort(list, 0, list.length);
    }

    private static void mergeSort( Comparable[] list, int front, int back)  //O( Log N )
    {
        int blue = (front+back)/2;
        if(blue==front) 
            return;
        mergeSort(list, front, blue);
        mergeSort(list, blue, back);
        merge(list, front, back);
    }

    private static void merge(Comparable[] list, int front, int back)  //O(N)
    {
        Comparable[] mond = new Comparable[back-front];
        int i=front;
        int blue=(front+back)/2;
        Comparable[] red = new Comparable[(back-front)/2];
        Comparable[] green = new Comparable[(back-front)-((back-front)/2)];
        int jump = 0;
        for(int x = front; x < blue; x++)
        {
            red[jump]=list[x];
            jump++;
        }
        int core = 0;
        for(int x = blue; x <  back; x++)
        {
            green[core]=list[x];
            core++;
        }
        jump = 0;
        core = 0;
        for(int x = 0; x < mond.length; x++)
        {
            if(jump>=red.length)
            {
                mond[x] = green[core];
                core++;
            }
            else if(core>=green.length)

            {
                mond[x] = red[jump];
                jump++;
            }
            else if(red[jump].compareTo(green[core])<0)
            {
                mond[x] = red[jump];
                jump++;
            }
            else
            {
                mond[x] = green[core];
                core++;
            }
        }      
        int cat = 0;
        for(int x = front; x < back; x++)
        {
            list[x] = mond[cat];
            cat++;
        }
        System.out.println("Pass " + count + " " + Arrays.toString(list));
        System.out.println();
        count++;
    }
    public String toString(){
        return"";
    }
}