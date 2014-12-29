// A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 3/13/14
//Class - Period 5
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;


//This class will not compile until all 
//abstract Locatable methods have been implemented
public class Block implements Locatable
{
   //instance variables
   private int xPos;
   private int yPos;

   private int width;
   private int height;

   private Color color;    

   //constructors
   public Block(){
       xPos=100;
       yPos=150;
       width=10;
       height=10;
       color=Color.BLACK;
   }
    
   public Block(int x,int y, int w, int h){
        xPos=x;
        yPos=y;
        width=w;
        height=h;
        color=Color.BLACK;
   }
   
   public Block(int x,int y, int w, int h, Color c){
        xPos=x;
        yPos=y;
        width=w;
        height=h;
        color=c;
   }
   //set methods
   public void setPos( int x, int y){
       width=x;
       height=y;
   }
   public void setX( int x ){
       xPos=x;
   }
    public void setY( int y ){
       yPos=y;
   }
   public void setColor(Color c){
       color = c;
    }
   
   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   //get methods
   public int getX(){
       return xPos;
    }
   public int getY(){
       return yPos;
   }
   public int getWidth(){
       return width;
   }
   public int getHeight(){
       return height;
   }
   public Color getColor(){
       return color;
   }
   

}