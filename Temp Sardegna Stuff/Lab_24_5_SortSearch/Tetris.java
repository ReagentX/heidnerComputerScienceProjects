import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Tetris extends World<Tetromino>{
	static Tetromino activeTile;
	static ArrayList<Tetromino> tiles = new ArrayList<Tetromino>();
	static String[] types = new String[]{"Z" , "J", "L", "O", "S", "T", "I"};
	static int score = 0;
	static boolean gameState = true; //false = lost
	private int cheatPlace;
	private static final String[] cheatCode = {"UP","UP","DOWN","DOWN","LEFT","RIGHT","LEFT","RIGHT","B","A","ENTER"};
	
	public Tetris(){
		this.setGrid(new BoundedGrid<Tetromino>(24,10));
	}
	
	/* includes the setup for playing a game of Tetris */
	public static void play(){
		Tetris game = new Tetris();
		Tetromino  l = getRandomTetromino(new Location(0,4));
		game.add(l);
		activeTile = l;
		game.setMessage("Score: " + score);
		game.show();
	}
	
	/* Sets up lose conditions */
	private void lose(){
		activeTile = null;
		gameState = false;
	}
	
	/* clears the board and tiles */
	private void clearBoard(){
		tiles.clear();
		for(int r = 0; r < getGrid().getNumRows(); r++)
			for(int c = 0; c < getGrid().getNumCols(); c++)
				this.remove(new Location(r, c));
		drawTetromino(activeTile);
	}
	
	/* add but without location parameter, gets location from block */
	private void add(Tetromino t){
		this.add(t.getLocation(), t);
		drawTetromino(t);
		activeTile = t;
	}
	
	/* Draws Tetromino and its locations, also catches lose condition */
	private void drawTetromino(Tetromino t){
		ArrayList<Location> locs = t.getLocations();
		add(t.getLocation(), t);
		for (Location l : locs) {
			if (l != locs.get(0)) {
				try{
					if (getGrid().get(l) != null) 
						throw new SecurityException("Block over another at:" + l.toString());
					}
				catch(SecurityException s){
					lose();
				}
				
				add(l, new Tetromino(t.getColor(), t.getLocation()));
			}
		}
	}
	
	/* returns 0 if nothing is cleared, otherwise, returns the cleared row */
	private int clearLines() {
		for(int r = 0; r < getGrid().getNumRows(); r++){
			ArrayList<Location> row = new ArrayList<Location>();
			for(int c = 0; c < getGrid().getNumCols(); c++){
				row.add(new Location(r, c));
			}
			for(int i = 0; i < row.size(); i++){
				if(getGrid().get(row.get(i)) == null)
					break;
				if(i == row.size() - 1){
					clearLine(r);
					return row.get(0).getRow();
				}
			}
		}
		return -1;
	}
	
	private void clearLine(int row){
		for(int c = 0; c < getGrid().getNumCols(); c++){
			getGrid().remove(new Location(row, c));
		}
		for(int i = 0; i < tiles.size(); i++){
			if(tiles.get(i).getLocation().getRow() == row){
				tiles.remove(i);
				i--;
			}
		}
	}
	
	private boolean checkLocations(ArrayList<Location> locs){
		for(Location l : locs){
			if(!getGrid().isValid(l)){
				return false;
			}
			for(Tetromino t : tiles)
				if(t.getLocation().equals(l))
						return false;
		}
		return true;
	}
	
	/* clears an ArrayList of Locations */
	private void clear(ArrayList<Location> locs){
		for(Location l : locs){
			remove(l);
		}
	}
	
	/* uses drop to move the block locations down, then draws everything. Also handles deactivation */
	private void moveDown(Tetromino t){
		if(checkLocations(t.downLocations())){
			//System.out.println("Drop dat block");
			clear(t.getLocations());
			t.down();
			drawTetromino(t);
		}
		else{
			if(t.isActive()){
				drawAndDeactivate(t);
			}
		}
	}
	
	private void moveLeft(Tetromino t){
		if(checkLocations(t.leftLocations())){
			//System.out.println("Left dat block");
			clear(t.getLocations());
			t.left();
			drawTetromino(t);
		}
	}
	
	private void moveRight(Tetromino t){
		if(checkLocations(t.rightLocations())){
			//System.out.println("Right dat block");
			clear(t.getLocations());
			t.right();
			drawTetromino(t);
		}
	}
	
	private void rotateTile(Tetromino t) {
		if(checkLocations(t.rotateLocations(t.incrementedRotation()))){
			clear(t.getLocations());
			t.rotate();
			drawTetromino(t);
		}
	}
	
	/* Moves everything in tiles (inactive blocks) array down */ 
	private void shiftDownAllTilesAbove(int row){
		ArrayList<Location> locs = new ArrayList<Location>();	
		for(Tetromino t: tiles){
			if(t.getLocation().getRow() <= row){
				locs.add(t.getLocation());
			}
		}
		clear(locs);
		for(int i = 0; i < tiles.size(); i++){
			if(checkLocations(tiles.get(i).downLocations()))
				if(locs.indexOf(tiles.get(i).getLocation()) != -1)
					moveDown(tiles.get(i));
		}
		addAllTiles();
	}
	
	/* draws and deactivates a block, and adds deactivated blocks to tiles*/
	private void drawAndDeactivate(Tetromino t){
		t.deactivate();
		clear(t.getLocations());
		remove(t.getLocation());
		for(Location l : t.getLocations())
			tiles.add(new Tetromino(t.getColor(), l));
		addAllTiles();
		activeTile = null;
	}
	
	/* Draws all the tiles! */
	private void addAllTiles(){
		for(Tetromino t : tiles){
			//System.out.println(t.getLocation().toString());
			drawTetromino(t);
		}
	}
	
	public boolean keyPressed(String description, Location loc) {
		if(activeTile != null){
			if(cheatCode[cheatPlace].equals(description))
				cheatPlace++;
			else
				cheatPlace = 0;
			if(cheatPlace == cheatCode.length){
				clearBoard();
				cheatPlace = 0;
			}
			if (description.equals("UP")) {
				rotateTile(activeTile);
			}
			if (description.equals("DOWN")) {
				moveDown(activeTile);
			}
			if (description.equals("LEFT")) {
				moveLeft(activeTile);
			}
			if (description.equals("RIGHT")) {
				moveRight(activeTile);
			}
			if (description.equals("SPACE")) {
				dropToBottom(activeTile);
				step();
			}
			if (description.equals("F2")) {
				System.out.println(activeTile.getColor().toString());
				System.out.println(activeTile.getLocations().toString());
			}
			if (description.equals("F5")) {
				for(int r = 0; r < getGrid().getNumRows(); r++)
					for(int c = 0; c < getGrid().getNumCols(); c++)
						this.remove(new Location(r, c));
				addAllTiles();
				drawTetromino(activeTile);
			}
		}
		return false;
	}

	/* falls until block cannot drop any more */
	private void dropToBottom(Tetromino t){
		while(t.isActive()){
			moveDown(t);
		}
	}
	
	private static Tetromino getRandomTetromino(Location loc){
		Random r = new Random();
		return new Tetromino(types[r.nextInt(7)], loc);
	}
	
	@SuppressWarnings("unused")
	private static Tetromino getWeightedTetromino(Location loc){
		ArrayList<String> types = new ArrayList<String>();
		types.add("I");
		types.add("O");
		types.add("O");
		types.add("J");
		types.add("J");
		types.add("L");
		types.add("L");
		types.add("Z");
		types.add("Z");
		types.add("S");
		types.add("S");
		types.add("T");
		types.add("T");
		Collections.shuffle(types);
		return new Tetromino(types.get(0), loc);
		
	}
	
	public static void main(String[] args) {
		play();
	}
	
	public void step(){
		if(gameState){
			if(activeTile != null)
				moveDown(activeTile);
			else{
				int lines = 0;
				for(int k = 0; k < getGrid().getNumRows(); k++){
					lines = clearLines();
					if(lines != -1){
						score += 50;
						shiftDownAllTilesAbove(lines);
					}
				}	
				add(getRandomTetromino(new Location(0, 4)));
				//add(getWeightedTetromino(new Location(0, 4)));
				score += 10;
				setMessage("Score: " + score);
			}
		}
		else{
			setMessage("Game Over \nFinal Score: " + score);
		}
	}
	
}
