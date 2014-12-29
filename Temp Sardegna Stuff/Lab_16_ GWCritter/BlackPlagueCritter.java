//© A+ Computer Science  -  www.apluscompsci.com
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

public class BlackPlagueCritter extends Critter
{
    public BlackPlagueCritter()
    {
        setColor(Color.RED);
    }    
    //processActors will turn all Actors around this critter Black
    //unless the Actor is a Rock or another BlackPlagueCritter
    public void processActors(ArrayList<Actor> dudes)
    {
        for (Actor a : dudes){
            if (!(a instanceof Critter)){
                a.setColor(Color.BLACK);
            }
        }
    }
}