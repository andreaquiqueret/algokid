public class Grille  {

	public static final int WIDTH = 10;
	public static final int HEIGHT = 10;
	public int cellules[][];
	private Robot r;

	public Grille() {
		this.r = new Robot();
		this.cellules = new int[HEIGHT][WIDTH];
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++)
				this.cellules[i][j] = 0;
		}
		this.cellules[0][WIDTH-1] = 1;
	}

	public Robot getRobot() {
		return this.r;
	}

	//nop ??
	public int[][] getCellules(){
		return this.cellules;
	}

	//TODO: remmettre à 0 si cel == 1 && action == avancer || reculer
	public void updateGrille() {
		int i = this.r.get_i_from_y(this.r.getPosY());
		int j = this.r.get_j_frim_x(this.r.getPosX());
		this.cellules[i][j] = 1;
	}

}
