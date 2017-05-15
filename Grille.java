public class Grille implements Orientation {

	public static final int WIDTH = 10;
	public static final int HEIGHT = 10;
	public int cellules[][];
	public static Robot r;

	public Grille() {
		this.r = new Robot();
		this.cellules = new int[HEIGHT][WIDTH];
		for (int i = 0; i < HEIGHT; i++) 
			for (int j = 0; j < WIDTH; j++)
				this.cellules[i][j] = 0;
		this.cellules[0][WIDTH-1] = 1;
	}

	/*public Robot getRobot() {
		return this.r;
	}

	public int[][] getCellules(){
		return this.cellules;
	}*/

	// imposible car utilise r (mettre ne param la ref vers r ?)
	// pareille pour cellules
	/*
	public static void updateGrille(int action) {
		int i = this.r.get_i_from_posY();
		int j = this.r.get_j_from_posX();
		
		if (action == HAUT || action == BAS) {	
			if (this.cellules[i][j] == 0)
				this.cellules[i][j] = 1;
			else 
				this.cellules[i][j] = 0;
		}
	}
	*/

	public static void updateGrille(int action, int[][] cel, Robot robot) {
		int i = robot.get_i_from_posY();
		int j = robot.get_j_from_posX();
		
		if (action == HAUT || action == BAS) {	
			if (cel[i][j] == 0)
				cel[i][j] = 1;
			else 
				cel[i][j] = 0;
		}
		//tab cel passé par ref ? sinon => return cel and call setCellules ?
	}

}
