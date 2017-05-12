public class Grille implements Orientation {

	public static final int WIDTH = 10;
	public static final int HEIGHT = 10;
	public static int cellules[][];
	private static Robot r;

	public Grille() {
		this.r = new Robot();
		this.cellules = new int[HEIGHT][WIDTH];
		for (int i = 0; i < HEIGHT; i++)
			for (int j = 0; j < WIDTH; j++)
				this.cellules[i][j] = 0;
		this.cellules[HEIGHT - 1][0] = 1;
	}

	public Robot getRobot() {
		return this.r;
	}

	/*public int[][] getCellules(){
		return this.cellules;
	}*/

	public void updateGrille(int action) {
		int i = this.r.get_i_from_posY();
		int j = this.r.get_j_from_posX();
		
		if (action == HAUT || action == BAS) {	
			if (this.cellules[i][j] == 0)
				this.cellules[i][j] = 1;
			else 
				this.cellules[i][j] = 0;
		}
	}

}
