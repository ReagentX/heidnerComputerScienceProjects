// A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 4/23/13
//Class - Period 5
//Lab  -

import info.gridworld.grid.Grid;
import info.gridworld.world.World;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;

import java.awt.Color;

public class AtCounterWorld extends World<String>
{

    public AtCounterWorld()
    {
        super(new BoundedGrid<String>(8,8));
        Grid gr = this.getGrid();
        for (int row = 0; row < gr.getNumRows(); row ++ ){
            for (int col = 0; col < gr.getNumCols(); col ++ ){
                int rand = ((int) (Math.random()*2));
                if (rand == 1)
                    gr.put(new Location(row,col),"@");
                else if (rand == 0)
                    gr.put(new Location(row,col),"-");
            }
        }
        setMessage("Welcome to the At Counter Lab - -  Click an @ to get the count!");
    }

    public boolean locationClicked(Location loc)
    {
        Grid gr = this.getGrid();
        if (gr.get(loc) == "@")
            setMessage("AtCount at " + loc + " is @ " + countAts(loc));
        else if (gr.get(loc) == "-")
            setMessage("AtCount at " + loc + " is - " + countAts(loc));
        return true;
    }

    public int countAts(Location loc)
    {

        Grid gr = this.getGrid();
        if (gr.isValid(loc) == true && gr.get(loc) == "@"){
            setMessage("AtCount at " + loc + " is @ ");
            int x = loc.getRow();
            int y = loc.getCol();
            gr.put(loc,"-");
            countAts(new Location(x + 1, y));
			countAts(new Location(x - 1, y));
			countAts(new Location(x, y + 1));
			countAts(new Location(x, y - 1));
        }
        return 0;
    }
}