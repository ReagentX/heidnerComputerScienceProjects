
/**
 * Write a description of interface TestableStringChecker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface TestableStringChecker
{
     public void setString(String s);

	public boolean findLetter(char c);

	public boolean findSubString(String s);

 	public String toString();
 	
 	public String getWord();
}
