package lab18b;
//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 4/23/14
//Class - Period 5
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
    private int myWeight;
    private int myHeight;
    private int myAge;
    //write a default Constructor
    public Monster(){
        myWeight=0;
        myHeight=0;
        myAge=0;
    }
    //write an initialization constructor with an int parameter ht
    public Monster(int ht){
        myHeight=ht;
    }
    //write an initialization constructor with int parameters ht and wt
    public Monster(int ht, int wt){
        myHeight=ht;
        myWeight=wt;
    }
    //write an initialization constructor with int parameters ht, wt, and age
    public Monster(int ht,int wt, int age){
        myHeight=ht;
        myWeight=wt;
        myAge=age;
    }
    //modifiers - write set methods for height, weight, and age
    public void setWeight(int wt){
        myWeight=wt;
    }

    public void setHeight(int ht){
        myHeight=ht;
    }

    public void setAge(int age){
        myAge=age;
    }
    //accessors - write get methods for height, weight, and age
    public int getWeight(){
        return myWeight;
    }

    public int getHeight(){
        return myHeight;
    }

    public int getAge(){
        return myAge;
    }
    //creates a new copy of this Object
    public Object clone()
    {
        
        return new Monster(myHeight,myWeight,myAge);
    }

    public boolean equals( Object obj )
    {
        Monster rhs = (Monster)obj;
        if(this.getWeight()==rhs.getWeight()&&this.getHeight()==rhs.getHeight()||this.getAge()==rhs.getAge())
            return true;
        return false;
    }

    public int compareTo( Object obj )
    {
        Monster rhs = (Monster)obj;
        if(this.getWeight()>rhs.getWeight()||this.getHeight()>rhs.getHeight()||this.getAge()>rhs.getAge())
            return 1;
        else if(this.getWeight()<rhs.getWeight()||this.getHeight()<rhs.getHeight()||this.getAge()<rhs.getAge()) 
            return -1;
        return 0; 
    }
    //write a toString() method  
    public String toString(){
        return ""+myHeight + " " + myWeight + " " + myAge;
    }    
}