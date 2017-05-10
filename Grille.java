public class Grille  {

	private final int width = 10;
	private final int height = 10;
	private static int cellules[][];
	private Robot r;

	public Grille() {
		this.r = new Robot();
		this.cellules = new int[height][width];
		for (int i = 0; i < height; i++)
			for (int j = 0; j < width; j++)
				this.cellules[i][j] = 0;
	}

	}
