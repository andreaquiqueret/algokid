public class Grille  {

	public static final int WIDTH = 10;
	public static final int HEIGHT = 10;
	public static int cellules[][];
	private Robot r;

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

	//nop ??
	public int[][] getCellules(){
		return this.cellules;
	}

	public void updateGrille() {
		int x = this.r.getPosX();
		int y = this.r.getPosY();

		// je suis en train de la faire	
	}

}
