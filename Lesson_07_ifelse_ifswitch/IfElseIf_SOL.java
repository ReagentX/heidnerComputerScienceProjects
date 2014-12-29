//© A+ Computer Science
// www.apluscompsci.com

//if else if statement

public class IfElseIf_SOL
{
	public static int getIntVal( String letter )
	{
		int ascii=0;
		if(letter.equals("A")) {
		   ascii=65;
		}
		else if(letter.equals("B")){
		   ascii=66;
		}
		else if(letter.equals("C")){
		   ascii=67;
		}
		else if(letter.equals("D")){
		   ascii=68;
		}
		else{
		   ascii=69;
		}		
		return ascii;		
	}
	
	public static void main(String args[])
	{
		System.out.println( getIntVal( "A" ));
		System.out.println( getIntVal( "C" ));
		System.out.println( getIntVal( "E" ));
	}
}