public class Action extends Instruction implements Orientation {
	private int action_num;

	public Action()
	{
		super();
	}

	public Action(int n)
	{
		super();
		this.action_num = n;
	}

	public int getActionNumber()
	{
		return this.action_num;
	}

	public void executer()
	{
		Robot r = Grille.r;
		int[][] cel = Grille.cellules;

		int o = r.getOrientation();
		int x = r.getPosX();
		int y = r.getPosY();

		if (action_num == GAUCHE || action_num == DROITE)
			r.setOrientation(action_num);
		
		if (action_num == HAUT) { // avancer
			switch (o) {
			case HAUT: 
				r.setPosY(y + 1);
				break;
			case BAS:
				r.setPosY(y - 1);
				break;
			case GAUCHE:
				r.setPosX(x - 1);
				break;
			case DROITE:
				r.setPosX(x + 1);
				break;
			}
		}

		if (action_num == BAS) { // reculer
			switch (o) {
			case HAUT: 
				r.setPosY(y - 1);
				break;
			case BAS:
				r.setPosY(y + 1);
				break;
			case GAUCHE:
				r.setPosX(x + 1);
				break;
			case DROITE:
				r.setPosX(x - 1);
				break;
			}
		}
 
		Grille.updateGrille(action_num, cel, r);
	}
}
