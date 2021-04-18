package exerciciosObjeto;

public class cliente {

	public String nome;
	public String CPF;
	public char genero;
	public int idade;
	
	public String tratamento() {
		
		String saida="";
		if(genero == '1') {
			saida = "Sra.";
		}
		else if(genero == '2') {
			saida = "Sr.";
		}
		else if(genero == '3') {
			saida = "Sre.";
		}
		return saida;
	}
}
