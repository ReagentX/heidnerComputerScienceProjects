//TetrisGame.java
import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.ArrayList;
import java.awt.Color;
/**
 * This is a clone of the classic Tetris game.
 * The GUI is the standard for GridWorld.
 * It will compile and execute after class TetrisBug is written
 * ...see Question 0
 */
public class TetrisGame {
    /**
     * World variable used for GUI...
     * Initialized to 19x17 Grid for aesthetic viewing.
     * ..leaves some columns at the right for extra game elements
     * like 'upcoming piece' and 'score' information
     */
    public static ActorWorld world = new ActorWorld(new BoundedGrid(19, 17));
    /**
     * A reference to the currently controlled TetrisBlock in the game.
     * Its direction and rotation is controlled by the keyboard arrow keys.
     */
    public static TetrisBlock currentBlock;
    /**
     * The number of lines cleared during a the game
     */
    public static int score;
    public static int randNum;
    /**
     * Handles game simulation and KeyEvent handling
     * NOTE: YOU DO NOT NEED TO WRITE ANY CODE IN THE main
     */
    public static void main(String[] args) {
        //set up world
        for (int i = 0; i < 19; i++) {
            world.add(new Location(i,11),new Rock());
            world.add(new Location(i,0),new Rock());
        }
        nextTetrisBlock();
        //needed code for keyboard event handling
        java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new java.awt.KeyEventDispatcher(){
                public boolean dispatchKeyEvent(java.awt.event.KeyEvent event) {
                    String key = javax.swing.KeyStroke.getKeyStrokeForEvent(event).toString();
                    if (key.equals("pressed UP")){
                        //System.out.println("pressed UP");
                        currentBlock.rotate();

                    }
                    if (key.equals("pressed RIGHT")){
                        //System.out.println("pressed RIGHT");
                        currentBlock.moveRight();

                    }
                    if (key.equals("pressed DOWN")){
                        //System.out.println("pressed DOWN");
                        currentBlock.act();
                    }
                    if (key.equals("pressed LEFT")){
                        //System.out.println("pressed LEFT");
                        currentBlock.moveLeft();

                    }
                    world.show();
                    return true;
                }
            });
        world.show();
    }

    /**
     * Calls removeCompleteRows and chooses a new TetrisBlock at random
     */
    public static void nextTetrisBlock() {
        removeCompleteRows();
        TetrisBlock randomBlock = new TetrisBlockO();//default 2block piece
        //choose random block
        //int randNum = 0;
        //int randNum = (int)(Math.random()*1);//random number between 1 and 7
        //if(randNum < 1)
        //randomBlock = new TetrisBlock();
        //if(randNum == 1)
        //  randomBlock = new TetrisBlockO();

        //if(randNum == 2)
        // randomBlock = new TetrisBlockI();
        //if(randNum == 3)
        // randomBlock = new TetrisBlockT();
        //if(randNum == 4)
        // randomBlock = new TetrisBlockL();
        //if(randNum == 5)
        // randomBlock = new TetrisBlock_L();
        //if(randNum == 6)
        // randomBlock = new TetrisBlockZ();
        //if(randNum == 7)
        // randomBlock = new TetrisBlock_Z();
        currentBlock = randomBlock;
    }

    /**
     * checks each row 1 through 18 (skip row 0) for full rows
     * if a row is full, then remove the actor from each cell in that row
     * and ask each actor located above the just deleted row to act and
     * update the score++
     */
    public static void removeCompleteRows(){
        Grid<Actor> gr = world.getGrid();
        int score = 0;
        int bigCount = 0;
        for(int r = 1; r <=18; r++){
            int count = 0;
            for(int c = 1; c <=10; c++){
                if(gr.get(new Location(r,c)) != null)
                    count++;
            }
            
            if(count==10){                
                bigCount++;
                for(int c = 1; c <= 10; c++){
                    gr.remove(new Location (r,c));                    
                    score++;                   
                }
                for(int nr = 18; nr <=1; nr--){
                    for(int nc = 10; nc <=1; nc--){
                        if(gr.get(new Location(nr,nc)) !=null )
                            //gr.get(new Location(nr,nc)).moveTo(new Location(nr+bigCount,nc));
                            gr.get(new Location(nr,nc)).removeSelfFromGrid();
                    }
                }
            }
        }
        //return -1;
    }
}