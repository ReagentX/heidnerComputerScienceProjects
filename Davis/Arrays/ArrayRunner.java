import java.util.Arrays;

class ArrayRunner {
	public static void main(String[] args) {
		int[] one = {3,5,8,3,1,54,23,8,2,23,46,87,12};
		System.out.println("Sucessfully assigned Array values");
		ArrayActions obj = new ArrayActions();
		System.out.print("Array: ");
		System.out.println(Arrays.toString(one));
		System.out.print("Sum: ");
		System.out.println(obj.sumAll(one));
		System.out.print("Largest number: ");
		System.out.println(obj.findLargest(one));
		System.out.print("Smallest number: ");
		System.out.println(obj.findSmallest(one));
		System.out.print("Average: ");
		System.out.println(obj.findAvg(one));
		System.out.print("Smallest to Biggest number: ");
		System.out.println(Arrays.toString(obj.reorderSmallToBig(one)));
		System.out.print("Biggest to Smallest number: ");
		System.out.println(Arrays.toString(obj.reorderBigToSmall(one)));
		System.out.println(obj.countEvens(one));
		System.out.println(obj.countOdds(one));
	}
}