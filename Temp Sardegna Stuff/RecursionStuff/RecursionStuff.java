import static java.lang.System.*;
public class RecursionStuff
{
    public int run(int x, int y){

        if (y==2){ //base case
            return x;
        }else{
            return run(x, y-1) + x;
        }
         //recursive call, creates a new acvivation record 
    }

    public void run2(int y){
        out.println("new method start");
        if (y<5) //base case
            run2(y+1); //recursive call, creates a new acvivation record 

        out.println(y);
    }

    public int fun(int x){
        if (x<=1){ //base case
            return x;
        }
        else{
            return x + fun(x-2); //recursive call, creates a new acvivation record 
        }
    }

    public static void main (String args[]){
        RecursionStuff run = new  RecursionStuff();
        out.print(run.fun(3));
    }
}
