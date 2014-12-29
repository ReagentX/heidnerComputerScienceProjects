// A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna & Fabiola Lopez
//Date - 3/10/14
//Class - Period 5
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Font;
import java.awt.Canvas;

public class Tree extends Canvas
{
    public Tree()
    {
        setBackground(Color.BLACK); //chages background to black
    }

    public void paint( Graphics window )
    {
        window.setColor(Color.RED); //sets the color of the following text to red
        window.setFont(new Font("TAHOMA",Font.BOLD,12)); //sets the font and font size
        window.drawString("Lab14h - Tree Lab", 50, 50); //sets the text and the positon of the object
        
        tree(window); //runs the tree() method
        star(window); //runs the star() method


    }
    
    public void tree(Graphics window)
    {
        int[] treeXPoints = {400,200,600}; //aray that contains the X values of the triangle {top middle, bottom left, bottom right} 
        int[] treeYPoints = {100,500,500}; //aray that contains the Y values of the triangle {top middle, bottom left, bottom right} 
        Polygon tree = new Polygon(treeXPoints,treeYPoints,treeXPoints.length); //creates a new polygon object called tree and uses the two arrays above to get the X and Y points of the corners
        window.setColor(Color.GREEN); //sets the color of the triangle object to green uing the Color() method
        window.fillPolygon(tree); //fills the inside of the object tree using the fillPolygon() method
        
        //ornaments
        int[] nums = {460,320,380,500,300,370,430,350}; //creates a new array called nums that contains the X values for all of the ornaments
        int[] nums2 = {300,275,370,400,450,200,440,500}; //creates a new array called nums2 that contains the Y values for all the ornaments
        int[] size = {20,100}; //creates a new array called size that contains all of the size variables
        window.setColor(Color.BLUE); //sets the color of the object using the Color() method
        window.fillOval(nums[0],nums2[0],size[0],size[0]); //sets the position and size of the object uing the fillOval() method
        
        window.setColor(Color.CYAN); //sets the color of the object using the Color() method
        window.fillOval(nums[1],nums2[1],size[0],size[0]); //sets the position and size of the object uing the fillOval() method
        
        window.setColor(Color.MAGENTA); //sets the color of the object using the Color() method
        window.fillOval(nums[2],nums2[2],size[0],size[0]); //sets the position and size of the object uing the fillOval() method
        
        window.setColor(Color.WHITE); //sets the color of the object using the Color() method
        window.fillOval(nums[3],nums2[3],size[0],size[0]); //sets the position and size of the object uing the fillOval() method
        
        window.setColor(Color.RED); //sets the color of the object using the Color() method
        window.fillOval(nums[4],nums2[4],size[0],size[0]); //sets the position and size of the object uing the fillOval() method
        
        window.setColor(Color.BLACK); //sets the color of the object using the Color() method
        window.fillOval(nums[5],nums2[5],size[0],size[0]); //sets the position and size of the object uing the fillOval() method
        
        window.setColor(Color.GRAY); //sets the color of the object using the Color() method
        window.fillOval(nums[6],nums2[6],size[0],size[0]); //sets the position and size of the object uing the fillOval() method
    
        window.setColor(Color.MAGENTA); //sets the color of the object using the Color() method
        window.fillRect(nums[7],nums2[7],size[1],size[1]); //sets the position and size of the object uing the fillOval() method



    }

    public void star(Graphics window)
    {

        int[] starXPoints = {370,400,430}; //creates a new aray that contains the X values of the triangle {top middle, bottom left, bottom right} 
        int[] starYPoints = {120,70,120}; //creates a new aray that contains the Y values of the triangle {top middle, bottom left, bottom right}  
        Polygon star = new Polygon(starXPoints,starYPoints,starXPoints.length); //creates a new polygon object called star and uses the two arrays above to get the X and Y points of the corners
        window.setColor(Color.WHITE); //sets the color of the triangle object to green uing the Color() method
        window.fillPolygon(star); //fills the inside of the object tree using the fillPolygon() method
        window.setColor(Color.BLUE); //sets the color of the triangle object to green uing the Color() method
        window.drawPolygon(star); //fills the inside of the object tree using the fillPolygon() method
        
        int[] starXPoints2 = {370,400,430}; //creates a new aray that contains the X values of the triangle {top middle, bottom left, bottom right} 
        int[] starYPoints2 = {90,140,90}; //creates a new aray that contains the Y values of the triangle {top middle, bottom left, bottom right} 
        Polygon star2 = new Polygon(starXPoints2,starYPoints2,starXPoints2.length); //creates a new polygon object called star2 and uses the two arrays above to get the X and Y points of the corners
        window.setColor(Color.WHITE); //sets the color of the triangle object to green uing the Color() method
        window.fillPolygon(star2); //fills the inside of the object tree using the fillPolygon() method
        window.setColor(Color.BLUE); //sets the color of the triangle object to green uing the Color() method
        window.drawPolygon(star2); //fills the inside of the object tree using the fillPolygon() method
       
        int[] starXPoints3 = {370,400,430}; //creates a new aray that contains the X values of the triangle {top middle, bottom left, bottom right} 
        int[] starYPoints3 = {120,70,120}; //creates a new aray that contains the Y values of the triangle {top middle, bottom left, bottom right}  
        Polygon star3 = new Polygon(starXPoints3,starYPoints3,starXPoints3.length); //creates a new polygon object called star and uses the two arrays above to get the X and Y points of the corners
        window.setColor(Color.WHITE); //sets the color of the triangle object to green uing the Color() method
        window.fillPolygon(star3); //fills the inside of the object tree using the fillPolygon() method
    }
}