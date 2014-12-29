import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.ArrayList;
import java.awt.Color;
/**
 * Write a description of class TetrisBlockO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TetrisBlockO extends TetrisBlock
{   protected int rotationPos;

    protected Grid<Actor> gr;
    public TetrisBlockO() {
        super();
        rotationPos = 0;
        gr = TetrisGame.world.getGrid();

        TetrisBug a;
        a = new TetrisBug(Color.blue);
        a.putSelfInGrid(gr, new Location(0, 6));
        blocks.add(a);

        a = new TetrisBug(Color.green);
        a.putSelfInGrid(gr, new Location(1, 6));
        blocks.add(a);
    }

    public void act(){
        //System.out.println("act is overridden");
        setDirection(180);
        for (TetrisBug tb : blocks)
            tb.setDirection(180);
        if (canMoveDown()) 
            moveDown();
        else {
            if (!TetrisGame.currentBlock.canMoveDown())
                TetrisGame.nextTetrisBlock();
        }
    }

    public void moveDown() {
        super.move();
        blocks.get(2).move();
        blocks.get(0).move();
        blocks.get(1).move();
    }

    public boolean canMoveDown() {
        if (canMove() && blocks.get(2).canMove())
            return true;
        else
            return false;
    }

    public void moveRight() {
        setDirection(90);
        for (TetrisBug tb : blocks)
            tb.setDirection(90);

        if (blocks.get(2).canMove()) {
            
            blocks.get(1).move();
            blocks.get(2).move();
            blocks.get(0).move();
            super.move();

        }

        else if (canMove()) {
            blocks.get(1).move();
            blocks.get(2).move();
            blocks.get(0).move();
            super.move();

        }

    }

    public void moveLeft() {
        setDirection(270);
        for (TetrisBug tb : blocks)
            tb.setDirection(270);

        if (canMove() && blocks.get(0).canMove()) {
            blocks.get(0).move();
            super.move();
            blocks.get(2).move();
            blocks.get(1).move();
        }

        else if (blocks.get(0).canMove()) {
            blocks.get(0).move();
            super.move();
            blocks.get(2).move();
            blocks.get(1).move();               
        }

    }

    public void rotate() {
    }
}
