
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String args[]){
        Test run = new Test();
        System.out.println(run.fun(5,5));
    }
    
    public int fun(int x, int y){
        if(y==2)
            return y;
        else{
            return fun(x, y-1) + x;
        }
    }
}
