//? A+ Computer Science  -  www.apluscompsci.com
//Name - Chris S
//Date -
//Class -
//Lab  -

import java.util.Arrays;

public class ArrayFunHouseTwoRunner
{
    public static void main( String args[] )
    {
        //add test cases
        int[] one = {1,2,3,4,5,6,7,8,9,10};
        ArrayFunHouseTwo joe = new ArrayFunHouseTwo();
        joe.goingUp(one);
        joe.goingDown(one);
        
        int[] two = {1,2,3,9,11,20,30};
        ArrayFunHouseTwo jim = new ArrayFunHouseTwo();
        jim.goingUp(two);
        jim.goingDown(two);
        
        int[] three = {9,8,7,6,5,4,3,2,0,-2};
        ArrayFunHouseTwo bob = new ArrayFunHouseTwo();
        bob.goingUp(three);
        bob.goingDown(three);
        
        int[] four = {3,6,9,12,15,18,21,23,19,17,15,13,11,10,9,6,3,2,1,0};
        ArrayFunHouseTwo jam = new ArrayFunHouseTwo();
        jam.goingUp(four);
        jam.goingDown(four);
        jam.getCountValuesBiggerThanX(four,7,9);
        jam.getCountValuesBiggerThanX(four,5,15);
    }
}