import java.util.Scanner;

class AdditionRunner {
		
	public static void main(String[] args) {
			Addition obj = new Addition();
			Scanner sc = new Scanner(System.in);
			System.out.print("First number: "); 
			int x = sc.nextInt();
			System.out.print("Second number: ");
			int y = sc.nextInt();
			obj.setNums(x,y);
			System.out.println(obj.toString());
		}
		
}