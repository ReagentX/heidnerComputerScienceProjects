import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.*;
import java.lang.reflect.*;
import javax.swing.JOptionPane; 



public class MineField extends World<RandomTile>
{
    private boolean gameOver = false;
    private Color whiteColor, blackColor;
    //Instantiate minefield and initialize color hack
    public MineField(Grid gr)
    {
        super(gr);
        initGridColorHack();
    }
    //When a mine tile is clicked, call the show method of the RandomTile.
    public boolean locationClicked(Location loc)
    {
        if (gameOver) 
            return true;
        //System.out.println(this.countMines());
             Grid gr = getGrid();
       //RandomTile clickedTile = (RandomTile)this.getGrid().get(loc);
       // int dialogButton = JOptionPane.YES_NO_OPTION;
       // int dialogResult = JOptionPane.showConfirmDialog(null, "Your Message", "Title on Box",dialogButton);
        if (gr.isValid(loc) == true){
            RandomTile clickedTile = (RandomTile)this.getGrid().get(loc);
            if(clickedTile.isMine()){
                clickedTile.show();
                checkIfWon();
            }
            else if(clickedTile.getNeighbs() >= 1){
                clickedTile.show();
                checkIfWon();
            }
            else if (clickedTile.shown()){                
            }
            else {
                if (clickedTile.getNeighbs() == 0){
                    clickedTile.show();
                    int x = loc.getRow();
                    int y = loc.getCol();                
                    locationClicked(new Location(x + 1, y));
                    locationClicked(new Location(x - 1, y));
                    locationClicked(new Location(x, y + 1));
                    locationClicked(new Location(x, y - 1));

                    locationClicked(new Location(x + 1, y+1));
                    locationClicked(new Location(x - 1, y-1));
                    locationClicked(new Location(x-1, y + 1));
                    locationClicked(new Location(x+1, y - 1));
                }
            }
        }

        return true;
    }
    //Determines if the player has won
    private void checkIfWon() {
        boolean finished = false;
        int tilesNotMines = 0;
        int maxTiles = getGrid().getNumCols() * getGrid().getNumRows();
        ArrayList<Location> locations = this.getGrid().getOccupiedLocations();

        for (Location loc : locations) {
            RandomTile tile = (RandomTile)this.getGrid().get(loc);
            if (tile.isMine() == false){ 
                tilesNotMines++;              
            }
        }

        int tilesShown = 0;
        for (Location loc : locations) {
            RandomTile tile = (RandomTile)this.getGrid().get(loc);
            if (tile.shown() && tile.isMine() == false) {
                tilesShown++;
            }
        }

        if (tilesShown == tilesNotMines) {
            gameOver(true);
        }
    }
    //Enables program to change default color values allowing us to modify grid color (Very helpful!); 
    private void initGridColorHack() {
        Field temp;
        try {
            temp = java.awt.Color.class.getDeclaredField("WHITE");
            temp.setAccessible(true);
            whiteColor = (Color) temp.get(null);

            temp = java.awt.Color.class.getDeclaredField("BLACK");
            temp.setAccessible(true);
            blackColor = (Color) temp.get(null);

            setColorProp(whiteColor, 120, 0, 80); //Set grid color to blue (as if it's an ocean)
            setColorProp(blackColor, 255, 255, 255); //Set text color to white for visibility
        } catch (Exception e) {}
    }
    //Sets color of a color using reflection
    //Used from http://pastebin.com/HM4ckaYV by Carter
    private void setColorProp(Color c, int r, int g, int b) {
        int clr = ((255 & 0xFF) << 24) | ((r & 0xFF) << 16) | ((g & 0xFF) << 8) | ((b & 0xFF) << 0);

        try {
            Field nClr = java.awt.Color.class.getDeclaredField("value");
            nClr.setAccessible(true);
            nClr.setInt(c, clr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Disables user input and sets grid color to red
    //Iterates through all tiles, showing them so the user can see tiles with mines
    //boolean determines if the user won or lost
    public void gameOver(boolean win) {
        if (gameOver) return;
        if (win) {
            setMessage("ConGRADUATION! You win!");
            setColorProp(whiteColor, 0, 255, 0);
        } else {
            setMessage("GAME OVER! You lose!");
            setColorProp(whiteColor, 255, 0, 0);
        }
        gameOver = true;

        ArrayList<Location> locations = this.getGrid().getOccupiedLocations();
        for (Location loc : locations) {
            RandomTile tile = (RandomTile)this.getGrid().get(loc);
            tile.show();
        }
    }
}