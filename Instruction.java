public abstract class Instruction {
	private static int numero_instruction = 0;
	private int index; //useless ?
	

	public Instruction()
	{
		this.index = this.numero_instruction++;					
	}

	public Instruction(int i)
	{
		//this.index = i;
	}


	private abstract executer();
}
