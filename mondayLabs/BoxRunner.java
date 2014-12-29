import static java.lang.System.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class BoxRunner
{   
   private String let;
   private int size;
   Box[] box;
   
       public void loadArray(){
            Scanner reader=null;
 
            try{
                reader = new Scanner(new File("box.dat") );
            }catch(FileNotFoundException e){
                System.out.println("Sorry, Can't Find the File");
            }
            int length = reader.nextInt();
            box = new Box[length];
            int idx = 0;
            reader.nextLine();
            while(reader.hasNext()){
                //reader.nextLine();
                let = reader.nextLine();
                System.out.println(let);
                //reader.nextLine();
                size = reader.nextInt();
                System.out.println(size);
                //
                reader.nextLine();
                box[idx] = new Box(let, size);
                idx++;
            }
     
    }
    public String toString(){
            String output = Arrays.toString(box);
            return output;
          }
   }