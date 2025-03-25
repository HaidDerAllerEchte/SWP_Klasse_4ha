package gameOfLife;

public class GameOfLife {

	public static void main(String[] args) throws InterruptedException{
		Field f = new Field();
		f.randomizeField();
		while(1>0) {
			f.printMatrix();
			f.nextround();
			Thread.sleep(500);
		}

	}

}
