//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import info.gridworld.grid.Grid;
import info.gridworld.world.World;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;

public class BoxWord 
{
	private Grid<String> charGrid;
   private World<String> charWorld;	
	
	public BoxWord()
	{
		charGrid = 	new BoundedGrid<String>(0,0);
		charWorld = new World<String>(charGrid);
	}

   public BoxWord(String s)
	{
		//add code 
	}
	
	public void show()
	{
      charWorld.setMessage("Fancy Word World!");   	  			
		charWorld.show();			
	}
}