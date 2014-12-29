
/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster
{
   private int height,weight,wingspan;
   
   public Monster(){
      height = 0;
      weight = 0;
      wingspan = 0;
    }
    
   public Monster(int x, int y, int z){
       height = x;
       weight = y;
       wingspan = z;
   }
       
   public void setMonster(int x, int y, int z)
    {
       height = x;
       weight = y;
       wingspan = z;
    }
    
    public int getHeight()    {
        return height;
    }
    
     public int getweight()    {
        return weight;
    }
     
    public int getWingspan()    {
        return wingspan;
    }
   
    public String toString()
    {
        String output= "The height is: " + height + "The weight is: " + weight + "The wingspan is: " + wingspan;
        return output;
    }
   } 