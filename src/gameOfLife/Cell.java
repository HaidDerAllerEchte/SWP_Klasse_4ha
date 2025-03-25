package gameOfLife;

public class Cell {
	
	private boolean alive;
	
	//Randomly creates a living or dead cell
	private boolean randomCell() {
		double d = Math.random();
		if (d>=0.5) {	
			return true;
		}else{
			return false;
		}

	}

	public Cell() {
		this.alive=randomCell();
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	
	public String toString() {
		if(isAlive()) {
			return "X";
		}else {
			return ".";
		}
	}
	
	
}