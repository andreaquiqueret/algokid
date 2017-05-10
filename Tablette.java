public class Tablette implements Orientation{

	private Fonction principale;
	private ArrayList<Fonction> fonctions;
	private int numfct;
	private int pos;
	
	
	public Tablette() {
		principale = new Fonction();
		fonctions = new ArrayList<Fonction>();
		numfct = 0;
		pos = -1;
	}
	
	public class save() {
		
	}
	
	public class charger() {
		
	}
	
	public void creerFonction(String[]fonction) {

		ArrayList<Instruction> instructions = new ArrayList<Instruction>();
		for(int i=0; i<fonction.length(); i++) { //?? fonction = tableau qui recup sur l'interface
			if (Integer.parseInt(fonction[i])==GAUCHE || Integer.parseInt(fonction[i])==DROITE || Integer.parseInt(fonction[i])==BAS || Integer.parseInt(fonction[i])==HAUT) //d'abbord traduire en action et fonction les numeros
				instructions.add(new Action(Integer.parseInt(fonction[i])));
			else {
				for (int j=0; j<fonctions.size(); j++) {
					if (fonctions.get(j).getNom().compareTo(fonction[i])==0)
						instructions.add(fonctions.get(j));
					
				}
			}
		}
		fonctions.add(new Fonction(instructions, new String("X"+numfct)));
	numfct++;
		
	}
	
	public void initialiserPosition(int p) {
		//des que clic dans interface appeler cette méthode et renvoyer -1 quand clic en dehors de la chenille
		pos = p;
	}
	
	public void ajouterAction(int a) {
		principale.add_action(a, pos);
		pos = -1;
	}
	
	public void ajouterFonction(String nom){
		for (int j=0; j<fonctions.size(); j++) {
			if (fonctions.get(j).getNom().compareTo(fonction[i])==0)
				principale.add_fonction(fonctions.get(j), pos);
		}		
		pos = -1;
	}
	
	public void retirerFonction(int pos) {
		principale.instructions.remove(pos);
	}
	
	

}