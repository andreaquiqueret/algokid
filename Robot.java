public class Robot implements Orientation {

	private int posX;
	private int posY;
	private int orientation;

	public Robot() {
		this.posX = 0;
		this.posy = 0;
		this.orientation = HAUT;
	}

	public int getOrientation() {
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
		this.posX = (x >= Grille.WIDTH || x < 0) ? 0 : x ;
	}

	public void setPosY(int y) {
		this.posY = (y >= Grille.HEIGHT || y < 0) ? 0 : y;
	}

}
