//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour implements TestableMPH
{
    private int distance, hours, minutes;
    private double mph;
    private int rate;
    private double time;
   
    public MilesPerHour()
    {
        setNums(0,0,0);
        mph=0.0;
    }

    public MilesPerHour(int dist, int hrs, int mins)
    {
       distance = dist;
        hours = hrs ;
        minutes = mins;
    }

    public void setNums(int dist, int hrs, int mins)
    {
        distance = dist;
        hours = hrs;
        minutes = mins;
    }

    public void calcMPH()
    {
        time = (double)hours+((double)minutes/60.0);
         if (time == 0){
             mph = 0.0;
         }
         else {
             mph = (double)distance/time;
         }
        //time = (double)hours+(minutes/60.0);
        //mph = (double)distance/time;
        //System.out.print(mph);
        //mph = Math.round(mph);
        
    }

    public void print()
    {
      System.out.print(mph);
    }
    
    public int getDistance()
    {
       return distance; 
    }    
    
    public int getHours() 
    {
        return hours;
    }    
    
    public int getMinutes()
    {
        return minutes;
    }
    
    public double getMPH() 
    {
        return mph;
    }    
    
}