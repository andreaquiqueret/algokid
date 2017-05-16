import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class Grille implements Orientation{

	public static final int WIDTH = 10;
	public static final int HEIGHT = 10;
	public static int cellules[][];
	public static Robot r;

	public Grille() {
		this.r = new Robot();
		this.cellules = new int[HEIGHT][WIDTH];
		for (int i = 0; i < HEIGHT; i++) 
			for (int j = 0; j < WIDTH; j++)
				this.cellules[i][j] = 0;
		this.cellules[HEIGHT - 1][0] = 1;
	}

	public static void updateGrille(int action, int[][] cel, Robot robot) {
		int i = robot.get_i_from_posY();
		int j = robot.get_j_from_posX();

		if (action == HAUT || action == BAS) {	
			if (cel[i][j] == 0)
				cel[i][j] = 1;
			else 
				cel[i][j] = 0;
		}

	}

	public static void cleanGrille() {
		Grille g = new Grille();
		for (int i = 0; i < HEIGHT; i++) 
			for (int j = 0; j < WIDTH; j++)
				g.cellules[i][j] = 0;
		g.cellules[HEIGHT - 1][0] = 1;

	}

	// affichage test 
	public static void display(int[][] cellules){
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++)
				System.out.print(cellules[i][j]);
			System.out.print('\n');
		}
		System.out.print('\n');

	}

}
