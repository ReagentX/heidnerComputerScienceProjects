// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

public class CrazyCritter extends Critter
{
    public CrazyCritter()
    {
        setColor(Color.GREEN);
    }

    //getActors will return all actors around this critter
    //that have the same color as this critter
    public ArrayList<Actor> getActors() {
        ArrayList<Actor> greenNeighbors = getGrid().getNeighbors(getLocation());

        for (int i = greenNeighbors.size() - 1; i >= 0; i--) {
            if (!(this.getColor().equals(greenNeighbors.get(i).getColor()))) {
                greenNeighbors.remove(i);
            }
        }

        return greenNeighbors;
    }

    public void processActors(ArrayList<Actor> actors) {
        for (Actor actor : actors) {
            actor.setDirection(actor.getDirection() + 90);
        }
    }

}
