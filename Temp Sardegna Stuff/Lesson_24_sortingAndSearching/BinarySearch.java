//© A+ Comidputer Science
// www.apluscompsci.com

//binary search example

import static java.lang.System.*;

public class BinarySearch
{
    public int binarySearchL (int [] arr, int val)
    {
        int start= 0, end = arr.length-1;
        while(start<=end)  
        {
            int middle = (start + end) / 2;
            if (arr[middle] == val)  
                return middle;
            else
            if (arr[middle] > val)
                end = middle-1;
            else
                start = middle+1;
        }
        return -1;
    }    

    public int binarySearchR (int [] arr, int val, int start, int end )
    {
        if(start<=end)
        {
            int mid = (start + end) / 2;
            if (arr[mid] == val)
                return mid;
            if (arr[mid] > val)
                return binarySearchR(arr, val, start, mid-1);
            return binarySearchR(arr, val, mid+1, end);
        }
        return -1;
    }
}