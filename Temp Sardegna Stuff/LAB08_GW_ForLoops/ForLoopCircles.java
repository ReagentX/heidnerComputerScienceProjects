//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import info.gridworld.grid.Grid;
import info.gridworld.world.World;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;

public class ForLoopCircles
{
   private World<String> circleWorld;
    private Grid<String> circleGrid;
        
    public ForLoopCircles()
    {
        circleGrid =    new BoundedGrid<String>(1,10);
        circleWorld = new World<String>(circleGrid);
    }
    
    public void drawCircles()
    {
        for (int i=0; i<circleGrid.getNumCols(); i++){
            circleGrid.put(new Location(0,i),"O");
          }

        //add a for loop here
            


        circleWorld = new World<String>(circleGrid);        
    }
    
    public void show()
    {
      circleWorld.setMessage("For Loop Circles World!");                
        circleWorld.show();         
    }
}
