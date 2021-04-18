package entities;

public class Basico extends Estudante {

	private int diaAniversario;
	 
	public Basico(int matricula, String cpf, int diaAniversario);
	 super(matricula, cpf);
	 this.diaAniversario = diaAniversario;
}
