import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Object;

class ArrayActions {

	public int sumAll(int[] x){
		int sumOfAllSpots = 0;
		for(int i = 0; i < x.length; i++){		
			sumOfAllSpots += x[i];
		}
		return sumOfAllSpots;
	}
	
	public int findLargest(int[] x){
		int biggest = Integer.MIN_VALUE;
		for(int i = 0; i < x.length; i++){
			if(x[i]>biggest)
				biggest = x[i];
		}
		return biggest;
	}
	
	public int findSmallest(int[] x){
		int smallest = Integer.MAX_VALUE;
		for(int i = 0; i< x.length; i++){
			if(x[i]<smallest)
				smallest = x[i];
		}
		return smallest;
	}
	
	public int findAvg(int[] x){
		return sumAll(x)/x.length;
	}
	
	public int[] reorderSmallToBig(int[] y){
		int temp;
		int[] x = y; 
		  for (int i = 0; i < x.length-1; i++){
		     if(x[i] > x[i+1]){
		     	temp=x[i];
		        x[i]=x[i+1];
		        x[i+1]=temp;
		        i=-1;
		        }
		 	}
		return x;
	}
	
	public int[] reorderBigToSmall(int[] y){
		int temp;
		int[] x = y;
		for(int i=0; i < x.length-1; i++){
			if(x[i]<x[i+1]){
				temp=x[i];
				x[i]=x[i+1];
			    x[i+1]=temp;
		        i=-1;
			}
		}
		return x;
	}
	
	public boolean isEven(int x){
		if(x%2 == 0)
			return true;
		else
			return false;
	}
	
	//Yes, these next two methods are innefficneit. Just wanted to use booleans for learning purposes!
	public String countEvens(int[] x){
		int count = 0;
		for(int i = 0; i < x.length; i++){
			if(isEven(x[i])){
				count++;
			}
		}
		int[] evens = new int[count];
		int spot = 0;
		for(int i = 0; i < x.length; i++){
			if(isEven(x[i])){
				evens[spot] = x[i];
				spot++;
			}
		}
		return count + " even numbers: " + Arrays.toString(evens);
	}
	
	public String countOdds(int[] x){
			int count = 0;
			for(int i = 0; i < x.length; i++){
				if(!isEven(x[i])){
					count++;
				}
			}
			int[] odds = new int[count];
			int spot = 0;
			for(int i = 0; i < x.length; i++){
				if(!isEven(x[i])){
					odds[spot] = x[i];
					spot++;
				}
			}
			return count + " odd numbers: " + Arrays.toString(odds);
		}

}