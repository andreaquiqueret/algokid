public class Function extends Instruction {
	private ArrayList<Instruction> instructions;
	private String nom;

	public Fonction()
	{
		super();
		this.instructions = new ArrayList<Instruction>();
		this.nom = "Principale";
	}

	public Fonction(ArrayList<Instruction> i, String nom)
	{
		this.instructions = new ArrayList<Instruction>(i);
		this.nom = new String(nom);
	}

	public setInstructions(ArrayList<Instruction> i)
	{
		this.instruction = new ArrayList<Instruction>(i);
	}



	public setNom(String nom)
	{
		this.nom = new String(nom);
	}

	public String getNom()
	{
		return this.nom;
	}

	public void executer()
	{

	}
	
	public void add_fonction(Fonction f, int index)
	{

	}

	public void add_action(int num_action, int index)
	{
	}
}
