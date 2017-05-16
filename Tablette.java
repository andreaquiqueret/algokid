import java.util.*;
import java.text.*;
import java.lang.*;
import java.io.*;

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

	public Fonction getFonctionPrincipale() {
		return this.principale;
	}

	public ArrayList<Fonction> getFonctions() {
		return this.fonctions;
	}

	public void save() {
		DateFormat dateF = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String path = new String(dateF.format(date));
		ArrayList<Instruction> i = this.principale.getInstructions();
		try {
			PrintWriter w = new PrintWriter(path, "UTF-8");
			for (int k = 0; k < i.size(); k++) {
				Instruction inst = i.get(k);
				if (inst instanceof Action) {
					w.println(((Action)inst).getActionNumber());
				} /*else { // inst instanceof Function (pas dans cette version)
					System.out.println("DEBUG: ENTER ELSE FCT");
					w.print("f:");
					ArrayList<Instruction> sub_inst = ((Fonction)inst).getInstructions();
					for (int l = 0; l < sub_inst.size(); l++) 
						w.print(((Action)sub_inst.get(l)).getActionNumber()+":");
					w.print("\n");	
				}*/
			}
		w.close();
		} catch(IOException e) {
			// ignore. (create the file)
		}
			
	}
	
	public void charger(String path) 
		throws FileNotFoundException, IOException {
		String line;
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		System.out.println("ENTER");
		while ((line = br.readLine()) != null) {
			this.principale.add_action(Integer.parseInt(line), this.pos);
		}
			
	}
	
	public void start() {
		this.principale.executer();

	}
	
	public void stop() {
			Grille.cleanGrille();
	}

	public void creerFonction(String[] fonction) {
		ArrayList<Instruction> instructions = new ArrayList<Instruction>();
		// fonction = tableau qui recup sur l'interface
		for(int i=0; i<fonction.length; i++) { 
			if (Integer.parseInt(fonction[i]) == GAUCHE || 
			    Integer.parseInt(fonction[i]) == DROITE || 
			    Integer.parseInt(fonction[i]) == BAS    || 
			    Integer.parseInt(fonction[i]) == HAUT) {
				instructions.add(new Action(Integer.parseInt(fonction[i])));
			} else {
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
	
	//list unitilisée dans cette version
	public void ajouter_Fonction(String nom){
		for (int j=0; j<fonctions.size(); j++) {
			if (fonctions.get(j).getNom().compareTo(nom)==0)
				principale.add_fonction(fonctions.get(j), pos);
		}		
		pos = -1;
	}
	
	public void retirerFonction(int pos) {
		ArrayList<Instruction> i = this.principale.getInstructions();
		i.remove(pos);
		initialiserPosition(pos);
	}
	
	// test function
	public static void main(String[] args) {
		// test 1 (simple action)
		/*
		Grille g = new Grille();
		Tablette t = new Tablette();	
		g.display(g.cellules);
		t.ajouterAction(HAUT);
		t.ajouterAction(HAUT);
		t.ajouterAction(DROITE);
		t.ajouterAction(HAUT);		
		t.start();
		g.display(g.cellules);
		*/
	
		// test 2 (fonction)
		/*
		Grille g = new Grille();
		Tablette t = new Tablette();
		t.ajouterAction(HAUT);
		String[] fct = {"4","1","4"}; // reçue par la vue
		t.creerFonction(fct);
		t.ajouter_Fonction("X0");
		t.ajouterAction(HAUT);
		t.start();
		g.display(g.cellules);
		g.cleanGrille();
		g.display(g.cellules);
		t.start();
		g.display(g.cellules);	
		*/

		// test 3 (action qui ne commence pas par haut)
		/*
		Grille g = new Grille();
		Tablette t = new Tablette();
		t.ajouterAction(DROITE);
		t.ajouterAction(HAUT);
		t.ajouterAction(HAUT);
		t.ajouterAction(DROITE);
		t.ajouterAction(HAUT);
		t.ajouterAction(HAUT);
		t.start();
		g.display(g.cellules);
		*/

		// test 4 (remplacer une action)
		Grille g = new Grille();
		Tablette t = new Tablette();
		t.ajouterAction(HAUT);
		t.ajouterAction(HAUT);
		String[] fct = {"4","1","4"}; // reçue par la vue
		t.creerFonction(fct);
		t.ajouter_Fonction("X0");
		t.ajouterAction(HAUT);
		t.start();
		g.display(g.cellules);
		g.cleanGrille();
		t.initialiserPosition(1); // appllé depuis la vue
		t.ajouterAction(GAUCHE);
		t.start();
		g.display(g.cellules);
	}	
	
	
	

}

