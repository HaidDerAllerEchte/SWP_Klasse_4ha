package gameOfLife;


public class Field {
    
    private int zeilen = 12; 
    private int spalten = 100; 
    
    // 2D-Array 
    Cell[][] matrix = new Cell[zeilen][spalten];
    
    /**
     * Initializes the playing field with random cells.
     * The border cells are always set as dead.
     */
    public void randomizeField() {
        for (int i = 1; i < zeilen - 1; i++) {
            for (int j = 1; j < spalten - 1; j++) {
                matrix[i][j] = new Cell();
            }
        }
        
        // Sets the border cells to dead
        for (int j = 0; j < spalten; j++) {
            matrix[0][j] = new Cell();
            matrix[0][j].setAlive(false);
            matrix[zeilen - 1][j] = new Cell();
            matrix[zeilen - 1][j].setAlive(false);
        }
        
        for (int i = 0; i < zeilen; i++) {
            matrix[i][0] = new Cell();
            matrix[i][0].setAlive(false);
            matrix[i][spalten - 1] = new Cell();
            matrix[i][spalten - 1].setAlive(false);
        }
    }
    
    /**
     * Calculates the number of living neighbors of a specific cell.
     * @param posz Row position of the cell
     * @param poss Column position of the cell
     * @return Number of living neighbors
     */
    private int nachbarn(int posz, int poss) {
        int nachbar = 0;
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        for (int k = 0; k < 8; k++) {
            int newX = posz + dx[k];
            int newY = poss + dy[k];
            
            if (newX >= 0 && newX < this.zeilen && newY >= 0 && newY < this.spalten) {
                if (matrix[newX][newY].isAlive()) {
                    nachbar++;
                }
            }
        }
        return nachbar;
    }
    
    //Runs a simulation round and updates the status of the cells
    public void nextround() {
        for (int i = 1; i < zeilen - 1; i++) {
            for (int j = 1; j < spalten - 1; j++) {
                int nachbar = nachbarn(i, j);
                
                if (matrix[i][j].isAlive()) {
                    switch (nachbar) {
                        case 0, 1, 4, 5, 6, 7, 8:
                            matrix[i][j].setAlive(false); // Cell dies
                            break;
                        case 2, 3:
                            matrix[i][j].setAlive(true); // Cell stays alive
                            break;
                    }
                } else if (nachbar == 3) {
                    matrix[i][j].setAlive(true); // A new cell is created
                }
            }
        }
    }
    
    //Shows the playing field in the console.
    public void printMatrix() {
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}