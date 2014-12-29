
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public static void main (String args[]){
        Test run = new Test();
        System.out.println(run.hasOne(220));        
    }

    public boolean hasOne(int n) {

        while(n>=1){
            if(n%10==1)
                return true;
            n=n/10;  
        }
        return false;
    }

}
