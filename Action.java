public class Action implements Orientation extends Instruction {
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

	public void executer()
	{
		Robot r = Grille.getRobot();
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

		Grille.updateGrille();
	}
}
