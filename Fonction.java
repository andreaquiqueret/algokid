public class Fonction extends Instruction { 
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
		super();
		this.instructions = new ArrayList<Instruction>(i);
		this.nom = new String(nom);
	}

	public Fonction(Fonction f)
	{
		super();
		this.instructions = new ArrayList<Instruction>(f.getInstructions());
		this.nom = new String(f.getNom());
	}

	public setInstructions(ArrayList<Instruction> i)
	{
		this.instruction = new ArrayList<Instruction>(i);
	}

	public setNom(String nom)
	{
		this.nom = new String(nom);
	}
	
	public ArrayList<Instruction> getInstructions()
	{	
		return this.instructions;
	}	
	public String getNom()
	{
		return this.nom;
	}

	public void executer()
	{
		for (int i = 0; i < this.instructions.size(); i++) {
			Instruction i = this.instructions.get(i);
			i.executer();
		}	
	}
	
	public void add_fonction(Fonction f, int index)
	{
		if (index == -1) {
			instruction.add(new Fonction(f));
		} else {
			instruction.remove(index);
			instructions.add(index, new Fonction(f));
		}	

	}

	public void add_action(int num_action, int index)
	{
		if (index == -1) {
			instructions.add(new Action(num_action));
		} else {
			instruction.remove(index);
			instructions.add(index, new Action(num_action))	
		}
	}
}
