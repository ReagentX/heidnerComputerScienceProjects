//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 4/16/14
//Class - Period 5
//Lab  -
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import java.awt.Color;
import java.util.ArrayList;
public class Grub extends Critter
{
    private int maxDistance;    
    public Grub()
    {
        setColor(Color.GREEN);
        maxDistance = 4;
    }

    public int getRandomDirection(){
        return (int) ((Math.random()*8)*45);
    }

    public ArrayList<Location> getMoveLocations()
    {
        Location loc = getLocation();
        ArrayList<Location> result = new ArrayList<Location>();
        int direction = getRandomDirection();
        for (int i = 0; i < maxDistance; i++)
        {
            loc = loc.getAdjacentLocation(direction);
            if (getGrid().isValid(loc))
                result.add(loc);
        }
        return result;
    }

    public Location selectMoveLocation(ArrayList<Location> locs)
    {
        int n = locs.size();
        if (n == 0)
            return getLocation();
        int r = (int) (Math.random() * n);
        Location newLoc = locs.get(r);
        Actor actorAtLoc = getGrid().get(newLoc);
        if (actorAtLoc == null || actorAtLoc instanceof Flower)
            return newLoc;
        else
            return null;
    }
}
