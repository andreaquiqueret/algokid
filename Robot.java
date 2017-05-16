public class Robot implements Orientation {

	private int posX;
	private int posY;
	private int orientation;

	public Robot() {
		this.posX = 0;
		this.posY = 0;
		this.orientation = HAUT;
	}

	public int getOrientation(){
		return this.orientation;
	}

	public int getPosX() {
		return this.posX;
	}

	public int getPosY() {
		return this.posY;
	}

	public void setOrientation(int o) {
		this.orientation = o;
	}

	public void setPosX(int x) {
		if (x >= Grille.WIDTH)
			this.posX = 0;
		else if (x < 0)
			this.posX = Grille.WIDTH - 1;
		else
			this.posX = x;
	}

	public void setPosY(int y) {
		if (y >= Grille.HEIGHT)
			this.posY = 0;
		else if (y < 0)
			this.posY = Grille.HEIGHT - 1;
		else 
			this.posY = y;
	}
	
	public int get_i_from_posY() {
		return (Grille.HEIGHT - 1) - this.posY;
	}



	public int get_j_from_posX() {
		return this.posX;

	}
}
