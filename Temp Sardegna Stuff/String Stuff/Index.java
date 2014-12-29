
/**
 * Write a description of class Index here.
 * 
 * @author Christopher Sardegna 
 * @version 12/11/13
 */
public class Index
{
   String s;
    public Index (String s){
       System.out.println("SSN: " + s); //prints number
       
       int ind1 = s.indexOf("-");
       System.out.println(s.substring(0,ind1)); //prints up to first dash
       String sub = "";
       
       int asdf = ind1+1; //gets value after the first dash
       
       
       String s2 = s.substring(asdf); //substrings everthing after first dashe 
       int ind2 = s2.indexOf("-"); //gets the index of the second dash (first dash in s2)
       
       System.out.println(s2.substring(0,ind2)); //prints everything between the first and second dashes
       
       int sdfg = ind2+ind1+2; //gets value after second dash
       String s3 = s.substring(sdfg); //substrings out evertrhing after second dash
       int ind3 = s3.indexOf("-"); //gets index of third dash
       int dashTwo = sdfg - 1; //gets location of second dash (since we added one to ignore it above)      
       System.out.println(s3.substring(0,ind3)); //prints everything between third anf fourth dash
       
       int dfgh = ind3+ind2+ind1+3; //gets value after third dash
       String s4 = s.substring(dfgh); //substrings out everything after third dash
       int dashThree = dfgh - 1; //gets value of third dash
       System.out.println(s4); //prints everything after third dash
       
       System.out.println("First dash = " + ind1 + " / " + "Second dash = " + dashTwo + " / " + "Third dash = " + dashThree);
       //prints where the dashes are
       /**int test1 = s.lastIndexOf("-"); //gets last dash index
       int test2 = test1+1; //skips over the last dash
       String qwer = s.substring(test2); //substrings out everything after the last dash
       System.out.println(qwer); //prints last set of numbers */
    }
}