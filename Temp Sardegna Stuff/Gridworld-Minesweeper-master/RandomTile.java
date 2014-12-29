import java.awt.Color;
import java.util.*;
import info.gridworld.grid.Location;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.InputEvent;
import java.util.EventObject;
public class RandomTile
{
    private boolean isMine; 
    private MineField mineField;
    private boolean shown = false;
    boolean controlStatus=false;
    private Location cLoc;

    //Initialize RandomTile and determine if it's a mine
    public RandomTile(MineField field, Location loc)
    {
        cLoc = loc;
        mineField = field;
        if (Math.random() > 0.90) {
            isMine = true;
        } else {
            isMine = false;
        }
    }
    //Returns true if this tile is a mine
    public boolean isMine()
    {
        return isMine;
    }
    //Returns true if shown
    public boolean shown() {
        return shown;
    }
    //Sets shown to true allowing getText to do it's job, if it's a mine we call the minefields
    //gameOver() method disabling user input and setting the grid color to red.
    public void show() {
        shown = true;
        if (isMine) {
            mineField.gameOver(false);
        }
    }
    //Returns location of mine
    public Location getLocation() {
        return cLoc;
    }

    //     public int countMines(){
    //         int count = 0;
    //         for (int r = 0; r < mineField.getGrid().getNumRows(); r++) {
    //             for (int c = 0; c < mineField.getGrid().getNumCols(); c++) {
    //                 Location tempLoc = new Location(r, c);
    //                 mineField.get(tempLoc);
    //             }
    //         }
    //         return count;
    //     }
    
    public String flip() {
        return "00";
    }
    
    public int getNeighbs() {
        int count = 0;
        ArrayList<RandomTile> neighborTiles = mineField.getGrid().getNeighbors(getLocation());
        for (RandomTile tile : neighborTiles) {
            if (tile.isMine()) {
                count++;
            }
        }
        return count;
    }
    //Determines what the tile should say
    //If the tile is a mine, we set the text to XX. If it hasn't been clicked we set it to an
    //asterisk. If it has been clicked and isn't a mine, we determine how many mines are around it.
    public String getText() {
        if (shown && isMine == false) {
            int count = 0;
            ArrayList<RandomTile> neighborTiles = mineField.getGrid().getNeighbors(getLocation());
            for (RandomTile tile : neighborTiles) {
                if (tile.isMine()) {
                    count++;
                }
            }
            return (count == 0 ? "" : String.valueOf(count));
        } else if (shown && isMine) {
            return "XX";
        }
        //else if (isControlDown()) {
        //    return "00";
        //}
        else {
            return "*";
        }
    }
}