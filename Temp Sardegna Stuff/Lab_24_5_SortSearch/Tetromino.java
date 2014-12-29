import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;

public class Tetromino extends Tetris{
	Location loc;
	ArrayList<Location> locations = new ArrayList<Location>();
	Color color;
	String[] types = new String[]{"I" , "J", "L", "O", "S", "T", "Z"};
	int rotation = 0;
	boolean active;
	//ArrayList<String> type = new ArrayList<String>();
	String ID;

	/**
	 * Constructor for controller block
	 * @param s
	 * @param l
	 */
	public Tetromino(String s, Location l){
		if(s.equals("I") || s.equals("J") || s.equals("L") || s.equals("O")
				|| s.equals("S") || s.equals("T") || s.equals("Z")){
			ID = s;
			loc = l;
			locations.add(loc);
			constructLocs();
			setColor();
			active = true;
		}
		else{
			throw new IllegalArgumentException("Block ID not found");
		}
	}
	
	/**
	 * constructor for slave block, inactive
	 * @param col
	 */
	public Tetromino (Color col, Location l){
		ID = "";
		color = col;
		loc = l;
		active = false;
	}
	
	/**
	 * Highlight Tetromino
	 * @param s
	 * @param l
	 * @param a
	 */
	public Tetromino(Tetromino t){
		ID = t.getID();
		setHighlightColors();
		loc = t.getLocation();
		locations = t.getLocations();
	}

	public void setHighlightColors(){
		if(ID.equals("I"))
			color = new Color(255, 153, 153);
		if(ID.equals("J"))
			color = new Color(255, 204, 153);
		if(ID.equals("L"))
			color = new Color(255, 153, 255);
		if(ID.equals("O"))
			color = new Color(153, 153, 255);
		if(ID.equals("S"))
			color = new Color(153, 253, 153);
		if(ID.equals("T"))
			color = new Color(153, 255, 255);
		if(ID.equals("Z"))
			color = new Color(255, 255, 153);
	}
	
	/* adds locations for slave blocks to current block based on ID */
	public void constructLocs() {
		if(ID.equals("I")){
			locations.add(new Location(loc.getRow()+1, loc.getCol()));
			locations.add(new Location(loc.getRow()+2, loc.getCol()));
			locations.add(new Location(loc.getRow()+3, loc.getCol()));
		}
		if(ID.equals("J")){
			locations.add(new Location(loc.getRow()+1 , loc.getCol()+1));
			locations.add(new Location(loc.getRow(), loc.getCol()+1));
			locations.add(new Location(loc.getRow(), loc.getCol()-1));
		}
		if(ID.equals("L")){
			locations.add(new Location(loc.getRow(), loc.getCol()-1));
			locations.add(new Location(loc.getRow()+1, loc.getCol()-1));
			locations.add(new Location(loc.getRow(), loc.getCol()+1));
		}
		if(ID.equals("O")){
			locations.add(new Location(loc.getRow(), loc.getCol()+1));
			locations.add(new Location(loc.getRow()+1, loc.getCol()+1));
			locations.add(new Location(loc.getRow()+1, loc.getCol()));
		}
		if(ID.equals("S")){
			locations.add(new Location(loc.getRow(), loc.getCol()+1));
			locations.add(new Location(loc.getRow()+1, loc.getCol()));
			locations.add(new Location(loc.getRow()+1, loc.getCol()-1));
		}
		if(ID.equals("T")){
			locations.add(new Location(loc.getRow(), loc.getCol()-1));
			locations.add(new Location(loc.getRow(), loc.getCol()+1));
			locations.add(new Location(loc.getRow()+1, loc.getCol()));
		}
		if(ID.equals("Z")){
			locations.add(new Location(loc.getRow()+1, loc.getCol()));
			locations.add(new Location(loc.getRow(), loc.getCol()-1));
			locations.add(new Location(loc.getRow()+1, loc.getCol()+1));
		}
		
	}

	public Color getColor(){
		return color;
	}
	
	/* Sets color of Tetromino based on ID */
	public void setColor(){
		if(ID.equals("I"))
			color = Color.red;
		if(ID.equals("J"))
			color = Color.orange;
		if(ID.equals("L"))
			color = Color.magenta;
		if(ID.equals("O"))
			color = Color.blue;
		if(ID.equals("S"))
			color = Color.green;		
		if(ID.equals("T"))
			color = Color.cyan;		
		if(ID.equals("Z"))
			color = Color.yellow;
	}
	
	public String getID(){
		return ID;
	}
	
	public ArrayList<Location> getLocations(){
		return locations;
	}
	
	public Location getLocation(){
		return loc;
	}
	
	public String toString(){
		//return ID;
		return "";
	}
	
	/* changes master tile and it's locations in such direction */
	public void down() {
		loc = new Location(loc.getRow() + 1, loc.getCol());
		for (int i = 0; i < locations.size(); i++) {
			Location l = locations.get(i);
			locations.set(i, new Location(l.getRow() + 1, l.getCol()));
		}
	}
	
	public void left() {
		loc = new Location(loc.getRow(), loc.getCol() - 1);
		for (int i = 0; i < locations.size(); i++) {
			Location l = locations.get(i);
			locations.set(i, new Location(l.getRow(), l.getCol() - 1));
		}
	}

	public void right(){
		loc = new Location(loc.getRow(), loc.getCol() + 1);
		for (int i = 0; i < locations.size(); i++) {
			Location l = locations.get(i);
			locations.set(i, new Location(l.getRow(), l.getCol() + 1));
		}
	}
	
	public void rotate(){
		if(ID.equals("O"))
				return;
		rotation = incrementedRotation();
		locations.clear();
		loc = rotateLocations(rotation).get(0);
		locations = rotateLocations(rotation);
	}
	
	/* returns ArrayList<Location> of cells if dropped one block */
	public ArrayList<Location> downLocations(){
		ArrayList<Location> down = new ArrayList<Location>();
		for (int i = 0; i < locations.size(); i++) {
			Location l = locations.get(i);
			down.add(i, new Location(l.getRow() + 1, l.getCol()));
		}
		return down;
	}
	
	public ArrayList<Location> leftLocations(){
		ArrayList<Location> left = new ArrayList<Location>();
		for (int i = 0; i < locations.size(); i++) {
			Location l = locations.get(i);
			left.add(i, new Location(l.getRow(), l.getCol()-1));
		}
		return left;
	}
	
	public ArrayList<Location> rightLocations(){
		ArrayList<Location> right = new ArrayList<Location>();
		for (int i = 0; i < locations.size(); i++) {
			Location l = locations.get(i);
			right.add(i, new Location(l.getRow(), l.getCol()+1));
		}
		return right;
	}
	
	/* returns locations if rotated one over based on variable rotate */
	public ArrayList<Location> rotateLocations(int r){
		ArrayList<Location> rotated = new ArrayList<Location>();
		if(ID.equals("L")){
			if(r == 0){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow(), loc.getCol()-1));
				rotated.add(new Location(loc.getRow()+1, loc.getCol()-1));
				rotated.add(new Location(loc.getRow(), loc.getCol()+1));
				return rotated;
			}
			if(r == 90){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow()-1, loc.getCol()-1));
				rotated.add(new Location(loc.getRow()-1, loc.getCol()));
				rotated.add(new Location(loc.getRow()+1, loc.getCol()));
				return rotated;
			}
			if(r == 180){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow()-1, loc.getCol()+1));
				rotated.add(new Location(loc.getRow(), loc.getCol()-1));
				rotated.add(new Location(loc.getRow(), loc.getCol()+1));
				return rotated;
			}
			if(r == 270){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow()-1, loc.getCol()));
				rotated.add(new Location(loc.getRow()+1, loc.getCol()));
				rotated.add(new Location(loc.getRow()+1, loc.getCol()+1));
				return rotated;
			}
		}
		if(ID.equals("J")){
			if(r == 0){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow()+1, loc.getCol()+1));
				rotated.add(new Location(loc.getRow(), loc.getCol()-1));
				rotated.add(new Location(loc.getRow(), loc.getCol()+1));
				return rotated;
			}
			if(r == 90){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow()-1, loc.getCol()));
				rotated.add(new Location(loc.getRow()+1, loc.getCol()));
				rotated.add(new Location(loc.getRow()+1, loc.getCol()-1));
				return rotated;
			}
			if(r == 180){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow(), loc.getCol()+1));
				rotated.add(new Location(loc.getRow(), loc.getCol()-1));
				rotated.add(new Location(loc.getRow()-1, loc.getCol()-1));
				return rotated;
			}
			if(r == 270){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow()-1, loc.getCol()));
				rotated.add(new Location(loc.getRow()-1, loc.getCol()+1));
				rotated.add(new Location(loc.getRow()+1, loc.getCol()));
				return rotated;
			}
		}
		if(ID.equals("I")){
			if(r == 0 || r == 180){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow()+1, loc.getCol()));
				rotated.add(new Location(loc.getRow()+2, loc.getCol()));
				rotated.add(new Location(loc.getRow()+3, loc.getCol()));
				return rotated;
			}
			if(r == 90 || r == 270){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow(), loc.getCol()-1));
				rotated.add(new Location(loc.getRow(), loc.getCol()+1));
				rotated.add(new Location(loc.getRow(), loc.getCol()+2));
				return rotated;
			}
		}
		if(ID.equals("Z")){
			if(r == 0 || r == 180){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow(), loc.getCol()-1));
				rotated.add(new Location(loc.getRow()+1, loc.getCol()));
				rotated.add(new Location(loc.getRow()+1, loc.getCol()+1));
				return rotated;
			}
			if(r == 90 || r == 270){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow()-1, loc.getCol()));
				rotated.add(new Location(loc.getRow(), loc.getCol()-1));
				rotated.add(new Location(loc.getRow()+1, loc.getCol()-1));
				return rotated;
			}
		}
		if(ID.equals("S")){
			if(r == 0 || r == 180){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow(), loc.getCol()+1));
				rotated.add(new Location(loc.getRow()+1, loc.getCol()));
				rotated.add(new Location(loc.getRow()+1, loc.getCol()-1));
				return rotated;
			}
			if(r == 90 || r == 270){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow()-1, loc.getCol()));
				rotated.add(new Location(loc.getRow(), loc.getCol()+1));
				rotated.add(new Location(loc.getRow()+1, loc.getCol()+1));
				return rotated;
			}
		}
		if(ID.equals("T")){
			if(r == 0){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow(), loc.getCol()-1));
				rotated.add(new Location(loc.getRow(), loc.getCol()+1));
				rotated.add(new Location(loc.getRow()+1, loc.getCol()));
				return rotated;
			}
			if(r == 90){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow(), loc.getCol()-1));
				rotated.add(new Location(loc.getRow()+1, loc.getCol()));
				rotated.add(new Location(loc.getRow()-1, loc.getCol()));
				return rotated;
			}
			if(r == 180){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow(), loc.getCol()-1));
				rotated.add(new Location(loc.getRow(), loc.getCol()+1));
				rotated.add(new Location(loc.getRow()-1, loc.getCol()));
				return rotated;
			}
			if(r == 270){
				rotated.add(loc);
				rotated.add(new Location(loc.getRow()-1, loc.getCol()));
				rotated.add(new Location(loc.getRow(), loc.getCol()+1));
				rotated.add(new Location(loc.getRow()+1, loc.getCol()));
				return rotated;
			}	
		}
		/* if no other conditions met, must be a O block */
		return locations;
	}
	
	public int getRotation(){
		return rotation;
	}
	
	public int incrementedRotation(){
		int r = rotation;
		r += 90;
		if(r >= 360){
			r = 0;
		}
		return r;
	}
	
	public void deactivate(){
		active = false;
	}
	
	public boolean isActive(){
		return active;
	}
}
