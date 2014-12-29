
/**
 * Write a description of class StringStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Two 
{
    String s;
    public Two(String s){
       String sub1 = "";
       String sub2 = "";
       String sub3 = "";
       String sub4 = "";
       sub1 = s.substring(0,4);
       sub2 = s.substring(22,28);
       sub3 = s.substring(5,7);
       sub4 = s.substring(72,79);
       System.out.println(sub1 + " " + sub2 + " " + sub3 + " " + sub4 + ".");
    }

//     public void atThings(){
//         int len = s.length();
//         System.out.println("The length is " + len + ",and: " + s.charAt(3)+s.charAt(23)+s.charAt(24)+s.charAt(36)+s.charAt(19)+s.charAt(41)+s.charAt(42));
//     }
}
