import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;
import javax.swing.JOptionPane;

public class MinesweeperMain
{
    public static void main() {
        int w,l;
        //Disable tooltips and other annoying things
        System.setProperty("info.gridworld.gui.selection", "hide");
        System.setProperty("info.gridworld.gui.tooltips", "hide");
        System.setProperty("info.gridworld.gui.frametitle", "Minesweeper");
        //w = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer :: "));
        // l = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer :: "));
        //Instantiate minefield

        Object[] possibilities = {"Easy", "Medium", "Hard"};
        String s = (String)JOptionPane.showInputDialog(
                null,
                "Choose your difficulty:\n",
                "Minesweeper",
                JOptionPane.PLAIN_MESSAGE,
                null,
                possibilities,
                "Medium");

        //If a string was returned, say so.
        if ((s != null) && (s == "Easy")) {
           l=8;
           w=8;
        }
        else if ((s != null) && (s == "Medium")) {
           l=15;
           w=15;
        }
        else if((s != null) && (s == "Hard")) {
           l=25;
           w=25;
        }
        else {
           System.out.println("fail"); 
           l=1;
           w=1;
        }
        //If you're here, the return value was null/empty.
        //setLabel("Come on, finish the sentence!");

        MineField field = new MineField(new BoundedGrid<RandomTile>(l,w));

        //Randomly add in tiles
        for (int r = 0; r < field.getGrid().getNumRows(); r++) {
            for (int c = 0; c < field.getGrid().getNumCols(); c++) {
                Location tempLoc = new Location(r, c);
                field.add(tempLoc, new RandomTile(field, tempLoc));
            }
        }

        field.setMessage("Welcome to Minesweeper");

        field.show();
    }
}
